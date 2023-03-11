

import java.util.*;

/** @pdOid c46df5e0-e4d7-41b6-80cd-8a200e2a3306 */
public class Beneficiaire extends Personne {
   /** @pdOid 03556ce5-815f-4e7a-928e-604fe78cf4cd */
   private int id_beneficiaire;
   /** @pdOid 6d2580b9-92bb-4a41-8a12-cd82b9451497 */
   private long telephone;
   /** @pdOid d6cb8150-00f9-4648-9ddf-bd769993d1cc */
   private String adresse;
   /** @pdOid 87754d49-9fc4-439d-8691-6ad8cdc3bdf8 */
   private String pays;
   /** @pdOid 50eedeaf-ee67-401f-91b6-4467e6962679 */
   private String ville;
   
   /** @pdOid 65e79985-0118-45c8-b765-5a5916771699 */
   public String prenom;
   /** @pdOid 5b1d7499-cca7-43c7-8676-520fcb162396 */
   public String nom;
public int getId_beneficiaire() {
	return id_beneficiaire;
}
public void setId_beneficiaire(int id_beneficiaire) {
	this.id_beneficiaire = id_beneficiaire;
}
public long getTelephone() {
	return telephone;
}
public void setTelephone(long telephone) {
	this.telephone = telephone;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getPays() {
	return pays;
}
public void setPays(String pays) {
	this.pays = pays;
}
public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville = ville;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}

}