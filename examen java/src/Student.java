public class Student extends Person {
    private int numeroEtudiant;
    private String filiere;
    private String niveau;
    private double moyenne;

    public Student(String nom, String prenom, String adresse, String email, String telephone, int numeroEtudiant, String filiere, String niveau) {
        super(nom, prenom, adresse, email, telephone);
        this.numeroEtudiant = numeroEtudiant;
        this.filiere = filiere;
        this.niveau = niveau;
    }

    @Override
    public String getType() {
        return "Etudiant";
    }

    // Getters et setters
}
