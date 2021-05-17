package fr.eni.ecole.quelMedecin.bo;

public class Medecin  extends Personne {

    public static final int MAX_CRENEAUX = 15;
    protected Creneau[] creneaux = new Creneau[MAX_CRENEAUX];

    public Medecin(String nom, String prenom, String numeroDeTelephone, Adresse adresse, Creneau[] creneaux) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.creneaux = creneaux;
    }

    public Medecin(){

    }

    public String getnumeroDeTelephone() {
        return this.numeroDeTelephone;
    }

    public void setnumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public String getNom() {
        return this.nom;
    }

    public void afficherAdresseEtCreneaux() {
        System.out.println("Adresse : ");
        this.adresse.afficher();
        System.out.println("Créneaux : ");
        for (int i = 0; i < this.creneaux.length; i++) {
            if (this.creneaux[i] != null) {
                this.creneaux[i].afficher();
            }
        }
    }


    public void ajouterCreneau(Creneau creneauAajouter) {
        if (this != creneauAajouter.getMedecin()){
            System.err.println("Ce créneau est déjà occupé par un autre médecin");
        } else {
        for (int i = 0; i < this.creneaux.length; i++) {
            if (this.creneaux[i] == null) {
                this.creneaux[i] = creneauAajouter;
                break;
            }
        }
        }
    }
}
