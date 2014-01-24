/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.MiejsceNoclegowe;
import view.DodajMiejsceNoclegoweView;
import view.DodajPokojeView;
import view.DodajStandardView;

/**
 *
 * @author ElaZ
 */
public class CMiejsceNoclegowe implements ActionListener{
    
    private DodajMiejsceNoclegoweView MiejsceNoclegoweView;
    private CPokoj cPokoj;
    private CStandard cStandard;
    private DatabaseConnection d;
    private int MiejsceNoclegoweId;
   
    public CMiejsceNoclegowe(){
        MiejsceNoclegoweView=new DodajMiejsceNoclegoweView(this);
        MiejsceNoclegoweView.setVisible(true);
        d=new DatabaseConnection();
    }
 
   
    private MiejsceNoclegowe setModel(){
        MiejsceNoclegowe m=new MiejsceNoclegowe();
        m.setNazwa(MiejsceNoclegoweView.getNazwa());
        m.setKraj(MiejsceNoclegoweView.getKraj());
        m.setMiejscowosc(MiejsceNoclegoweView.getMiejscowosc());
        m.setUlica(MiejsceNoclegoweView.getUlica());
        m.setNrLokalu(MiejsceNoclegoweView.getNrLokalu());
        m.setNrBudynku(MiejsceNoclegoweView.getNrBudynku());
        m.setGwiazdki("na razie null");
        m.setUwagi("na razie null");
        return m;
    }
    
    private void clear(){
        // na razie nie implementuje
    }
    
    public void addMiejsceNoclegowe(){
        
     
        try {
            saveMiejsceNoclegowe(setModel());
        } catch (SQLException ex) {
            Logger.getLogger(CMiejsceNoclegowe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(CMiejsceNoclegowe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CMiejsceNoclegowe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void saveMiejsceNoclegowe(MiejsceNoclegowe m) throws SQLException, InstantiationException, IllegalAccessException{
        Connection con=d.getConnection();
        Statement stmt=null;
        stmt = con.createStatement();
        stmt.execute("set names 'utf8'");

   //     String query = "INSERT INTO `modelowaniewycieczek`.`miejscenoclegowe` (`Nr`, `Nazwa`, `Kraj`, `Miejscowosc`, `Ulica`, `NrBudynku`, `NrLokalu`, `Gwiazdki`, `Uwagi`) "
   //             + "VALUES (NULL, 'NOcleg', 'Anglia2', 'Londyn2', 'Street', '5', '7', '5', 'brak');";
         String query = "INSERT INTO `modelowaniewycieczek`.`miejscenoclegowe` (`Nr`, `Nazwa`, `Kraj`, `Miejscowosc`, `Ulica`, `NrBudynku`, `NrLokalu`) "
                + "VALUES (NULL,' "+m.getNazwa()+" ',' "+m.getKraj()+" ', ' "+m.getMiejscowosc()+" ', ' "+m.getUlica()+" ', ' "+m.getNrBudynku()+" ', ' "+m.getNrLokalu()+" ');";
        stmt.executeUpdate(query);
        String queryID="SELECT Nr FROM `modelowaniewycieczek`.`miejscenoclegowe` ORDER BY Nr DESC LIMIT 1;";
        
        ResultSet set=null;
        set=stmt.executeQuery(queryID);
        set.next();
        MiejsceNoclegoweId=set.getInt(1);
         System.out.println("nr miejsca noc  "+MiejsceNoclegoweId); 
        con.close();

    }
 

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        String command=e.getActionCommand();
        switch (command){
                case "OK":
                    addMiejsceNoclegowe();
                    JOptionPane.showMessageDialog(null,"Poprawnie zapisano dane miejsca noclegowego","Komunikat",JOptionPane.WARNING_MESSAGE);
                    break;
                case "Powrót":
                    MiejsceNoclegoweView.setVisible(false);
                    
                    break;  
                case "Menu główne":
                    MiejsceNoclegoweView.setVisible(false);
                    
                    break; 
                case "Anuluj":
                    MiejsceNoclegoweView.setVisible(false);
                    
                    break;  
                case "Dodaj standard":
                    cStandard=new CStandard(MiejsceNoclegoweId);
                    break;  
                case "Dodaj pokoje":
                    cPokoj=new CPokoj(MiejsceNoclegoweId);
                    break;  
                default:
                    break;
        }
                
      

        System.out.println();
       
    }
    
}
