package Entities.Exo1;

public class Cuve extends Captage implements IVolume
{
    protected int longueur;
    protected int largeur;

    public Cuve(int id, String nom, int hauteur, int litres, int uneLongueur, int uneLargeur) {
        super(id, nom, hauteur, litres);
        longueur=uneLongueur;
        largeur=uneLargeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    @Override
    public double GetVolume() {
        return longueur*largeur;
    }
    @Override
    public String GetDescription(){
        return super.GetDescription()+longueur+"longueur"+" - "+largeur+"largeur";
    }

}
