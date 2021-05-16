package com.arunscodes.Basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFunctions {


    public static void main(String[] args) {
        getCurrentDT();

        //Getting user input -- Can be upgraded.

        String cont = "Y";
        String givenDate;

        //Comparator
        while(cont.equals("Y"))
        {
        System.out.println(" \n Please enter your date in this format : (YYYY-MM-DD) ");
        Scanner scanner = new Scanner(System.in);
         givenDate = scanner.nextLine();

        //Parsing string to date:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date givDate = null;

        try {
            givDate = sdf.parse(givenDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Parsing Manually
//        String[] splitted = givenDate.split(",");
//        int year = Integer.parseInt(splitted[0]);
//        int month = Integer.parseInt(splitted[1]);
//        int day = Integer.parseInt(splitted[2]);


            compareDates(givDate);

            System.out.println("Do it again? Y/N");
            cont = scanner.next();
        }

    }

    public static void getCurrentDT(){
        Date date = new Date();
        System.out.printf("%s %tB %<te, %<tY", "Today's date : ", date);
    }


    public static void compareDates(Date date){
        System.out.println("Comparing: " +date.toString());
        Date date1 = new Date();
        int comparator = date1.compareTo(date);

        switch (comparator)
        {
            case 1:
                System.out.println("Given date is before :" +new Date());
                break;
            case -1:
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
