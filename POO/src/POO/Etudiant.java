package POO;

import java.time.LocalDate;
import java.time.Month;

class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresseMail;
    private String adressePostale;
    LocalDate maDate = LocalDate.of(2023, Month.FEBRUARY, 5);
    // Constructeur
    public Etudiant(String nom, String prenom, LocalDate dateNaissance, String adresseMail, String adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresseMail = adresseMail;
        this.adressePostale = adressePostale;
    }

    // Méthode pour changer le nom
    public void setNom(String nouveauNom) {
        this.nom = nouveauNom;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prénom='" + prenom + '\'' +
                ", date de naissance=" + dateNaissance +
                ", adresse mail='" + adresseMail + '\'' +
                ", adresse postale='" + adressePostale + '\'' +
                '}';
    }
}