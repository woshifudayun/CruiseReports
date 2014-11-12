/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cruisereports;

/**
 * 
 *This class create a passenger with their ID, name, nationality, age, money, 
 * cruise that he has been, age range and the money they have spent totally.
 *Also this class include methods for getting their their ID, name, nationality, 
 * age, money, cruise that he has been, age range and the money they have spent totally.
 * @author FU, Yun
 * @version  1.0
 * @since 05/10/2014
 */
public class Passenger {
    private int PassengerID;
    private String PassengerName;
    private String Nationality;
    private int Age;
    private Money money;
    private Cruise cruise1;
    private Cruise cruise2;
    private int index4;
    private String ageRange;
    private double SumMoney;
    
    public Passenger(){ 
    }

     String[] FirstNames = {"Bob", "Jill", "Tom", "Brandon", "Joan", "Ethel", "Albert", "Hpward", "Roy", "Annie", "Alice", "Ruby", "Donald", "Carl", "Bonnie", "Lisa", "Scott", "Sean", "Morgan", "Oliva"};
     String[] LastNames = {"Matthew", "Nathan", "Aaron", "Zachary", "Jadon", "Matteo", "Harrison", "Titus", "Magnus", "Jax", "Jude", "Dexter", "Sawyer", "Beckett", "Miles", "Land", "Letitia", "Leopold", "Louise", "Lucretia"};
     String[] Nationalities = {"China", "Japan", "USA", "Korea", "Australia", "India"};
     /**
     *
     * construct a passenger with radom name, nationality, age, age range;
     * @param passengerID the ID of passenger
     *
     */
     public Passenger(int PassengerID){
                int index1 = (int) (Math.random() * FirstNames.length);
                int index2 = (int) (Math.random() * LastNames.length);
                String FirstName = FirstNames[index1];
                String LastName = LastNames[index2];
                PassengerName = FirstName + " " +LastName;
                int index3 = (int) (Math.random() * Nationalities.length);
                Nationality = Nationalities[index3];
                Age = (int) (20 + Math.random() * 40);
                cruise1 = new Cruise();
                cruise2 = new Cruise(); 
                if(Age<20){
                    ageRange = "<20";
                }
                if(Age>=20 && Age<30){
                    ageRange = "20-30";
                }
                 if(Age>=30 && Age<40){
                    ageRange = "30-40";
                }
                  if(Age>=40 && Age<50){
                    ageRange = "40-50";
                }
                   if(Age>=50 && Age<60){
                    ageRange = "50-60";
                }
            }
     
     /**
     *
     * get PassengerID
     * @return PassengerID
     */
     public int getID(){
         return this.PassengerID; 
     }
     
     /**
     *
     * get name of passenger
     * @return PassengerName
     */
     public String getName(){
         return this.PassengerName; 
     }
     
     /**
     *
     * get nationality of passenger
     * @return nationality of passenger
     */
     public String getNationality(){
         return this.Nationality;
     }
     
     /**
     *
     * get age of passenger
     * @return age of passenger
     */
     public int getAge(){
         return this.Age;
     }
     
     /**
     *
     * get age range of passenger
     * @return age range of passenger
     */
     public String getAgeRange(){
         return this.ageRange;
     }
     
     /**
     *
     * get the first cruise that the passenger attended
     * @return the first cruise that the passenger attended
     */
     public Cruise getCruise1(){
         index4 = (int) (1+Math.random() * (CruiseReports.Number-1));
         cruise1.setCruiseID(index4);
         return cruise1;
     }
     /**
     *
     * get the second cruise that the passenger attended
     * @return the second cruise that the passenger attended
     */
     public Cruise getCruise2(){
         cruise2.setCruiseID(index4 + 1);
         return cruise2;
     }
     /**
     *
     * @param SumMoney the sum of the money passenger spent
     * set the sum of the money passenger spent
     */
     public void setSumMoney(double SumMoney){
         this.SumMoney = SumMoney;
     }
     /**
     *
     * get the sum of the money passenger spent
     * @return the sum of the money passenger spent
     */
     public double getSumMoney(){
         return SumMoney;
     }
     
}
