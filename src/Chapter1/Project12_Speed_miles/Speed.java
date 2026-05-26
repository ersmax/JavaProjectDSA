package Chapter1.Project12_Speed_miles;

import java.text.DecimalFormat;

/**
 * The Speed class calculates and displays the average speed
 * in kilometers per hour for a given distance run and duration.
 */
public class Speed {
    public static final double KM_PER_MILE = 1.6;
    public static final int SECONDS_HOUR = 3600;

    /**
     * Calculates the average speed of a runner in kilometers per hour
     *
     * @param args The command-line arguments, not used in this method.
     */
    public static void main(String[] args) {
        int givenDistance = 24; // in miles
        int hoursRun = 1;
        int minutesRun = 40;
        int secondsRun = 35;

        double totDistanceKm = (double)givenDistance * KM_PER_MILE;
        int totSecondsRun = hoursRun * SECONDS_HOUR + minutesRun * 60 + secondsRun;
        double totHoursRun = (double)totSecondsRun / SECONDS_HOUR;
        double speed = totDistanceKm / totHoursRun;

        DecimalFormat formatter = new DecimalFormat("#.##");
        System.out.println("Speed: " + formatter.format(speed) + " km/h");
    }
}
