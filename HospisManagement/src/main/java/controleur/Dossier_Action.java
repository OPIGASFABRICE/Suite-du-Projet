/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleur;

import Dao.connexionBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.Dossier_Modele;



/**
 *
 * @author DELL
 */
public class Dossier_Action {

    private ResultSet rs;
    
    public void ajouter(Dossier_Modele d){
        connexionBase cb=new connexionBase();
        cb.connect();
  
        String rep="insert into Dossier(dateCreation,natureExamen,dateExamen,observation,codeP) values('"+d.getDateCreation()+"','"+d.getNatureExamen()+"','"+d.getDateExamen()+"','"+d.getObservation()+"','"+d.getCodeP()+",)";
        
        try {
            cb.st.executeUpdate(rep);
            JOptionPane.showMessageDialog(null,"Enregistrement effectuer avec succes");
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Action.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void modifier(Dossier_Modele d){
        try {
            connexionBase cb=new connexionBase();
            cb.connect();
            String rep="update Dossier set dateCreation='"+d.getDateCreation()+"',natureExamen='"+d.getNatureExamen()+"',dateExamen='"+d.getDateExamen()+"',observation='"+d.getObservation()+"',codeP='"+d.getCodeP()+"'where id='"+d.getId()+"'";
 
            cb.st.executeUpdate(rep);
        } catch (SQLException ex) {
            Logger.getLogger(Dossier_Action.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    
    public void supprimer(int id){
        try {
            connexionBase cb=new connexionBase();
            cb.connect();
            String rep="'delete from patient where id ='"+id+"'";
            cb.st.executeUpdate(rep);
            JOptionPane.showMessageDialog(null,"Suppression avec succÃ©s ");
        } catch (SQLException ex) {
            Logger.getLogger(Dossier_Action.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public Dossier_Modele rechercher (int id){
        Dossier_Modele d=null;
        try {
            connexionBase cb=new connexionBase();
            cb.connect();
            String rep="Select*from Dossier where id='"+id+"'";
            ResultSet rs=cb.st.executeQuery(rep);
            if(rs.next()){
                d.setId(rs.getInt("id"));
                d.setDateCreation(rs.getString("dateCreation"));
                d.setNatureExamen(rs.getString("natureExamen"));
                d.setDateExamen(rs.getString("dateExamen"));
                d.setObservation(rs.getString("observation"));
                d.setCodeP((rs.getInt("codeP")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dossier_Action.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                return d;
                 
                
                
                
                
                
    }
   
    public ResultSet liste(){
        try {
            ResultSet rs=null;
      
            connexionBase cb=new connexionBase();
            cb.connect();
           
            String rep="select*from Dossier_Modele";
            
            rs=cb.st.executeQuery(rep);  
        } catch (SQLException ex) {
            Logger.getLogger(Dossier_Action.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      return rs;     
    }
}



