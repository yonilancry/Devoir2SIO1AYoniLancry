package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    private int diametre;

    public Forage(int id, String nom, int hauteur, int litres, int unDiametre) {
        super(id, nom, hauteur, litres);
        diametre=unDiametre;
    }


    public int getDiametre() {
        return diametre;
    }
    @Override
    public String GetDescription(){
        return super.GetDescription()+"diamètre"+diametre;
    }

    @Override
    public double GetVolume() {
        return Math.PI*diametre*super.hauteur;
    }
}
