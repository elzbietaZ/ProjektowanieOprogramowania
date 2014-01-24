/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.DodajMiejsceNoclegoweView;
import view.DodawanieWycieczkiView;

/**
 *
 * @author ElaZ
 */
public class COknoGlowne implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
         String command=e.getActionCommand();
        switch (command){
                case "Dodaj miejsce noclegowe":
                    CMiejsceNoclegowe con=new CMiejsceNoclegowe();
               //     DodajMiejsceNoclegoweView d=new DodajMiejsceNoclegoweView();
               //     d.setVisible(true);
                    break;
                case "Dodaj model nowej wycieczki":
                    CWycieczka d2=new CWycieczka();
                    break;  
             
        }
    }
    
}
