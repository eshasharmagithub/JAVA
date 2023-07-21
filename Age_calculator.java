package Project_keerthi;

import java.util.Scanner;

public class Age_calculator {
    public static void main(String[] args) {

        int year, date,weeks,days,hours,minutes,seconds,months;
        System.out.println("Enter the year, months and date of birth");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        months=sc.nextInt();
        date=sc.nextInt();

        System.out.println("Enter the year ,month and date of the current date");
        int yearQ, dateQ, monthsQ;

        yearQ=sc.nextInt();
        monthsQ=sc.nextInt();
        dateQ=sc.nextInt();

       int calculateY=(yearQ-year);

       //Here we have checked if DOB month is greater than current date month or if it is lesser
       int calculateM;
       if(months<=monthsQ) {
           calculateM = monthsQ-months;
       }
       else
       {
           calculateM=(months)-(12-monthsQ);
       }

     int calculateD=(dateQ-date);
     int calculateHours=calculateY*8760;
     int calculateMins=calculateY*525600;
     int calculateSec=calculateY*31536000;


        System.out.println("the age will be");
        System.out.println(calculateY+"years"+"  "+ calculateM+"months"+"  "+ calculateD+"days");
        System.out.println(calculateHours+"  "+"hours");
        System.out.println(calculateMins+"  "+"mins");
        System.out.println(calculateSec+"  "+"seconds");
    }
}
