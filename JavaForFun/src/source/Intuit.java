package source;

import java.util.Scanner;


/**
 * <p>
 *	Intuit Interview Question
 *
 * </p>
 *
 * @author Santosh Dubey
 *
 */
public class Intuit
{
    //~ Methods ----------------------------------------------------------------

    /**
     * <p>
     *The program must process a single String as input. Given that input, the
     *program must output:
    * - The count of “words” in the String
    * Words are defined as any consecutive sequence of non-whitespace characters,
    * separated by any amount of whitespace
    *
    * - The count of non-whitespace characters in the String
    *
    * - Breakdown of all the unique characters and their occurrence counts,
    * reported in the order those characters first occurred
    *
    * Example, for an input String of: “Abracadabra      Alakazam!!” is shown below.
    *
    * Word count = 2
    *  Non-whitespace character count = 21
     * </P>
     *
    * @param
    */
    void findStringOccurances( String inpString )
    {
        System.out.println( "======================\n" );

        StringBuilder storeStringTemp = new StringBuilder( inpString );

        System.out.println( "Word count = " + inpString.split( "\\s+" ).length +
              "\n" );

        System.out.println( "Non-whitespace character count = " +
              inpString.replace( " ", "" ).length( ) + "\n" );

        System.out.println(
            "Unique breakdown of all characters in order they appeared...\n" );

        while ( storeStringTemp.length( ) != 0 )
        {
            int countOccur = 0;
            char tempChar = storeStringTemp.charAt( 0 );

            while ( storeStringTemp.indexOf( tempChar + "" ) != -1 )
            {
                storeStringTemp.deleteCharAt( storeStringTemp.indexOf(
                        tempChar + "" ) );
                countOccur++;
            }

            System.out.println( tempChar + ": " + countOccur );
        }
    }


    public static void main( String[] args )
    {
        Intuit in = new Intuit( );

        Scanner inp = new Scanner( System.in );
        String strInp;

        System.out.println( "Enter the string:" );
        strInp = inp.nextLine( );
        in.findStringOccurances( strInp );
    }
}
