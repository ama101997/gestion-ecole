public abstract class Person {
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String telephone;

    public Person(String nom, String prenom, String adresse, String email, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
    }

    public abstract String getType();

    // Getters et setters
}
