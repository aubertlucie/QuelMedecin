package fr.eni.ecole.quelMedecin.bo;

public class MedecinSpecialiste extends Medecin{
    private String specialite;
    private int tarif;

    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, Creneau[] creneaux, String specialite, int tarif) {
        super(nom, prenom, numeroDeTelephone, adresse, creneaux);
        this.specialite = specialite;
        this.tarif = tarif;
    }
    @Override
    public void afficher(){
        super.afficher();
        System.out.printf("Spécialité : %s%nTarif : %d€%n",
                this.specialite, this.tarif);
        this.afficherAdresseEtCreneaux();
    }
}
