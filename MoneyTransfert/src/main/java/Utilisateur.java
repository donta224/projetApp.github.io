

import java.util.*;

/** @pdOid d205ad76-9fa7-4fce-9020-a0269d3de721 */
public class Utilisateur extends Personne {
   /** @pdOid 126896b1-d105-410e-9356-02cb4099033d */
   private int id_utilisateur;
   public int getId_utilisateur() {
	return id_utilisateur;
}
public void setId_utilisateur(int id_utilisateur) {
	this.id_utilisateur = id_utilisateur;
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
public float getSolde() {
	return solde;
}
public void setSolde(float solde) {
	this.solde = solde;
}
public String getPenom() {
	return penom;
}
public void setPenom(String penom) {
	this.penom = penom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}

/** @pdOid 4f210b08-20a9-4a3d-957e-cfb1edad45e1 */
   private char email;
   /** @pdOid 8ae5d5c1-ecf6-434b-a40a-971bfe302bc3 */
   private char mdp;
   /** @pdOid 1130ec41-ff6d-4d2b-8c0f-ff69f7788487 */
   private float solde;
   
   /** @pdOid e5c7b509-e060-4c61-bddd-e908953df81b */
   protected int verifierSolde() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 4098001a-0939-47a6-aeb8-e2b6de038336 */
   public String penom;
   /** @pdOid 0501516b-b4b5-46c3-9960-4b3905eba15e */
   public String nom;

}