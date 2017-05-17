package source;

import static java.lang.System.out;


/**
 * 
 *
 * @author 
 */
public class MilitaryTimeConversion
{
    //~ Methods ----------------------------------------------------------------

    void timeConversion( String time )
    {
        String[] totalTime = null;
        boolean amFound = false;
        boolean pmFound = false;
        int hoursConversion = 0;

        if ( time.contains( AM_STANDARD ) )
        {
            totalTime = time.replaceAll( AM_STANDARD, "" ).split( ":" );
            amFound = true;
        }
        else if ( time.contains( PM_STANDARD ) )
        {
            totalTime = time.replaceAll( PM_STANDARD, "" ).split( ":" );
            pmFound = true;
        }

        if ( amFound )
        {
            System.out.println( printTime( totalTime, amFound, pmFound ) );
        }
        else if ( pmFound )
        {
            hoursConversion = Integer.parseInt( totalTime [0] ) + 12;
            totalTime [0] = String.valueOf( hoursConversion );
           out.println( printTime( totalTime, amFound, pmFound ) );
        }
    }


    String printTime( String[] time, boolean amFound, boolean pmFound )
    {
        String militaryHoursTime = "";
        int count = time.length - 1;

        for ( String t : time )
        {
            if ( amFound )
            {
                if ( count != 0 )
                {
                    militaryHoursTime += t + ":";
                }
                else
                {
                    militaryHoursTime += t + "AM";
                }

                count--;
            }
            else if ( pmFound )
            {
                if ( count != 0 )
                {
                    militaryHoursTime += t + ":";
                }
                else
                {
                    militaryHoursTime += t + "PM";
                }

                count--;
            }
        }

        return militaryHoursTime;
    }


    public static void main( String[] args )
    {
        MilitaryTimeConversion t = new MilitaryTimeConversion( );

        String time = "3:30:00PM";

        t.timeConversion( time );
    }

    //~ Static variables -------------------------------------------------------

    private static String PM_STANDARD = "PM";
    private static String AM_STANDARD = "AM";
}
