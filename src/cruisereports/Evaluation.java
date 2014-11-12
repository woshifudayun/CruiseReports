/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cruisereports;

/**
 * 
 * This class create an evaluation based on each cruise and each passenger with 6 survey questions.
 * Also this class include methods for getting their their ID, name, nationality, 
 * age, money, cruise that he has been, age range and the money they have spent totally.
 * @author FU, Yun
 * @version  1.0
 * @since 05/10/2014
 */
public class Evaluation{
    private Cruise cruise;
    private Passenger passenger;
    private double survey1;
    private double survey2;
    private double survey3;
    private double survey4;
    private double survey5;
    private double survey6;

    public Evaluation(){  
    }
    
    /**
     *
     * construct an evaluation;
     * @param cruise that the passenger rate
     * @param passenger the passenger who rate the evaluation
     *
     */
    public Evaluation(Cruise cruise, Passenger passenger){
        this.cruise = cruise;
        this.passenger = passenger;
        this.survey1 = (double) (1.0 + Math.random() * 5.0);
        this.survey2 = (double) (1.0 + Math.random() * 5.0);
        this.survey3 = (double) (1.0 + Math.random() * 5.0);
        this.survey4 = (double) (1.0 + Math.random() * 5.0);
        this.survey5 = (double) (1.0 + Math.random() * 5.0);
        this.survey6 = (double) (1.0 + Math.random() * 5.0);
    }
    
    /**
     *
     * get the Cruise ID that the passenger rate
     * @return the Cruise ID that the passenger rate
     */
    public int getCruiseID(){
        return cruise.getCruiseID();
    }
    /**
     *
     * get the first survey mark that the passenger rate on cruise
     * @return the first survey mark that the passenger rate on cruise
     */
    public double getSurvey1(){
        return this.survey1;
    }
    /**
     *
     * get the second survey mark that the passenger rate on cruise
     * @return the second survey mark that the passenger rate on cruise
     */
    public double getSurvey2(){
        return this.survey2;
    }
    /**
     *
     * get the third survey mark that the passenger rate on cruise
     * @return the third survey mark that the passenger rate on cruise
     */
    public double getSurvey3(){
        return this.survey3;
    }
    /**
     *
     * get the fourth survey mark that the passenger rate on cruise
     * @return the fourth survey mark that the passenger rate on cruise
     */
    public double getSurvey4(){
        return this.survey4;
    }
    /**
     *
     * get the fifth survey mark that the passenger rate on cruise
     * @return the fifth survey mark that the passenger rate on cruise
     */
    public double getSurvey5(){
        return this.survey5;
    }
    /**
     *
     * get the sixth survey mark that the passenger rate on cruise
     * @return the sixth survey mark that the passenger rate on cruise
     */
    public double getSurvey6(){
        return this.survey6;
    }
    /**
     *
     * get the Cruise that the passenger rate
     * @return the Cruise that the passenger rate
     */
    public Cruise getCruise(){
        return cruise;
    }
    
}
