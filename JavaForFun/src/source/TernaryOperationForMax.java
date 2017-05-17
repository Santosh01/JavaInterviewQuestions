package source;

/**
 * //TODO: DOCUMENT ME!
 *
 * @author //TODO:
 */
public class TernaryOperationForMax
{
    //~ Methods ----------------------------------------------------------------

    public static void main( String[] args )
    {
        int[] inp = { 1, 1, 100 };

        int temp = 0;

        for ( int i = 0; i < inp.length; i++ )
        {
            temp = ( inp [i] > temp ) ? inp [i] : ( temp = 0 );
        }

        System.out.println( temp );
    }
}
