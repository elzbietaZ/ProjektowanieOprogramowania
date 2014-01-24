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
import model.ProgramWycieczki;
import model.Standard;
import view.DodawanieWycieczkiView;
import view.ProgramWycieczkiView;

/**
 *
 * @author Elżbieta
 */
public class CProgramWycieczki implements ActionListener{
    
    
   private ProgramWycieczkiView ProgramWycieczkiView;
    private DatabaseConnection d;
    private int WycieczkaId;
    private int ProgramId;
    
    public CProgramWycieczki(int id){
        ProgramWycieczkiView=new ProgramWycieczkiView(this);
        ProgramWycieczkiView.setVisible(true);
        d=new DatabaseConnection();
        WycieczkaId=id;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
         String cmd=e.getActionCommand();
        switch(cmd){
            case "OK":
                addProgramWycieczki();
                JOptionPane.showMessageDialog(null,"Poprawnie zapisano dane programu","Komunikat",JOptionPane.WARNING_MESSAGE);
                ProgramWycieczkiView.setVisible(false);
                break;
            case "Anuluj":
                ProgramWycieczkiView.setVisible(false);
                break;

        
    }
        
    }

   private void addProgramWycieczki() {
        ProgramWycieczki program=new ProgramWycieczki();
        
      try {
          saveProgram(program);
      } catch (InstantiationException ex) {
          Logger.getLogger(CStandard.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
          Logger.getLogger(CStandard.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(CStandard.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    
     private void saveProgram(ProgramWycieczki program) throws InstantiationException, IllegalAccessException, SQLException {
        
        Connection con=d.getConnection();
        Statement stmt=null;
        stmt = con.createStatement();
        stmt.execute("set names 'utf8'");

        String query = "INSERT INTO `modelowaniewycieczek`.`programwycieczki` (`Nr`, `Program`) "
                + "VALUES (NULL,' "+program.getProgram()+" ');";
        stmt.executeUpdate(query);
        String programID="SELECT Nr FROM `modelowaniewycieczek`.`programwycieczki` ORDER BY Nr DESC LIMIT 1;";      
        ResultSet set=null;
        set=stmt.executeQuery(programID);
        set.next();
        ProgramId=set.getInt(1);
        String addProgram="UPDATE `modelowaniewycieczek`.`wycieczkadanepodstawowe` SET ProgramId = "+ ProgramId +" WHERE Nr = "+WycieczkaId+" ;";
        stmt.executeUpdate(addProgram);
        con.close();
    }
    
}
