package Lab01.ex6_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String month=sc.nextLine();
        int y=sc.nextInt();
        Year year=new Year(y);
            
        switch(month){
                case "January": case "Jan": case "Jan.": case "March":
                case "Mar": case "Mar.": case "May": case "July": case "Jul":
                case "August": case "Aug": case "Aug.": case "October": case"Oct":
                case "Oct.": case "December": case "Dec": case "Dec.":
                case "1": case "3": case "5": case "7": case "8": case "10": case "12":
                System.out.println("31 days");
                break;
                case "April": case "Apr": case "Apr.": case "June":
                case "Jun": case "September": case "Sept.": case "Sep": case "November":
                case "Nov.": case "Nov":
                case "4": case "6": case "9": case "11":
                System.out.println("30 days");
                case "February": case "Feb.": case "Feb": case "2":
                if(year.checkLeapYear()){
                    System.out.println("29 days");
                }
                else{
                    System.out.println("28 days");
                }

            }
        
        sc.close();
    }
}
