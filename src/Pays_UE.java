public class Pays_UE {

    private String nom;
    private String capitale;
    private double nbrHabitant;
    private int superficie;
    private int anneeAdhesion;

    public double Densite() {
        return (this.nbrHabitant * 1000000) / this.superficie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom += nom.toUpperCase();
    }

    public String getCapitale() {
        return capitale;
    }

    public void setCapitale(String capitale) {
        this.capitale = capitale.substring(0, 1).toUpperCase();
        this.capitale += capitale.substring(1).toLowerCase();
    }

    public double getNbrHabitant() {
        return nbrHabitant / 1000000;
    }

    public void setNbrHabitant(double nbrHabitant) {
        this.nbrHabitant = nbrHabitant;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getAnneeAdhesion() {
        return anneeAdhesion;
    }

    public void setAnneeAdhesion(int anneeAdhesion) {
        this.anneeAdhesion = anneeAdhesion;
    }
}
