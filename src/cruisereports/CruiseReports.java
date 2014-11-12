/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruisereports;

import static cruisereports.Money.getMoneyComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *This class generate 4 reports about the relationships between cruises, passengers,
 * ship and money passengers have spent.
 * @author FU, Yun
 * @version  1.0
 * @since 05/10/2014
 */
public class CruiseReports {
/**
    *
    * This variables record the number of cruises that users want to have.
    */
    public static int Number;
    /**
    *
    * These six variables record the average rate per cruise that users rated.
    */
    static public double sum1;
    static public double sum2;
    static public double sum3;
    static public double sum4;
    static public double sum5;
    static public double sum6;

    /**
     * 
     * generated 4 reports about the relationships between cruises, passengers,
     * ship and money passengers have spent.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Do you want to create new cruises?");
        Scanner CreateOrNot = new Scanner(System.in);
        String createOrNot = CreateOrNot.nextLine();
        if (createOrNot.equals("yes")) {
            System.out.println("How many cruise do you want to create?");
            Scanner no = new Scanner(System.in);
            String number = no.nextLine();
            Number = Integer.parseInt(number);

            Cruise[] cruise = new Cruise[Number];
            Ship[] ship = new Ship[Number];
            Sailor[] sailor = new Sailor[2*Number];
            Passenger[] passenger = new Passenger[20 * Number];
            Money[] money = new Money[40 * Number];
            Evaluation[] evaluation = new Evaluation[40 * Number];
            
            for (int n = 0; n < Number; n++) {
                cruise[n] = new Cruise(n+1);
                ship[n] = new Ship(n+1);
            }
            for (int n = 0; n < 2 * Number; n++) {
                sailor[n] = new Sailor(n+1, ship[n/2], cruise[n/2]);
            }
            for (int n = 0; n < 2 * Number; n++) {
                sailor[n].getSupervisor().setSupervisorID(sailor[n]);
            }
            for (int n = 0; n < 20 * Number; n++) {
                passenger[n] = new Passenger(n+1);
            }
            int j =0;
            for (int n=0; n < 20 * Number; n++){
                money[j] = new Money(passenger[n].getCruise1(), passenger[n]);
                evaluation[j] = new Evaluation(passenger[n].getCruise1(), passenger[n]);
                money[j+1] = new Money(passenger[n].getCruise2(), passenger[n]);
                evaluation[j+1] = new Evaluation(passenger[n].getCruise2(), passenger[n]);
                j = j+1;
                j++;
            }

            System.out.println("Generate Report 1 : Revenue generated from the cruise passengers by age.");
            System.out.printf("%-30s%-30s%-30s%-30s\n", "Nationality", "AgeRange", "Money", "Number of Passengers");
            
            for(int i=0; i < Number*20; i++){
                getMoney(passenger[i],money);
            }
            
            double sumMoney = 0;
                int sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=20&&passenger[i].getAge()<30){
                   if(passenger[i].getNationality().equalsIgnoreCase("Australia")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "Australia", "20-30", sumMoney,sumPeople);
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=20&&passenger[i].getAge()<30){
                   if(passenger[i].getNationality().equalsIgnoreCase("China")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "China", "20-30", sumMoney,sumPeople); 
                
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=20&&passenger[i].getAge()<30){
                   if(passenger[i].getNationality().equalsIgnoreCase("Japan")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "Japan", "20-30", sumMoney,sumPeople); 
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=20&&passenger[i].getAge()<30){
                   if(passenger[i].getNationality().equalsIgnoreCase("India")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "India", "20-30", sumMoney,sumPeople); 
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=20&&passenger[i].getAge()<30){
                   if(passenger[i].getNationality().equalsIgnoreCase("Korea")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "Korea", "20-30", sumMoney,sumPeople); 
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=20&&passenger[i].getAge()<30){
                   if(passenger[i].getNationality().equalsIgnoreCase("USA")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "USA", "20-30", sumMoney,sumPeople); 
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=30&&passenger[i].getAge()<40){
                   if(passenger[i].getNationality().equalsIgnoreCase("Australia")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "Australia", "30-40", sumMoney,sumPeople);
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=30&&passenger[i].getAge()<40){
                   if(passenger[i].getNationality().equalsIgnoreCase("China")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "China", "30-40", sumMoney,sumPeople); 
                
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=30&&passenger[i].getAge()<40){
                   if(passenger[i].getNationality().equalsIgnoreCase("Japan")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "Japan", "30-40", sumMoney,sumPeople); 
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=30&&passenger[i].getAge()<40){
                   if(passenger[i].getNationality().equalsIgnoreCase("India")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "India", "30-40", sumMoney,sumPeople); 
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=30&&passenger[i].getAge()<40){
                   if(passenger[i].getNationality().equalsIgnoreCase("Korea")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "Korea", "30-40", sumMoney,sumPeople); 
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=30&&passenger[i].getAge()<40){
                   if(passenger[i].getNationality().equalsIgnoreCase("USA")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "USA", "30-40", sumMoney,sumPeople); 
                
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=40&&passenger[i].getAge()<50){
                   if(passenger[i].getNationality().equalsIgnoreCase("Australia")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "Australia", "40-50", sumMoney,sumPeople);
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=40&&passenger[i].getAge()<50){
                   if(passenger[i].getNationality().equalsIgnoreCase("China")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "China", "40-50", sumMoney,sumPeople); 
                
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=40&&passenger[i].getAge()<50){
                   if(passenger[i].getNationality().equalsIgnoreCase("Japan")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "Japan", "40-50", sumMoney,sumPeople); 
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=40&&passenger[i].getAge()<50){
                   if(passenger[i].getNationality().equalsIgnoreCase("India")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "India", "40-50", sumMoney,sumPeople); 
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=40&&passenger[i].getAge()<50){
                   if(passenger[i].getNationality().equalsIgnoreCase("Korea")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "Korea", "40-50", sumMoney,sumPeople); 
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=40&&passenger[i].getAge()<50){
                   if(passenger[i].getNationality().equalsIgnoreCase("USA")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30f%-30d\n", "USA", "40-50", sumMoney,sumPeople); 
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=50&&passenger[i].getAge()<60){
                   if(passenger[i].getNationality().equalsIgnoreCase("Australia")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "Australia", "50-60", sumMoney,sumPeople);
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=50&&passenger[i].getAge()<60){
                   if(passenger[i].getNationality().equalsIgnoreCase("China")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "China", "50-60", sumMoney,sumPeople); 
                
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=50&&passenger[i].getAge()<60){
                   if(passenger[i].getNationality().equalsIgnoreCase("Japan")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "Japan", "50-60", sumMoney,sumPeople); 
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=50&&passenger[i].getAge()<60){
                   if(passenger[i].getNationality().equalsIgnoreCase("India")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "India", "50-60", sumMoney,sumPeople); 
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=50&&passenger[i].getAge()<60){
                   if(passenger[i].getNationality().equalsIgnoreCase("Korea")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "Korea", "50-60", sumMoney,sumPeople); 
                sumMoney = 0;
                sumPeople = 0;
                for(int i=0; i < CruiseReports.Number *20; i++){
                if(passenger[i].getAge()>=50&&passenger[i].getAge()<60){
                   if(passenger[i].getNationality().equalsIgnoreCase("USA")){
                       sumMoney = sumMoney + passenger[i].getSumMoney();
                       sumPeople++;
                   }}}
                   System.out.printf("%-30s%-30s%-30.2f%-30d\n", "USA", "50-60", sumMoney,sumPeople); 
            
                    
            System.out.println("");
            
            
            System.out.println("Generate Report 2 : Sailors that worked on a cruise and their supervisors");
            System.out.printf("%-30s%-30s%-30s\n", "Sailor", "Cruise", "Supervisor");
            for (int n = 0; n < 2 * Number; n++){
            if (sailor[n].getSupervisor().getSupervisorID() == 0) {
                 System.out.printf("%-30s%-30s%-30s\n", "Sailor" + sailor[n].getSailorID(), "Cruise" + sailor[n].getCruiseID(), " ");
                }
            else{System.out.printf("%-30s%-30s%-30s\n", "Sailor" + sailor[n].getSailorID(), "Cruise" + sailor[n].getCruiseID(), "Sailor" +sailor[n].getSupervisor().getSupervisorID());
             }
            }
            System.out.println("");
            
            
            System.out.println("Generate Report 3 : list of passengers sorted by MoneySpentOnCruise");
            System.out.printf("%-30s%-30s%-30s\n", "PassengerName", "MoneySpent", "CruiseID");
            ArrayList<Money> table3 = new ArrayList<Money>();            
            for(int i=0; i<40*Number; i++){
                table3.add(money[i]);
            }
            Collections.sort(table3, getMoneyComparator);
            for(Money a: table3){
            System.out.printf("%-30s%-30.2f%-30s\n", a.getPassenger().getName(),a.getMoney(),"Cruise"+a.getCruise().getCruiseID());}
            System.out.println("");

   
            System.out.println("Generate Report 4 : Cruise evaluation report by passengers.");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s%-30s\n", "Cruise", "Survey1", "Survey2", "Survey3", "Survey4", "Survey5", "Survey6");
            for(int i=0; i<Number; i++){
            System.out.printf("%-30s%-30.2f%-30.2f%-30.2f%-30.2f%-30.2f%-30.2f\n", "Cruise"+cruise[i].getCruiseID(), getSumSurvey1(cruise[i], evaluation, passenger), 
                    getSumSurvey2(cruise[i], evaluation, passenger),getSumSurvey3(cruise[i], evaluation, passenger), getSumSurvey4(cruise[i], evaluation, passenger),
                    getSumSurvey5(cruise[i], evaluation, passenger), getSumSurvey6(cruise[i], evaluation, passenger));    
        }System.out.println("");
        }else{
            System.out.println("Quit.");
        }

    }
        static public double getSumSurvey1(Cruise cruise, Evaluation[] evaluation, Passenger[] passenger){
        double temp1 = 0;
            for(int j=0; j < 40*CruiseReports.Number; j++){  
                if(evaluation[j].getCruiseID() == cruise.getCruiseID()){  
                   sum1 = temp1 + evaluation[j].getSurvey1();
                   temp1 = sum1;  
                }
        }
        double avgSurvey1 = sum1/countPassenger(cruise, passenger);
        return avgSurvey1;
    }
    
        static public double getSumSurvey2(Cruise cruise, Evaluation[] evaluation, Passenger[] passenger){
        double temp2=0;
        
            for(int j=0; j < 40*CruiseReports.Number; j++){
                if(evaluation[j].getCruiseID() == cruise.getCruiseID()){  
                   sum2 = temp2 + evaluation[j].getSurvey2();
                   temp2 = sum2;
                }
            }
        double avgSurvey2 = sum2/countPassenger(cruise, passenger);
        return avgSurvey2;
    }
      static public double getSumSurvey3(Cruise cruise, Evaluation[] evaluation, Passenger[] passenger){
        double temp3=0;
        
            for(int j=0; j < 40*CruiseReports.Number; j++){
                if(evaluation[j].getCruiseID() == cruise.getCruiseID()){  
                   sum3 = temp3 + evaluation[j].getSurvey3();
                   temp3 = sum3;
                   
                }
            }
    double avgSurvey3 = sum3/countPassenger(cruise, passenger);
    return avgSurvey3;
    }
        static public double getSumSurvey4(Cruise cruise, Evaluation[] evaluation, Passenger[] passenger){
        double temp4=0;
        
            for(int j=0; j < 40*CruiseReports.Number; j++){
                if(evaluation[j].getCruiseID() == cruise.getCruiseID()){  
                   sum4 = temp4 + evaluation[j].getSurvey4();
                   temp4 = sum4;            
                }
        }
     double avgSurvey4 = sum4/countPassenger(cruise, passenger);
     return avgSurvey4;
    }
        static public double getSumSurvey5(Cruise cruise, Evaluation[] evaluation, Passenger[] passenger){
        double temp5=0;
        
            for(int j=0; j < 40*CruiseReports.Number; j++){
                if(evaluation[j].getCruiseID() == cruise.getCruiseID()){  
                   sum5 = temp5 + evaluation[j].getSurvey5();
                   temp5 = sum5;
                   
                }  
        }
      double avgSurvey5 = sum5/countPassenger(cruise, passenger);
      return avgSurvey5;
    }
       static public double getSumSurvey6(Cruise cruise, Evaluation[] evaluation, Passenger[] passenger){
        double temp6=0;
            for(int j=0; j < 40*CruiseReports.Number; j++){
                if(evaluation[j].getCruiseID() == cruise.getCruiseID()){  
                   sum6 = temp6 + evaluation[j].getSurvey6();
                   temp6 = sum6;    
                }
            }
      double avgSurvey6 = sum6/countPassenger(cruise, passenger);
      return avgSurvey6;
    }
       static public int countPassenger(Cruise cruise, Passenger[] passenger){
           int passengerCruise = 0;

           for(int i=0; i < 20*CruiseReports.Number; i++){
               if(passenger[i].getCruise1().getCruiseID() == cruise.getCruiseID()){
                   passengerCruise++;
               }
               if(passenger[i].getCruise2().getCruiseID() == cruise.getCruiseID()){
                   passengerCruise++;
               }        
            }
        return passengerCruise;
       }
      
       static public double getMoney(Passenger passenger, Money[] money){
       for(int j=0; j < 20*CruiseReports.Number; j++){
            double temp=0;
             for(int i=0; i < 40*CruiseReports.Number; i++){
            if(money[i].getPassenger().getID()==j){
                passenger.setSumMoney(temp+money[i].getMoney());
                temp = temp + money[i].getMoney();
            }
            }
        }
        return passenger.getSumMoney();   
     }
}
