

import java.util.*;

/** @pdOid 920946a1-8a15-404b-89a5-b71f3e392f25 */
public class Personne {
   /** @pdOid 5638cbd8-b3fd-42c5-b796-8bd66fc02821 */
   private int id_personne;
   /** @pdOid 134c4cb5-28a8-4ed9-a9e7-eec4367af40b */
   private String adresse;
   /** @pdOid ed0ba730-9983-429e-8fc0-683ae662731e */
   private char enamil;
   /** @pdOid 582131a0-534d-47c6-8cf5-df325847f34a */
   private java.util.Date date_naissance;
   /** @pdOid 3866989c-63eb-4220-a519-a294d21d68d1 */
   private boolean role;
   
   /** @pdOid c3064f36-74eb-4d02-b17b-72012d3df9c7 */
   protected void Envoyer() {
      // TODO: implement
   }
   
   public int getId_personne() {
	return id_personne;
}

public void setId_personne(int id_personne) {
	this.id_personne = id_personne;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public char getEnamil() {
	return enamil;
}

public void setEnamil(char enamil) {
	this.enamil = enamil;
}

public java.util.Date getDate_naissance() {
	return date_naissance;
}

public void setDate_naissance(java.util.Date date_naissance) {
	this.date_naissance = date_naissance;
}

public boolean isRole() {
	return role;
}

public void setRole(boolean role) {
	this.role = role;
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

/** @pdOid 16ab3fc9-a991-43df-9356-831768e2d1ac */
   protected void Modifier() {
      // TODO: implement
   }
   
   /** @pdOid 2622afd6-5da1-436e-944a-8a3e81b87920 */
   protected void Supprimer() {
      // TODO: implement
   }
   
   /** @pdOid bafa3834-817e-4f51-930c-4f0e57c5bbba */
   protected void CreerCompte() {
      // TODO: implement
   }
   
   /** @pdOid f751ff0e-ccd3-42c2-acf1-18ae1e6eb3ab */
   public String prenom;
   /** @pdOid 21322f1b-45af-45da-859c-0433b55b4a1d */
   public String nom;
   
   /** @pdRoleInfo migr=no name=Transfert assc=effectuer coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Transfert> transfert;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Transfert> getTransfert() {
      if (transfert == null)
         transfert = new java.util.HashSet<Transfert>();
      return transfert;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTransfert() {
      if (transfert == null)
         transfert = new java.util.HashSet<Transfert>();
      return transfert.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTransfert */
   public void setTransfert(java.util.Collection<Transfert> newTransfert) {
      removeAllTransfert();
      for (java.util.Iterator iter = newTransfert.iterator(); iter.hasNext();)
         addTransfert((Transfert)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTransfert */
   public void addTransfert(Transfert newTransfert) {
      if (newTransfert == null)
         return;
      if (this.transfert == null)
         this.transfert = new java.util.HashSet<Transfert>();
      if (!this.transfert.contains(newTransfert))
         this.transfert.add(newTransfert);
   }
   
   /** @pdGenerated default remove
     * @param oldTransfert */
   public void removeTransfert(Transfert oldTransfert) {
      if (oldTransfert == null)
         return;
      if (this.transfert != null)
         if (this.transfert.contains(oldTransfert))
            this.transfert.remove(oldTransfert);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTransfert() {
      if (transfert != null)
         transfert.clear();
   }

}