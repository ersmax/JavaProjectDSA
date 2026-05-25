package Chapter1.Project10_Speed;

/**
 * The Speed class contains methods and constants for performing calculations
 * related to speed, distance, and time conversions.
 *
 * It provides utilities to:
 * - Convert distances between kilometers and miles.
 * - Calculate an individual's speed in miles per hour based on distance and time.
 */
public class Speed {
    public static final double KM_PER_MILE = 1.6;
    public static final int SECONDS_HOUR = 3600;

    public static void main(String[] args) {
        int runnerDistance = 14;    //  in Km
        int minutesRun = 45;
        int secondsRun = 30;

        double runnerDistanceMiles = runnerDistance / KM_PER_MILE;
        int totSecondsRun = minutesRun * 60 + secondsRun;
        double hoursRun = totSecondsRun / (double)SECONDS_HOUR;
        double speedMilesHour = runnerDistanceMiles / hoursRun;
        System.out.println("Tot mph = " + speedMilesHour);
    }
}
