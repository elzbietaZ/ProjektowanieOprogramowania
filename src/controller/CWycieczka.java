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
import model.Wycieczka;
import view.DodawanieWycieczkiView;
import view.ProgramWycieczkiView;

/**
 *
 * @author ElaZ
 */
public class CWycieczka implements ActionListener{
    
    private DodawanieWycieczkiView DodawanieWycieczkiView;
    private DatabaseConnection d;
    private int WycieczkaId;
    
    public CWycieczka(){
        DodawanieWycieczkiView=new DodawanieWycieczkiView(this);
        DodawanieWycieczkiView.setVisible(true);
        d=new DatabaseConnection();
    }
    
    private Wycieczka setModel(){
        Wycieczka wycieczka=new Wycieczka();
        wycieczka.setCena(DodawanieWycieczkiView.getCena());
        wycieczka.setKoszt(DodawanieWycieczkiView.getKoszt());
        wycieczka.setLiczbaUczestnikow(DodawanieWycieczkiView.getLiczbaUczestnikow());
        wycieczka.setNazwa(DodawanieWycieczkiView.getNazwa());
        wycieczka.setRodzaj(DodawanieWycieczkiView.getRodzaj());
        wycieczka.setTermin(DodawanieWycieczkiView.getTermin());
        wycieczka.setUbezpieczenie(DodawanieWycieczkiView.getUbezpieczenie());
        return wycieczka;
    }
      public void addWycieczka(){
        
     
        try {
            saveWycieczka(setModel());
        } catch (SQLException ex) {
            Logger.getLogger(CWycieczka.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(CWycieczka.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CWycieczka.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     public void saveWycieczka(Wycieczka w)throws SQLException, InstantiationException, IllegalAccessException{
        Connection con=d.getConnection();
        Statement stmt=null;
        stmt = con.createStatement();
        stmt.execute("set names 'utf8'");

         String query = "INSERT INTO `modelowaniewycieczek`.`wycieczkadanepodstawowe` (`Nr`, `Nazwa`, `LiczbaUczestnikow`, `Koszt`, `Cena`, `Rodzaj`, `Ubezpieczenie`, `Termin`,`ProgramId`) "
                + "VALUES (NULL,' "+w.getNazwa()+" ',' "+w.getLiczbaUczestnikow()+" ', ' "+w.getKoszt()+" ', ' "+w.getCena()+" ', ' "+w.getRodzaj()+" ', ' "+w.getUbezpieczenie()+" ', ' "+w.getTermin()+" ', ' "+0+" ');";
        stmt.executeUpdate(query);
        String wycieczkaID="SELECT Nr FROM `modelowaniewycieczek`.`wycieczkadanepodstawowe` ORDER BY Nr DESC LIMIT 1;";      
        ResultSet set=null;
        set=stmt.executeQuery(wycieczkaID);
        set.next();
        WycieczkaId=set.getInt(1);
        con.close();

     }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String cmd=e.getActionCommand();
        switch(cmd){
            case "OK":
                addWycieczka();
                JOptionPane.showMessageDialog(null,"Poprawnie zapisano dane wycieczki","Komunikat",JOptionPane.WARNING_MESSAGE);
                break;
            case "Anuluj":
                DodawanieWycieczkiView.setVisible(false);
                break;
            case "Program wycieczki":
                CProgramWycieczki program=new CProgramWycieczki(WycieczkaId);
                break;
        }
    }

}
