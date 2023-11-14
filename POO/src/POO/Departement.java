package POO;

class Departement {
    private String specialite;
    private String adresse;
    private java.util.ArrayList<Etudiant> etudiantsInscrits;

    // Constructeur
    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
        this.etudiantsInscrits = new java.util.ArrayList<>();
    }

    // Méthode pour inscrire un étudiant
    public void inscrire(Etudiant etudiant) {
        etudiantsInscrits.add(etudiant);
    }

    // Méthode pour désinscrire un étudiant
    public void desinscrire(Etudiant etudiant) {
        etudiantsInscrits.remove(etudiant);
    }

    // Méthode toString
    @Override
    public String toString() {
        StringBuilder listeEtudiants = new StringBuilder("Liste des étudiants du département " + specialite + " :\n");
        for (Etudiant etudiant : etudiantsInscrits) {
            listeEtudiants.append(etudiant.toString()).append("\n");
        }
        return listeEtudiants.toString();
    }
}
