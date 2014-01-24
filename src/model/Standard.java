/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import controller.DatabaseConnection;
import view.DodajPokojeView;

/**
 *
 * @author ElaZ
 */
public class Standard {
    
    private int gwiazdki;
    private String uwagi;
    private String nazwa;

    /**
     * @return the gwiazdki
     */
    public int getGwiazdki() {
        return gwiazdki;
    }
    
    public String getNazwa(){
        return nazwa;
    }
    
    public void setNazwa(String nazwa){
        this.nazwa=nazwa;
    }

    /**
     * @param gwiazdki the gwiazdki to set
     */
    public void setGwiazdki(int gwiazdki) {
        this.gwiazdki = gwiazdki;
    }

    /**
     * @return the uwagi
     */
    public String getUwagi() {
        return uwagi;
    }

    /**
     * @param uwagi the uwagi to set
     */
    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }
    

    
}
