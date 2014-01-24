/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author ElaZ
 */
public class Wycieczka {
    
    private double Cena;
    private double Koszt;
    private String Nazwa;
    private int liczbaUczestnikow;
    private String rodzaj;
    private String termin;
    private String ubezpieczenie;

    public double getCena() {
        return Cena;
    }

    public void setCena(double Cena) {
        this.Cena = Cena;
    }

    public double getKoszt() {
        return Koszt;
    }

    public void setKoszt(double Koszt) {
        this.Koszt = Koszt;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String Nazwa) {
        this.Nazwa = Nazwa;
    }

    public int getLiczbaUczestnikow() {
        return liczbaUczestnikow;
    }

    public void setLiczbaUczestnikow(int liczbaUczestnikow) {
        this.liczbaUczestnikow = liczbaUczestnikow;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getTermin() {
        return termin;
    }

    public void setTermin(String termin) {
        this.termin = termin;
    }

    public String getUbezpieczenie() {
        return ubezpieczenie;
    }

    public void setUbezpieczenie(String ubezpieczenie) {
        this.ubezpieczenie = ubezpieczenie;
    }
    
}
