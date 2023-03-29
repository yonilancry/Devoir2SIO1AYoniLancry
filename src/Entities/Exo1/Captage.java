package Entities.Exo1;

public class Captage implements Comparable<Captage>
{
    protected int id;
    protected String nom;
    protected int hauteur;
    protected int litres;

    public Captage(int unId, String unNom, int uneHauteur, int leLitre) {
        id = unId;
        nom = unNom;
        hauteur = uneHauteur;
        litres = leLitre;
    }

    @Override
    public int compareTo(Captage o) {
        return Integer.compare(o.litres,this.litres);
    }

    public int getId() {
        return id;
    }
    public String GetDescription(){
        return nom+" - "+hauteur+"mètres"+" - "+litres+"litres"+" - ";
    }
}
