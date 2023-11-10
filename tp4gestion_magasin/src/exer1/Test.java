package exer1;


public class Test {
    public static void main(String[] args) {
       produit p1=new produit();
        produit p2=new produit(1021,"Lait","Delice");
        produit p3=new produit(2510,"Yaourt","Vitalait");
        produit p4=new produit(3250,"Tomate","Sicam",1.200);
        p1.Afficher();
        p2.Afficher();
        p3.Afficher();
        p4.Afficher();
        p2.setPrix(0.700);
        p2.Afficher();
        p3.setPrix(0.350);
        p1.setIdentifiant(1054);
        p1.setLibelle("Goutta");
        p1.setMarque("Delice");
        p1.setPrix(1500);
        p3.Afficher();
        p1.Afficher();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        p1.setDate_exp(new date(15,4,2023));
        p2.setDate_exp(new date(5,8,2023));
        p3.setDate_exp(new date(19,12,2023));
        p4.setDate_exp(new date(24,07,2023));
     System.out.println("pour le 1er produit");
        p1.getDate_exp().Affich_Date();
     System.out.println("pour le 2eme produit");
        p2.getDate_exp().Affich_Date();
     System.out.println("pour le 3eme produit");
        p3.getDate_exp().Affich_Date();
     System.out.println("pour le 4eme produit");
        p4.getDate_exp().Affich_Date();

    }
}
