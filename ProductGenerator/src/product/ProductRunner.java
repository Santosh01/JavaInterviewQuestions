package product;

import java.io.IOException;
import javax.swing.JOptionPane;


/**
 * <p>This is a runner class which will call the controller class method to get the data
 * from API and to parse it. </p>
 *
 * @author Santosh Kumar
 */
public class ProductRunner extends ProductController
{
    //~ Methods ----------------------------------------------------------------

    /**
     * <p>This method takes user input</p>  
     *
     * @author Santosh Kumar
    *
    * @return upc number
    */
    private static String takeInput( )
    {
        String upcNumber =
            JOptionPane.showInputDialog( "Please Type Product UPC Number" );

        return upcNumber;
    }


    /**
     *<p> Runner method which will run whole application after passing UPC number <b>eg: 753759077600</b> </p>
     *
     * @author Santosh Kumar
    *
    * @param args
    *
    * @throws IOException
    */
    public static void main( String[] args )
      throws IOException
    {
        ProductController pc = new ProductController( );
        String upcNumber = "";

        upcNumber = takeInput( );

        if(!upcNumber.isEmpty()){
        	
        	pc.getHttpResponseData( upcNumber );
        	
        }else{
        	
            JOptionPane.showMessageDialog(null, "You did not enter UPC number", "Invalid Entry", JOptionPane.OK_OPTION);
            
            upcNumber = takeInput( );
            pc.getHttpResponseData( upcNumber );
        }
        

        int input =
            JOptionPane.showConfirmDialog( null, "Do you want to search more?",
                "Confirmation", JOptionPane.YES_NO_OPTION );

        if ( input == JOptionPane.YES_OPTION )
        {
            upcNumber = takeInput( );
            pc.getHttpResponseData( upcNumber );
        }
    }
}
