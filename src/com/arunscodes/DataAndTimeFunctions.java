package com.arunscodes;

import java.util.Date;
import java.util.Scanner;

public class DataAndTimeFunctions {


    public static void main(String[] args) {
        getCurrentDT();

        //Getting user input -- Can be upgraded.
        Scanner scanner = new Scanner(System.in);
        System.out.println(" \n Please enter your date in this format : (YYYY,MM,DD) ");

        //Splitting dates.
        String givenDate = scanner.nextLine();
        String[] splitted = givenDate.split(",");
        int year = Integer.parseInt(splitted[0]);
        int month = Integer.parseInt(splitted[1]);
        int day = Integer.parseInt(splitted[2]);

        //Comparator
        compareDates(new Date(year,month,day));
    }

    public static void getCurrentDT(){
        Date date = new Date();
        System.out.printf("%s %tB %<te, %<tY", "Today's date : ", date);
    }


    public static void compareDates(Date date){
        System.out.println("Comparing: " +date.toString());
        Date date1 = new Date(2021,05,02); // TODO : Check for Date(String)
        int comparator = date.compareTo(date1);

        switch (comparator)
        {
            case -1:
                System.out.println("Given date is before :" +new Date());
                break;
            case 1:
                System.out.println("Given date is after to :" +new Date());
                break;
            case 0:
                System.out.println("Given dates are equal to : "+new Date());
                break;

            default:
                System.out.println("Some issue. :(");
        }
    }
}
