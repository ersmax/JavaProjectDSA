*1.11 (Population projection) 
-
The U.S. Census Bureau projects population based on
the following assumptions:
- One birth every 7 seconds
- One death every 13 seconds
- One new immigrant every 45 seconds

Write a program to display the population for each of the next five years. Assume
that the current population is 312,032,486, and one year has 365 days. Hint: In Java,
if two integers perform division, the result is an integer. The fractional part is truncated.
For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate
result with the fractional part, one of the values involved in the division must be
a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.

---

### Logic for Carrying Over Leftover Seconds

A standard year has 31,536,000 seconds (365 days). 
This total is not perfectly divisible by the event rates (7, 13, and 45 seconds). 
For example, if you divide the year's total seconds by 7, there is a leftover remainder at the end of the year. 
This means the final birth of that year occurred slightly before the year ended, 
and the next birth will happen slightly *into* the new year.

To maintain perfect accuracy across multiple consecutive years, the program uses a carry-over mechanism:

1. **Calculate Next Wait Time**: 
   
   At the close of a year, the program checks how many seconds have passed since the last event using the modulo remainder (`%`). 
   It subtracts this remainder from the event rate (e.g., `7 - remainder`) to find the exact "wait time" (in seconds) needed at the start of the next year before the next event triggers.
2. **Deduct at New Year**: 
   
   In the following year loop, the wait time is immediately deducted from the total seconds of that year, and counted as `1` complete event.
3. **Calculate the Rest**: 
 
   The remaining seconds of the year (after that first deduction) are then divided normally by the event rate.

This approach guarantees that the exact schedule of every 7, 13, or 45 seconds spans flawlessly across New Year boundaries without rounding errors or lost fractional time.

