/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */

import java.util.*;

public class Exercise12 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        String prin = in.nextLine();
        double principal = Double.parseDouble(prin);

        System.out.print("Enter the rate of interest: ");
        String ra = in.nextLine();
        double rate = Double.parseDouble(ra);
        rate /= 100;

        System.out.print("Enter the number of years: ");
        String year = in.nextLine();
        double years = Double.parseDouble(year);

        System.out.printf("After %.0f years at %.2f%%, the investment will be worth $%.2f.", years, rate * 100, (principal * (1 + (rate * years))));

    }
}
