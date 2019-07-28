//Dana Kallunki
//edx program 1 java class 07-26-2019

import java.util.Scanner;
import java.math.*;

public class vacationPlanner {

    public static void main(String[] args){

        intro();
        budget();
        timeZone();
        countryArea();
        hackerProblem();

    }

    public static void intro(){
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name?  ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + " , Where are you traveling to? ");
        String destination = input.nextLine();
        System.out.println("GREAT! " + destination + " sounds like a great trip.");
        System.out.println("     *****************************************************************************");
    }
        public static void budget(){
            Scanner input = new Scanner (System.in);
            System.out.print("How many days are you going to be traveling? ");
            int timeOnVacation = input.nextInt();
            System.out.print("How much money, in USD, are you planning to spend on your trip? ");
             double moneyToSpend = input.nextDouble();
            System.out.print("What is the three letter currency symbol for your travel destination? ");
            String currencySymbol = input.next();
            System.out.print("How many " + currencySymbol + " are there in 1 USD? ");
            double conversion = input.nextDouble();

            System.out.print("If you are traveling ");
            System.out.print(timeOnVacation + " days that is the same as " + (timeOnVacation * 24 ) + " hours or ");
            System.out.println((timeOnVacation * 24 *60 )+ " minutes.");
            System.out.print("If you are going to spend " +( double)( (int)(moneyToSpend *100)/100.0)+ " USD, that means per day you can spend $");
            System.out.println((double) ((int)(moneyToSpend/timeOnVacation*100 )/100.0) + " USD.");
            System.out.print("Your total budget in " + currencySymbol+ " is $" + (double)((int)(moneyToSpend * conversion * 100)/100.0) + " " + currencySymbol);
            System.out.println(" , which per day is $" + (double) ((int)(moneyToSpend * conversion )/timeOnVacation*100/100.0) + " " +currencySymbol +".");
            System.out.println("     *****************************************************************************");
            //(float)((int)(budget/no_of_days*100))/100.0
        }
        public static void timeZone(){
            Scanner input = new Scanner (System.in);
            System.out.print("What is the time difference, in hours, between your home and your destination? ");
            int hoursDifference = input.nextInt();
            hoursDifference = hoursDifference % 24;
            int noon=0;
            if (hoursDifference >= 12) {
                noon = hoursDifference%12;
            }
                else{ noon =hoursDifference +12;}

            System.out.print("That means when it is midnight at home it will be " + (hoursDifference %24));
            System.out.println( ":00 in your travel destination.");
            System.out.println("When is is noon it will be " + (noon ) +":00." );


            System.out.println("     *****************************************************************************");
        }

        public static void countryArea(){

            Scanner input = new Scanner(System.in);
            System.out.print("What is the square area of your destination? country in km ^2? ");
            double sqAreaKM = input.nextDouble();
            System.out.println("In miles squared that is " + (double) ((int)(sqAreaKM * 0.62137*100)/100.0) );

            System.out.println("     *****************************************************************************");

        }

            public static void hackerProblem(){
                 double R =   6372.8;
                 // get user input
                Scanner input = new Scanner (System.in);
                System.out.print("Please enter your home Latitude: ");
                 double homeLat = input.nextDouble();
                System.out.print("Please enter your home Longitude: ");
                double homeLog = input.nextDouble();
                System.out.print("Please enter your destination Latitude: ");
                double destLat = input.nextDouble();
                System.out.print("Please enter your destination Longitude: ");
                double destLog = input.nextDouble();

                // use formula

                double dLat = Math.toRadians(destLat - homeLat);
                double dLon = Math.toRadians(destLog - homeLog);
                homeLat = Math.toRadians(homeLat);
                destLat = Math.toRadians(destLat);

                double a = Math.pow(Math.sin(dLat / 2),2) + Math.pow(Math.sin(dLon / 2),2) * Math.cos(homeLat) * Math.cos(destLat);
                double c = 2 * Math.asin(Math.sqrt(a));
                System.out.println("Distance from home to destination in kilometers: "+ R * c + "km");
                System.out.println("     *****************************************************************************");
                System.out.println("Program ending.......");

            }







}

// check
/*

        System.out.println(haversine(36.12, -86.67, 33.94, -118.40));
    }
}

Output:

2887.2599506071106
 */


/*public class Haversine {
    public static final double R = 6372.8; // In kilometers
    public static double haversine(double lat1, double lon1, double lat2, double lon2) {
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        double a = Math.pow(Math.sin(dLat / 2),2) + Math.pow(Math.sin(dLon / 2),2) * Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.asin(Math.sqrt(a));
        return R * c;
    }
    public static void main(String[] args) {
        System.out.println(haversine(36.12, -86.67, 33.94, -118.40));
    }
}*/