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
import modele.Patient_Modele;


/**
 *
 * @author DELL
 */
public class Patient_Action {

    private ResultSet rs;
    
    public void ajouter(Patient_Modele p){
        connexionBase cb=new connexionBase();
        cb.connect();
  
        String rep="insert into Pateint(prenom,nom,age,sexe,adresse) values('"+p.getPrenom()+"','"+p.getNom()+"','"+p.getAge()+"','"+p.getSexe()+"','"+p.getAdresse()+",)";
        
        try {
            //3.EXECUTER LA REQUETE
            cb.st.executeUpdate(rep);
            JOptionPane.showMessageDialog(null,"Enregistrement effectuer avec succes");
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Action.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void modifier(Patient_Modele p){
        try {
            connexionBase cb=new connexionBase();
            cb.connect();
            String rep="update Patient set Prenom='"+p.getPrenom()+"',nom='"+p.getNom()+"',age='"+p.getAge()+"',sexe='"+p.getSexe()+"',adress='"+p.getAdresse()+"'where id='"+p.getCodeP()+"'";
 
            cb.st.executeUpdate(rep);
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Action.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    
    public void supprimer(int codeP){
        try {
            connexionBase cb=new connexionBase();
            cb.connect();
            String rep="'delete from patient where id ='"+codeP+"'";
            cb.st.executeUpdate(rep);
            JOptionPane.showMessageDialog(null,"Suppression avec succÃ©s ");
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Action.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public Patient_Modele rechercher (int codeP){
        Patient_Modele p=null;
        try {
            connexionBase cb=new connexionBase();
            cb.connect();
            String rep="Select*from Utilisateur where codeP='"+codeP+"'";
            ResultSet rs=cb.st.executeQuery(rep);
            if(rs.next()){
                p.setCodeP(rs.getInt("codeP"));
                p.setPrenom(rs.getString("prenom"));
                p.setNom(rs.getString("nom"));
                p.setAge(rs.getInt("age"));
                p.setSexe(rs.getString("sexe"));
                p.setAdresse((rs.getString("adresse")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Action.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                return p;
                 
                
                
                
                
                
    }
   
    public ResultSet liste(){
        try {
            ResultSet rs=null;
      
            connexionBase cb=new connexionBase();
            cb.connect();
           
            String rep="select*from Patient_Modele";
            
            rs=cb.st.executeQuery(rep);  
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Action.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      return rs;     
    }
}

