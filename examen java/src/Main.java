import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University university = new University();

        while (true) {
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1. Ajouter une personne");
            System.out.println("2. Modifier les informations d'une personne");
            System.out.println("3. Supprimer une personne");
            System.out.println("4. Afficher les informations d'un groupe");
            System.out.println("5. Quitter");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    university.addPerson();
                    break;
                case 2:
                    university.updatePerson();
                    break;
                case 3:
                    university.deletePerson();
                    break;
                case 4:
                    university.displayGroup();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Choix invalide");
            }
        }
    }
}
