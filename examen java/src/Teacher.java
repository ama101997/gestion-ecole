public class Teacher extends Person {
    private int numeroEmploye;
    private String departement;
    private String domaine;

    public Teacher(String nom, String prenom, String adresse, String email, String telephone, int numeroEmploye, String departement, String domaine) {
        super(nom, prenom, adresse, email, telephone);
        this.numeroEmploye = numeroEmploye;
        this.departement = departement;
        this.domaine = domaine;
    }

    @Override
    public String getType() {
        return "Professeur";
    }

    // Getters et setters
}
