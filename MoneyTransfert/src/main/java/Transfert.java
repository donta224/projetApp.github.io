

import java.util.*;

/** @pdOid 92c50721-92aa-4f49-acbe-b6b1206cb178 */
public class Transfert {
   /** @pdOid a89afd02-281d-4837-a253-9e5ad7ec2650 */
   private int id_transfert;
   /** @pdOid 2477ed92-9545-4511-a0bc-e710a957b9b7 */
   private float montant;
   public int getId_transfert() {
	return id_transfert;
}
public void setId_transfert(int id_transfert) {
	this.id_transfert = id_transfert;
}
public float getMontant() {
	return montant;
}
public void setMontant(float montant) {
	this.montant = montant;
}
public java.util.Date getDate_envoyer() {
	return date_envoyer;
}
public void setDate_envoyer(java.util.Date date_envoyer) {
	this.date_envoyer = date_envoyer;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public boolean isEtat() {
	return etat;
}
public void setEtat(boolean etat) {
	this.etat = etat;
}
public String getEmmettre() {
	return emmettre;
}
public void setEmmettre(String emmettre) {
	this.emmettre = emmettre;
}
public String getDestinataire() {
	return destinataire;
}
public void setDestinataire(String destinataire) {
	this.destinataire = destinataire;
}
/** @pdOid 4f131c13-f790-42d9-9e68-2f69edc5b951 */
   private java.util.Date date_envoyer;
   /** @pdOid a4930b42-435f-49f5-9bc0-3ad735ef098f */
   private String description;
   /** @pdOid 67c99b72-d5a2-4294-aafd-36ea17a4d32a */
   private boolean etat;
   /** @pdOid e5efac7d-b84d-41d3-96d9-26416514605b */
   private String emmettre;
   /** @pdOid 21deee36-3d42-4936-9f00-f1fbd2c73774 */
   private String destinataire;

}