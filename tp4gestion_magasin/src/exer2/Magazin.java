package exer2;


public class Magasin {
    public int identifiant;
    public String adresse;

    public  int nbr_produit=0;
    public int capacite=50;

    public static int nbr_mg;
    public int numero=nbr_mg;

    public produit[] produits=new produit[capacite];

    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        nbr_mg++;
    }
    public void ajouterProduit(produit p){
        if(nbr_produit<=capacite){
            produit[nbr_produit]=p;
        }
        else{
            System.out.println("Desolé,la quantité est maximale");
        }
    }
    public void Affch_magasin(){
        System.out.println("l'identifiant est "+identifiant+"\nl'adressse est"+adresse+"\nla capacité est"+capacite);
        System.out.println("l'ensemble des produits est");
        int i;
        for(i=0;i<=nbr_produit;i++){
            System.out.println("Nom:"+produits[i].getLibelle()+"\nPrix:"+produits[i].getPrix());
        }
    }

}