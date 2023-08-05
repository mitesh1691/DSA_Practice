package _2_Array;

import java.util.Scanner;

public class _23_array_project_avg_temp {
    public static void main(String[] args) {
//        Code without array, problem with this is that we cannot save the elements given by user to perform operation on them later
//        to find out how many days have higher temp than average, we'll need to store the elements given by the use, which we cannot do
//        in the 1st for loop because we cannot calculate which days have higher that average temp before even calculating the average
//        so, we need to use array to store this values, so that we can use them later to perform calculations
//        this is why array is very important

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of days: ");
//        int numDays = sc.nextInt();
//
//        double sum = 0;
//        for (int i = 1; i <= numDays; i++){
//            System.out.print("The highest temperature of day " + i + " is: ");
//            double nextDayTemp = sc.nextDouble();
//            sum += nextDayTemp;
//        }
//
//        double averageTemp = sum / numDays;
//        System.out.println("Average temperature is: " + averageTemp);


//        code with array :
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int numDays = sc.nextInt();
        double [] temparr = new double[numDays];
        double sum = 0;
        for (int i = 0; i < numDays; i++){
            System.out.print("The highest temperature of day " + (i+1) + " is: ");
            temparr[i]  = sc.nextDouble();
            sum += temparr[i];
        }

        double averageTemp = sum / numDays;
        int above = 0;
        for ( int i = 0; i<temparr.length; i++){
            if( temparr[i] > averageTemp){
                above ++;
            }
        }
        System.out.println("Average temperature is: " + averageTemp);
        System.out.println("Number of days which have temperature more that average temp are: " + above );

    }
}
