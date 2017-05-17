package product;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author Santosh Kumar
 */
public class ProductDTO
{
    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new ProductDTO object.
    */
    public ProductDTO( )
    {
    }

    //~ Methods ----------------------------------------------------------------

    /**
     * @return current price
    */
    public float getCurrentPrice( )
    {
        return currentPrice;
    }


    /**
     *
    * @param currentPrice 
    */
    public void setCurrentPrice( float currentPrice )
    {
        this.currentPrice = currentPrice;
    }


    /**
    *
    * @return shipping charges
    */
    public float getShippingCharges( )
    {
        return shippingCharges;
    }


    /**
    * @param shippingCharges
    */
    public void setShippingCharges( float shippingCharges )
    {
        this.shippingCharges = shippingCharges;
    }


    /**
    *
    * @return total charges which includes shipping and current product amount
    */
    public float getTotalCharges( )
    {
        return totalCharges;
    }


    /**
     *
    * @param totalCharges 
    */
    public void setTotalCharges( float totalCharges )
    {
        this.totalCharges = totalCharges;
    }


    /**
    * @return the list of the product
    */
    public List<ProductDTO> getProductList( )
    {
        return productList;
    }


    /**
      * @param productList 
    */
    public void setProductList( List<ProductDTO> productList )
    {
        this.productList = productList;
    }


    /**
     *
    * @return the product DTO object
    */
    public ProductDTO getProductDTO( )
    {
        return productDTO;
    }


    /**
    *
    * @param productDTO 
    */
    public void setProductDTO( ProductDTO productDTO )
    {
        this.productDTO = productDTO;
    }


    /**
     *
    * @return product name object
    */
    public String getProductName( )
    {
        return productName;
    }


    /**
    *
    * @param productName 
    */
    public void setProductName( String productName )
    {
        this.productName = productName;
    }

    //~ Instance variables -----------------------------------------------------

    private float currentPrice;
    private float shippingCharges;
    private float totalCharges;
    private String productName;

    private List<ProductDTO> productList = new ArrayList<ProductDTO>( );
    private ProductDTO productDTO;
}
