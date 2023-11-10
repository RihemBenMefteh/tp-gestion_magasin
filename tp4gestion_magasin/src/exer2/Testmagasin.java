package exer2;

public class Testmagasin {
    public static void main(String[] args) {
        produit produit1=new produit(4579,"Lait","Delice",800);
        produit produit2=new produit(21872,"Yaourt","Vitalait",500);
        produit produit3=new produit(9658,"Tomate","Sicam",1.200);
        Magasin Magasin1=new Magasin(1465,"tunis");
        Magasin1.ajouterProduit(produit1);
        Magasin1.ajouterProduit(produit2);
        Magasin1.ajouterProduit(produit3);
        Magasin1.Affch_magasin();
        System.out.println("le nombre des produits du magasin"+Magasin1.numero+" est"+Magasin1.nbr_produit);

    }
}