/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author DELL
 */
public class Patient_Modele {
    
private int codeP;
private String nom;
private String prenom;
private int age;
private String sexe;
private String adresse;

    public Patient_Modele() {
    }

    public Patient_Modele(int codeP, String nom, String prenom, int age, String sexe, String adresse) {
        this.codeP = codeP;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        this.adresse = adresse;
    }

    public Patient_Modele(String nom, String prenom, int age, String sexe, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        this.adresse = adresse;
    }

    public int getCodeP() {
        return codeP;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getSexe() {
        return sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setCodeP(int codeP) {
        this.codeP = codeP;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}
