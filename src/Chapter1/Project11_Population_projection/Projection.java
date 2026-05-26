/*
*1.11 (Population projection) The U.S. Census Bureau projects population based on
the following assumptions:
■■ One birth every 7 seconds
■■ One death every 13 seconds
■■ One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume
that the current population is 312,032,486, and one year has 365 days. Hint: In Java,
if two integers perform division, the result is an integer. The fractional part is truncated.
For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate
result with the fractional part, one of the values involved in the division must be
a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */


package Chapter1.Project11_Population_projection;

import java.text.DecimalFormat;

/**
 * The {@code Projection} class calculates and displays the projected population
 * for the next several years based on birth, death, and immigration rates.
 *
 * Key calculations include:
 * - Determining the number of births, deaths, and immigrants that occur in a year
 *   based on specified rates.
 * - Adjusting remaining time until the next event (birth, death, or immigration)
 *   for events that roll over into the next year.
 * - Incrementally updating the current population based on net change for each
 *   year in the studied period.
 */
public class Projection {
    public static final int SECONDS_PER_YEAR = 365 * 24 * 60 * 60;

    public static void main(String[] args) {
        DecimalFormat populationFormatter = new DecimalFormat("#,###");

        // Rates expressed in seconds
        int birthRate = 7, deathRate = 13, immigrantRate = 45;
        int currentPopulation = 312032486;
        int studiedYears = 5;
        // Remaining time to wait for the first event in the new year
        int nextBirthWait = 0, nextDeathWait = 0, nextImmigrantWait = 0;

        for (int year = 0; year < studiedYears; year++) {
            // Deduct the wait time for the first event, count it as 1, and add the rest
            int newBirths = (nextBirthWait == 0 ? 0 : 1) + (SECONDS_PER_YEAR - nextBirthWait) / birthRate;
            int newDeaths = (nextDeathWait == 0 ? 0 : 1) + (SECONDS_PER_YEAR - nextDeathWait) / deathRate;
            int newImmigrants = (nextImmigrantWait == 0 ? 0 : 1) + (SECONDS_PER_YEAR - nextImmigrantWait) / immigrantRate;

            // Calculate the wait time for the event rolling into next year
            nextBirthWait = birthRate - ((SECONDS_PER_YEAR - nextBirthWait) % birthRate);
            nextDeathWait = deathRate - ((SECONDS_PER_YEAR - nextDeathWait) % deathRate);
            nextImmigrantWait = immigrantRate - ((SECONDS_PER_YEAR - nextImmigrantWait) % immigrantRate);

            // Next year we don't have time left for the first event, so we reset it to 0
            if (nextBirthWait == birthRate) nextBirthWait = 0;
            if (nextDeathWait == deathRate) nextDeathWait = 0;
            if (nextImmigrantWait == immigrantRate) nextImmigrantWait = 0;

            currentPopulation += newBirths - newDeaths + newImmigrants;
            System.out.print("Year " + (year + 1) + ": ");
            System.out.println(populationFormatter.format(currentPopulation));
        }
    }
}
