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
import model.Pokoj;
import view.DodajPokojeView;

/**
 *
 * @author ElaZ
 */
public class CPokoj implements ActionListener{
    
    
    private DodajPokojeView PokojeView;
    private DatabaseConnection d;
    private int PokojId;
    private int WycieczkaId;


    
    public CPokoj(int id){
        PokojeView=new DodajPokojeView(this);
        PokojeView.setVisible(true);
        d=new DatabaseConnection();
        WycieczkaId=id;
    }
    
       
    public void addPokoj(){
        Pokoj p=new Pokoj();
        p.setLiczbaOsob(PokojeView.getLiczbaOsob());
        p.setLiczbaPokojow(PokojeView.getLiczbaPokojow());
        try {
            savePokoj(p);
        } catch (SQLException ex) {
            Logger.getLogger(CMiejsceNoclegowe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(CMiejsceNoclegowe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CMiejsceNoclegowe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        private void savePokoj(Pokoj p) throws SQLException, InstantiationException, IllegalAccessException{
        Connection con=d.getConnection();
        Statement stmt=null;
        stmt = con.createStatement();
        stmt.execute("set names 'utf8'");

         String query = "INSERT INTO `modelowaniewycieczek`.`pokoje` (`Nr`, `liczbaOsob`, `liczbaPokojow`) "
                + "VALUES (NULL,' "+p.getLiczbaOsob()+" ',' "+p.getLiczbaPokojow()+" ');";
        stmt.executeUpdate(query);
        
         String pokojID="SELECT Nr FROM `modelowaniewycieczek`.`pokoje` ORDER BY Nr DESC LIMIT 1;";      
        ResultSet set=null;
        set=stmt.executeQuery(pokojID);
        set.next();
        PokojId=set.getInt(1);
        
        con.close();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command=e.getActionCommand();
        switch (command){
                case "OK":
                    
                    JOptionPane.showMessageDialog(null,"Poprawnie zapisano dane pokojów","Komunikat",JOptionPane.WARNING_MESSAGE);
                    PokojeView.setVisible(false);
                    break;
                case "Dodaj":
                    addPokoj();
                    PokojeView.setdodanePokoje(PokojeView.getLiczbaPokojow(), PokojeView.getLiczbaOsob());
                    break;
                case "Anuluj":
                    PokojeView.setVisible(false);
                    break;
                default:
                    break;
        }
    }
    
}
