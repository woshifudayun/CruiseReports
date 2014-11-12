/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cruisereports;

/**
 * 
 *This class create a sailor with their SailorID, supervisor, ship and cruise,
 *and include methods for getting their SailorID, supervisor, ship and cruise.
 * @author FU, Yun
 * @version  1.0
 * @since 05/10/2014
 */
public class Sailor {
    private int SailorID;
    private Cruise cruise;
    private Ship ship;
    private Supervisor supervisor;
    
    
    public Sailor(){
        
    }
    /**
     *
     * construct a Sailor;
     * @param SailorID the ID of sailor
     * @param ship the ship that sailor in
     * @param cruise the cruise that sailor in
     *
     */
    public Sailor(int SailorID, Ship ship, Cruise cruise){
        this.SailorID = SailorID;
        this.ship = ship;
        this.cruise = cruise;
        supervisor = new Supervisor();
    }
    
    /**
     *
     * get SailorID
     * @return SailorID
     */
    public int getSailorID(){
        return this.SailorID;  
    }
    /**
     *
     * get ShipID
     * @return ShipID
     */
    public int getShipID(){
        return this.ship.getShipID();  
    }
    /**
     *
     * get CruiseID
     * @return CruiseID
     */
    public int getCruiseID(){
        return this.cruise.getCruiseID();  
    }
    /**
     *
     * get Supervisor
     * @return Supervisor
     */
    public Supervisor getSupervisor(){
        
        return supervisor;  
    }
    
  
}
