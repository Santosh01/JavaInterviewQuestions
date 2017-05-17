package product;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 * <p>This is Controller class which can:
 *    <li>Populates Product DTOs </li>
 * <li>Fetch the data from DEV API </li>
 * <li>Parse the HTTP response a</li>
 * <li>Displays data in user readable format</li>
 *  </p>
 *
 * @author Santosh Kumar
 *
 */
public class ProductController implements ProductConstants
{
    //~ Methods ----------------------------------------------------------------

    /**
     * <p>This method populates product DTO object for each items in the XML response.</p>
     *
     * @author Santosh Kumar
    *
    * @param currentPrice
    * @param shippingCharges
    * @param totalCharges
    * @param productName
    *
    * @return product DTO object
    */
    private ProductDTO populateProductDTO( float currentPrice,
        float shippingCharges, float totalCharges, String productName )
    {
        ProductDTO productDTO = new ProductDTO( );
        productDTO.setProductName( productName );
        productDTO.setCurrentPrice( currentPrice );
        productDTO.setShippingCharges( shippingCharges );
        productDTO.setTotalCharges( totalCharges );

        return productDTO;
    }


    /**
     * <p>This method get the data from the API</p>
     *
     * @author Santosh Kumar
    *
    * @param upcNumber
    *
    * @throws IOException
    */
    public void getHttpResponseData( String upcNumber )
      throws IOException
    {
        URL url =
            new URL( EBAY_DEV_API_LINK + upcNumber + EBAY_DEV_API_LINK_FILTER );
        HttpURLConnection connection =
            ( HttpURLConnection )url.openConnection( );
        connection.setRequestMethod( "GET" );
        connection.setRequestProperty( "Accept", "application/xml" );

        int responseCode = connection.getResponseCode( );

        if ( responseCode == HttpURLConnection.HTTP_OK )
        {
            try
            {
                InputStream xml = connection.getInputStream( );
                DocumentBuilderFactory dbf =
                    DocumentBuilderFactory.newInstance( );
                DocumentBuilder db = dbf.newDocumentBuilder( );
                Document doc = db.parse( xml );

                doc.getDocumentElement( ).normalize( );

                NodeList nodeList = doc.getElementsByTagName( "item" );
                this.parseHttpResponse( nodeList, upcNumber );
            }
            catch ( ParserConfigurationException ex )
            {
                ex.printStackTrace( );
            }
            catch ( SAXException ex )
            {
                ex.printStackTrace( );
            }
            catch ( IOException ex )
            {
                ex.printStackTrace( );
            }
        }
        else
        {
            System.out.println( "GET request not worked" );
        }
    }


    /**
     * <p>This method parses the HTTP response and get the product name , prices and shipping charages from the rendered XML response.</p>
     *
     * @author Santosh Kumar
    *
    * @param nodeList
    *
    * @throws IOException
    * @throws SAXException
    */
    private void parseHttpResponse( NodeList nodeList, String upcNumber )
      throws IOException, SAXException
    {
        List<ProductDTO> productDTOList = new ArrayList<ProductDTO>( );
        ProductDTO productDTO = null;

        if ( nodeList != null )
        {
            float currentPrice = 0;
            float shippingCharges = 0;
            float totalCharges = 0;
            String productName = "";

            for ( int number = 0; number < nodeList.getLength( ); number++ )
            {
                Node node = nodeList.item( number );

                if ( node.getNodeType( ) == Node.ELEMENT_NODE )
                {
                    Element eElement = ( Element )node;

                    if (
                        eElement.getElementsByTagName( "title" ).item( 0 )
                          .getTextContent( ) != null )
                    {
                        productName =
                            eElement.getElementsByTagName( "title" ).item( 0 )
                              .getTextContent( );
                    }

                    if (
                        eElement.getElementsByTagName( "currentPrice" ).item(
                              0 ).getTextContent( ) != null )
                    {
                        currentPrice =
                            Float.parseFloat( eElement.getElementsByTagName(
                                    "currentPrice" ).item( 0 )
                                  .getTextContent( ) );
                    }

                    if (
                        eElement.getElementsByTagName( "shippingServiceCost" )
                          .item( 0 ) != null )
                    {
                        shippingCharges =
                            Float.parseFloat( eElement.getElementsByTagName(
                                    "shippingServiceCost" ).item( 0 )
                                  .getTextContent( ) );
                    }

                    totalCharges = currentPrice + shippingCharges;
                }

                productDTO =
                    this.populateProductDTO( currentPrice, shippingCharges,
                        totalCharges, productName );

                productDTOList.add( productDTO );
            }
        }

        this.printProduct( productDTOList, nodeList.getLength( ), upcNumber );
    }


    /**
     * <p>This method print the response in user readable format.</p>
     *
     * @author Santosh Kumar
    *
    * @param productList
     * @throws IOException
    */
    private void printProduct( List<ProductDTO> productList, int itemsCount,
        String upcNumber )
      throws IOException
    {
        if ( !productList.isEmpty( ) )
        {
            Iterator<ProductDTO> itr = productList.iterator( );

            FileOutputStream f =
                new FileOutputStream(
                    "..//ProductGenerator//src//product//log//Product(" +
                      upcNumber + ").txt" );
            System.setOut( new PrintStream( f ) );

            System.out.println( "Total items retrieved: " + itemsCount );
            System.out.println(
                "**Items are sorted in ascending order on 'Total Charges'" );
            System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
            System.out.printf( "%5s %50s %45s %23s %35s", "No of records",
                "Product Name", "Current Price", "Shipping charges",
                "Total Charges(Current + Shipping)" );
            System.out.println( );
            System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------" );

            String format =
                "| %1$-8d | %2$-80s  | %3$-20.2f | %4$-10.2f \t| %5$-20.2f |\n";
            int countItems = 0;

            while ( itr.hasNext( ) )
            {
                ProductDTO productDTO = ( ProductDTO )itr.next( );
                countItems++;

                System.out.format( format, countItems,
                    productDTO.getProductName( ), productDTO.getCurrentPrice( ),
                    productDTO.getShippingCharges( ),
                    productDTO.getTotalCharges( ) );
            }

            System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
            f.close( );
            ps.println(
                "Product log file Generated(ProductGenerator/src/product/log/Product-log.txt)..." );
            ps.println( "Please refresh log directory.." );
        }
        else
        {
            throw new IOException(
                "Error 404: Unable to fetch any record for UPC number: " +
                  upcNumber );
        }
    }

    //~ Static variables -------------------------------------------------------

    private static PrintStream ps = System.out;
}
