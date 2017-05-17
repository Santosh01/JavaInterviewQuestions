package source;

import java.util.Arrays;
import java.util.Comparator;


/**
 * //TODO: DOCUMENT ME!
 *
 * @author //TODO:
 */
public class LongestPhraseString
{
    //~ Methods ----------------------------------------------------------------

    // ~ Methods
    // ----------------------------------------------------------------

    /**
     * //TODO: DOCUMENT ME!
     *
     * @author //TODO:
    *
    * @param inp //TODO: DOCUMENT ME!
    * @param length //TODO: DOCUMENT ME!
    */
    public static void countString( String[] inp, int length )
    {
        Arrays.sort( inp, new Comparator<String>( )
            {
                public int compare( String s1, String s2 )
                {
                    return s1.length( ) - s2.length( );
                }
            } );

        int longestStringLen = 0;
        String longestString = "";

        int secondLongestStringLen = 0;
        String secondLongestString = "";

        int count = 0;
        boolean flag = false;

        for ( int i = inp.length - 1; i >= 0; i-- )
        {
            System.out.println( inp [i] );

            if ( inp [i].length( ) <= length )
            {
                if ( count == 0 )
                {
                    longestStringLen = inp [i].length( );
                    longestString = inp [i];
                }
                else if ( inp [i + 1].length( ) > inp [i].length( ) )
                {
                    if ( flag == false )
                    {
                        secondLongestStringLen = inp [i].length( );
                        secondLongestString = inp [i];
                        flag = true;
                    }
                }

                count++;
            }
        }

        System.out.println( "[" + secondLongestStringLen + " , " +
              longestStringLen + "]" );
        System.out.println( "[" + secondLongestString + " , " + longestString +
              "]" );
    }


    /**
     * //TODO: DOCUMENT ME!
     *
     * @author //TODO:
    *
    * @param args //TODO: DOCUMENT ME!
    */
    public static void main( String[] args )
    {
        String inp = "I love chicken sahg dshd gfd fgvfss";

        String[] inpStr = inp.split( " " );

        countString( inpStr, 5 );
    }
}
