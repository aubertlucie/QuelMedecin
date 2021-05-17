package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Création d'une classe RENDEZ_VOUS d'un patient dans un créneau
 *
 */
public class RendezVous {
    private Creneau creneau;
    private Patient patient;
    private LocalDate date;


    //constructeur
    public RendezVous(Creneau creneau, Patient patient, LocalDate date) {
        this.creneau = creneau;
        this.patient = patient;
        this.date = date;
    }
     //methode afficher
    public void afficher() {
        System.out.printf("Rendez-vous du %s", this.date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
                this.creneau.afficher();
        System.out.printf("avec le Dr %s%n", this.creneau.getMedecin().getNom());
        this.patient.afficher();
    }
}



