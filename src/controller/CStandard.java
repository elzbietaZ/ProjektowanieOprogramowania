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
import model.Standard;
import view.DodajStandardView;

/**
 *
 * @author Elżbieta
 */
public class CStandard implements ActionListener {
    
  private DodajStandardView StandardView;
    private DatabaseConnection d;
    private int WycieczkaId;
    private int StandardId;
    
    public CStandard(int id){
        StandardView=new DodajStandardView(this);
        StandardView.setVisible(true);
        d=new DatabaseConnection();
        WycieczkaId=id;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
            String command=e.getActionCommand();
        switch (command){
                case "OK":
                    addStandard();
                    JOptionPane.showMessageDialog(null,"Poprawnie zapisano dane standardu","Komunikat",JOptionPane.WARNING_MESSAGE);
                    StandardView.setVisible(false);
                    break;
                case "Anuluj":
                    StandardView.setVisible(false);
                    break;
                default:
                    break;
        }
    }

    private void addStandard() {
        Standard standard=new Standard();
        standard.setGwiazdki(StandardView.getStars());
        standard.setUwagi(StandardView.getUwagi());
        standard.setNazwa(StandardView.getNazwa());
      try {
          saveStandard(standard);
      } catch (InstantiationException ex) {
          Logger.getLogger(CStandard.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
          Logger.getLogger(CStandard.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(CStandard.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    private void saveStandard(Standard standard) throws InstantiationException, IllegalAccessException, SQLException {
        
        Connection con=d.getConnection();
        Statement stmt=null;
        stmt = con.createStatement();
        stmt.execute("set names 'utf8'");

        String query = "INSERT INTO `modelowaniewycieczek`.`standard` (`Nr`, `Nazwa`,`Gwiazdki`, `Uwagi`) "
                + "VALUES (NULL,' "+standard.getNazwa()+" ',' "+standard.getGwiazdki()+" ',' "+standard.getUwagi()+" ');";
        stmt.executeUpdate(query);
        String standardID="SELECT Nr FROM `modelowaniewycieczek`.`standard` ORDER BY Nr DESC LIMIT 1;";      
        ResultSet set=null;
        set=stmt.executeQuery(standardID);
        set.next();
        StandardId=set.getInt(1);
        String query2="INSERT INTO `modelowaniewycieczek`.`mastandard` (`Nr`, `idwycieczki`, `idstandardu`) "
                + "VALUES (NULL,' "+WycieczkaId+" ',' "+StandardId+" ');";
        stmt.executeUpdate(query2);
        con.close();
    }
    
    
}
