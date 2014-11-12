/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruisereports;

/**
 * 
 *This class create a Supervisor with their supervisorID,
 *and include methods for getting their supervisorID and set supervisorID.
 * @author FU, Yun
 * @version  1.0
 * @since 05/10/2014
 */
public class Supervisor extends Sailor {

    private int supervisorID;

    public Supervisor() {
    }

    /**
     *
     * construct a Sailor;
     * @param Sailor figure out which sailor is the supervisor
     *
     */
    public void setSupervisorID(Sailor sailor) {
        if (sailor.getSailorID() % 2 == 0) {
            supervisorID = sailor.getSailorID()-1;
        }
    }

    /**
     *
     * get the supervisor ID of the sailor
     * @return supervisor ID of the sailor
     */
    public int getSupervisorID() {
        return supervisorID;
    }
}
