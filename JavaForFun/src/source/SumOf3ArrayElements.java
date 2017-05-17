package source;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class SumOf3ArrayElements
{
    //~ Methods ----------------------------------------------------------------


    int[] processArray( int[] inpArr, int x )
    {
        Arrays.sort( inpArr );

        ArrayList<Integer> a = new ArrayList<Integer>( );

        for ( int i = 0; i < inpArr.length; i++ )
        {
            if ( ( inpArr [i] < x ) && ( inpArr [i] != 0 ) )
            {
                a.add( inpArr [i] );
            }
        }

        int[] newArr = new int[a.size( )];

        for ( int i = 0; i < a.size( ); i++ )
        {
            newArr [i] = a.get( i );
        }

        return newArr;
    }


    boolean tripletSum( int[] a, int x )
    {
        a = processArray( a, x );

        int indx, tempSum;
        indx = tempSum = 0;

        boolean foundTriplet = false;

        for ( int i = a.length - 1; i >= ( a.length / 2 ); i-- )
        {
            for ( int j = 0; j <= ( a.length / 2 ); j++ )
            {
                if ( indx <= 2 )
                {
                    tempSum += a [j];
                    indx++;
                }

                if ( indx == 2 )
                {
                    tempSum += a [i];

                    if ( tempSum == x )
                    {
                        foundTriplet = true;

                        break;
                    }
                    else
                    {
                        tempSum = 0;
                        indx = 0;
                        j--;
                    }
                }
            }
        }

        System.out.println( foundTriplet );

        return foundTriplet;
    }


    public static void main( String[] args )
    {
        SumOf3ArrayElements sum = new SumOf3ArrayElements( );

        int[] arr1 =
            {
                142, 712, 254, 869, 548, 645, 663, 758, 38, 860, 724, 742, 530,
                779, 317, 36, 191, 843, 289, 107, 41, 943, 265, 649, 447, 806,
                891, 730, 371, 351, 7, 102, 394, 549, 630, 624, 85, 955, 757,
                841, 967, 377, 932, 309, 945, 440, 627, 324, 538, 539, 119, 83,
                930, 542, 834, 116, 640, 659, 705, 931, 978, 307, 674, 387, 22,
                746, 925, 73, 271, 830, 778, 574, 98, 513
            };
        // int[] arr = { 7, 22, 36, 38, 41, 73, 83, 85, 98, 102, 107, 116, 119,
        // 142 };
        // int[] arr = {1, 1, 2, 5, 3 };
        // int[] arr = { 2, 3, 1 };

        int[] arr =
            {
                61, 719, 754, 140, 424, 280, 997, 688, 530, 550, 438, 867, 950,
                194, 196, 298, 417, 287, 106, 489, 283, 456, 735, 115, 702, 317,
                672, 787, 264, 314, 356, 186, 54, 913, 809, 833, 946, 314, 757,
                322, 559, 647, 983, 482, 145, 197, 223, 130, 162, 536, 451, 174,
                467, 45, 660, 293, 440, 254, 25, 155, 511, 746, 650, 187, 314,
                475, 23, 169, 19, 788, 906, 959, 392, 203, 626, 478, 415, 315,
                825, 335, 875, 373, 160, 834, 71, 488, 298, 519, 178, 774, 271,
                764, 669, 193, 986, 103, 481, 214, 628, 803, 100, 528, 626, 544,
                925, 24, 973, 62, 182, 4, 433, 506, 594
            };

        Scanner sc = new Scanner( System.in );
        System.out.println( "Enter Triplet Sum Number: " );

        int x = Integer.parseInt( sc.nextLine( ) );

        sum.tripletSum( arr, x );
    }
}
