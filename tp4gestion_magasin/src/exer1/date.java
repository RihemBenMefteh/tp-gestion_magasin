package exer1;

public class date {
    public int jour;
    public int mois;
    public int annee;

    public date(int j, int m, int a) {
        jour = j;
        mois = m;
        annee = a;
    }
    public void Affich_Date(){
        System.out.println("La date d'expiration est "+jour+"/"+mois+"/"+annee);
    }
}
