
import java.util.*;

/** @pdOid ac182a75-0ac2-4f24-8ea7-3118bb857198 */
public class Admin extends Personne {
   /** @pdOid 33b4f1a2-5178-447a-85dc-11339ba0e165 */
   private int id_admin;
   /** @pdOid 62bd05ec-54fa-448a-bfde-d6e92293e3e6 */
   private char email;
   /** @pdOid 4c2cac34-eb9f-46f5-8fbf-0657fe934dd5 */
   private char mdp;
   
   public int getId_admin() {
	return id_admin;
}
public void setId_admin(int id_admin) {
	this.id_admin = id_admin;
}
public char getEmail() {
	return email;
}
public void setEmail(char email) {
	this.email = email;
}
public char getMdp() {
	return mdp;
}
public void setMdp(char mdp) {
	this.mdp = mdp;
}
public java.util.Date getDate_creation() {
	return date_creation;
}
public void setDate_creation(java.util.Date date_creation) {
	this.date_creation = date_creation;
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


/** @pdOid 63d5fdd3-6e18-4ef0-a651-aaf716e2de22 */
   protected java.util.Date date_creation;
   
   /** @pdOid a5174e45-7327-4677-95bc-f50d092fd8ee */
   protected java.lang.Boolean verifierSolde() {
      // TODO: implement
      return null;
   }
   
  
   public String prenom;
   /** @pdOid 4f6d615c-25cb-4fba-96b2-562b53c3dad2 */
   public String nom;

}