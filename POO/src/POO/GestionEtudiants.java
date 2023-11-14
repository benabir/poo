package POO;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args) {
        // Création d'une date
        LocalDate maDate = LocalDate.of(2023, Month.FEBRUARY, 5);

        // Création d'étudiants
        Etudiant lolo = new Etudiant("Lolo", "Lola", maDate, "lolo@gmail.com", "123 Avenue ABC");
        Etudiant toto = new Etudiant("Toto", "Tata", maDate, "toto@gmail.com", "456 Rue XYZ");

        // Modification du nom de toto
        toto.setNom("Toto le Héros");

        // Comparaison avec l'opérateur ==
        System.out.println("Les deux étudiants sont-ils les mêmes ? " + (lolo == toto));

        // Référence toto à lolo
        toto = lolo;

        // Modification du nom de toto, vérification de la modification sur lolo
        toto.setNom("Toto le Surnom");
        System.out.println("Nom de lolo après modification de toto : " + lolo.toString());

        // Création d'un département
        Departement monDepInfo = new Departement("Informatique", "Batiment A, Campus Universitaire");

        // Création de nouveaux étudiants
        Etudiant fifi = new Etudiant("Fifi", "Fafa", maDate, "fifi@gmail.com", "789 Avenue GHI");
        Etudiant riri = new Etudiant("Riri", "Rara", maDate, "riri@gmail.com", "101 Rue LMN");

        // Inscription des étudiants dans le département
        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(fifi);
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(riri);

        // Affichage de la liste des étudiants du département
        System.out.println(monDepInfo.toString());

        // Désinscription de toto du département
        monDepInfo.desinscrire(toto);

        // Affichage de la liste mise à jour
        System.out.println("Après désinscription de toto :\n" + monDepInfo.toString());
    }
}