package exer1;


public class produit {
    private int identifiant;
    private String libelle;
    private String marque;

    private double prix;
    private date date_exp;

    public static int nombre;

    public produit() {
        nombre++;
    }

    public produit(int identifiant, String libelle, String marque) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        nombre++;
    }

    public produit(int identifiant, String libelle, String marque, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        nombre++;


    }

    public produit(int identifiant, String libelle, String marque, date date_exp, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.date_exp = date_exp;
        this.prix = prix;
        nombre++;
    }

    public void Afficher(){
        System.out.println("l'identifiant est"+identifiant+"\nlibellé est"+libelle+"\nLa marque est:"+marque+"\nPrix est"+prix);
    }

    @Override


    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public date getDate_exp() {
        return date_exp;
    }

    public void setDate_exp(date date_exp) {
        this.date_exp = date_exp;
    }

    public String toString() {
        return "Produit{" +
                "identifiant=" + identifiant +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }
}