# Projects - Introduction to Java Programming and Data Structures 12th edition

This repository contains my personal solutions to projects to practice Java 11.

---

To compile inside the source program or source code folder:
```bash
PS D:\Java\JavaProjectDSA\JavaProjectDSA\src\Chapter1\Project01_Greetings> javac Greetings.java
```
To compile inside the main folder:
```bash
PS D:\Java\JavaProjectDSA\JavaProjectDSA\src> javac Chapter1/Project01_Greetings/Greetings.java
```

To run the compiled class (run the bytecode or object code) from the source program folder:
```bash
PS D:\Java\JavaProjectDSA\JavaProjectDSA\src\Chapter1\Project01_Greetings> java -classpath ../.. Chapter1.Project01_Greetings.Greetings
```
or use the abbreviation `-cp`
```bash
PS D:\Java\JavaProjectDSA\JavaProjectDSA\src\Chapter1\Project01_Greetings> java -cp ../.. Chapter1.Project01_Greetings.Greetings
```

To run the compiled class from the main folder:
```bash
PS D:\Java\JavaProjectDSA\JavaProjectDSA\src> java Chapter1.Project01_Greetings.Greetings
```

To enable assertions:
```bash
PS D:\Java\JavaProjectDSA\JavaProjectDSA\src> java -enableassertions Chapter1.Project01_Greetings.Greetings
```
or use the abbreviation `-ea`
```bash
PS D:\Java\JavaProjectDSA\JavaProjectDSA\src> java -ea Chapter1.Project01_Greetings.Greetings
```
---

##### Chapter 1 – Introduction to Computers, Programs and Java

1. [Display three messages](src/Chapter1/Project01_Greetings/Greetings.java) - Write a program that displays "Welcome to Java", "Welcome to Computer Science", and "Programming is fun".
2. [Display five messages](src/Chapter1/Project02_Repeated_greetings/Greetings.java) - Write a program that displays "Welcome to Java" five times.
3. [Display a pattern](src/Chapter1/Project03_Java_pattern/Pattern.java) - Write a program that displays a letter pattern (J A V A) as shown in the project README.
4. [Print a table](src/Chapter1/Project04_PowerOf/PowerOf.java) - Display a table of a, a^2, and a^3 for a = 1..4.
5. [Compute expressions](src/Chapter1/Project05_Expression/Expression.java) - Display the result of (9.5 * 4.5 - 2.5 * 3 ) / (45.5 - 3.5).
6. [Summation of a series](src/Chapter1/Project06_Series/Series.java) - Compute and display 1 + 2 + ... + 9.
7. [Approximate p](src/Chapter1/Project07_PI/PI.java) - Compute approximations of pi using the series 4*(1 - 1/3 + 1/5 - ...).
8. [Area and perimeter of a circle](src/Chapter1/Project08_Circle_area/Circle.java) - Compute area and perimeter for a circle with radius 5.5.
9. [Area and perimeter of a rectangle](src/Chapter1/Project09_Rectangle_area/Rectangle.java) - Compute area and perimeter for a rectangle with width 4.5 and height 7.9.
10. [Average speed in miles](src/Chapter1/Project10_Speed/Speed.java) - Given 14 kilometers in 45 minutes 30 seconds, compute average speed in miles/hour (1 mile = 1.6 km).
11. [Population projection](src/Chapter1/Project11_Population_projection/Projection.java) - Project population for the next five years using event rates: one birth every 7s, one death every 13s, one immigrant every 45s (current population 312,032,486).
12. [Average speed in kilometers](src/Chapter1/Project12_Speed_miles/Speed.java) - Given 24 miles in 1 hour 40 minutes 35 seconds, compute average speed in km/h (1 mile = 1.6 km).
13. [Algebra: solve 2 * 2 linear equations](src/Chapter1/Project13_Linear_Equations/Equations.java) - Solve a 2x2 linear system using Cramer's rule and display x and y for the provided coefficients.
