/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author DELL
 */
public class Dossier_Modele {
    
   private int id;
   private String dateCreation;
   private String natureExamen;
   private String dateExamen;
   private String observation;
   private int codeP;

    public Dossier_Modele() {
    }

    public Dossier_Modele(int id, String dateCreation, String natureExamen, String dateExamen, String observation, int codeP) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.natureExamen = natureExamen;
        this.dateExamen = dateExamen;
        this.observation = observation;
        this.codeP = codeP;
    }

    public Dossier_Modele(String dateCreation, String natureExamen, String dateExamen, String observation, int codeP) {
        this.dateCreation = dateCreation;
        this.natureExamen = natureExamen;
        this.dateExamen = dateExamen;
        this.observation = observation;
        this.codeP = codeP;
    }

    public int getId() {
        return id;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public String getNatureExamen() {
        return natureExamen;
    }

    public String getDateExamen() {
        return dateExamen;
    }

    public String getObservation() {
        return observation;
    }

    public int getCodeP() {
        return codeP;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setNatureExamen(String natureExamen) {
        this.natureExamen = natureExamen;
    }

    public void setDateExamen(String dateExamen) {
        this.dateExamen = dateExamen;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public void setCodeP(int codeP) {
        this.codeP = codeP;
    }


}
