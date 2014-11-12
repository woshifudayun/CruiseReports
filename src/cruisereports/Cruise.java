/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruisereports;

/**
 *
 * @author fuyun
 */
public class Cruise {

    private int CruiseID;
    private int ShipID;
    private String Port1;
    private String Port2;
    private String Port3;
    private String Port4;

    public Cruise() {
    }

    public Cruise(int CruiseID) {
        this.CruiseID = CruiseID;
        this.ShipID = CruiseID;
        String[] ports = {"Shanghai", "Tokyo", "Seoul", "Sydney", "Brisbane", "Melbourne", "Adelaide", "Beijing", "HongKong", "Taiwan", "NewYork", "Boston"};
        int index2 = (int) (2 + Math.random() * 8);
        int index1 = index2 - 1;
        int index3 = index2 + 1;
        int index4 = index2 + 2;
        this.Port1 = ports[index1];
        this.Port2 = ports[index2];
        this.Port3 = ports[index3];
        this.Port4 = ports[index4];
    }

    public int setCruiseID(int CruiseID) {
        return this.CruiseID = CruiseID;
    }
    
    public int getCruiseID() {
        return CruiseID;
    }

    public int getShipID() {
        return ShipID;
    }

    public String getPort1() {
        return Port1;
    }

    public String getPort2() {
        return Port2;
    }

    public String getPort3() {
        return Port3;
    }

    public String getPort4() {
        return Port4;
    }

    void setCruise() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
