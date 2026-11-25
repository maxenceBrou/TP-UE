import clavier.In;

public class Ihm {


    public static void main(String[] args) {
        OrgaPaysUE gestion = new OrgaPaysUE();

        System.out.println("Menu des Pays de L'Union-Européenne :");
        System.out.println("[1] Liste des Pays par ordre Alphabétique");
        System.out.println("[2] Liste des Pays par ordre Alphabétique des Capitales");
        System.out.println("[3] Liste des Pays par ordre croissant du nombre d'habitants");
        System.out.println("[4] Liste des Pays par ordre croissant de la superficie");
        System.out.println("[5] Liste des Pays par ordre croissant en densité");
        switch (In.readInteger()) {
            case 1:
                gestion.sortNom();
                for (int i = 0; i < 27; i++) {
                    System.out.println();
                }
                break;
            case 2:
                gestion.sortCapitale();
                break;
            case 3:
                gestion.sortNbrHabitant();
                break;
            case 4:
                gestion.sortSuperficie();
                break;
            case 5:
                gestion.sortAnneeAdhesion();

        }
        for (int i = 0; i < OrgaPaysUE.; i++) {

        }
        System.out.println();
    }
}
