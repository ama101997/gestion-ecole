public class Secretary extends Person {
    private int numeroEmploye;
    private String departement;

    public Secretary(String nom, String prenom, String adresse, String email, String telephone, int numeroEmploye, String departement) {
        super(nom, prenom, adresse, email, telephone);
        this.numeroEmploye = numeroEmploye;
        this.departement = departement;
    }

    @Override
    public String getType() {
        return "Secretaire";
    }
}
