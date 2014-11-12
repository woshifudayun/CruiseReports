/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cruisereports;

import java.util.Comparator;

/**
 * 
 *This class create a relationship between cruise, passenger, money passenger spent. 
 *Also this class include methods for getting the passenger, cruise and the money they have spent.
 * @author FU, Yun
 * @version  1.0
 * @since 05/10/2014
 */
public class Money implements Comparable<Money>{
    private Cruise cruise;
    private Passenger passenger;
    private double spent;
    
    public static final Comparator<Money> getMoneyComparator = new Comparator<Money>(){

        @Override
        public int compare(Money o1, Money o2) {
            return (int) (o1.getMoney() - o2.getMoney());  // This will work because age is positive integer
        }
      
    };


    public Money(){  
    }
     /**
     *
     * construct money;
     * @param cruise the cruise that passenger spent money on
     * @param passenger who spend money on the cruise
     */
    public Money(Cruise cruise, Passenger passenger){
        this.cruise = cruise;
        this.passenger = passenger;
        spent = (double) 50 + Math.random() * 300;
    }
    
    /**
     *
     * get the money passenger spent on the cruise
     * @return he money passenger spent on the cruise
     */
    public double getMoney(){
        return this.spent; 
    }
    /**
     *
     * get the passenger who spent money on the cruise
     * @return get the passenger who spent money on the cruise
     */
    public Passenger getPassenger(){
        return passenger; 
    }
    public Cruise getCruise(){
        return cruise; 
    }

    @Override
    public int compareTo(Money o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
         
        
    