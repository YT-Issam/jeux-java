import java.util.Scanner;
import java.util.Random;

public class DevineNB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crée un objet Scanner pour obtenir les entrées de l'utilisateur depuis la console
        Random random = new Random(); // Crée un objet Random pour générer des nombres aléatoires
        int nombreJoueurs = demanderNombreJoueurs(scanner); // Appelle la fonction pour demander le nombre de joueurs
        int maxEssais = 5; // Définit le nombre maximum de tentatives

        System.out.println("Bienvenue dans le jeu de devinette !"); // Affiche un message de bienvenue
        System.out.println("Chaque joueur devra deviner le nombre mystère entre 1 et 100."); // Explique le jeu aux joueurs
        System.out.println("vous avez 5 tentatives au total pour trouver le nombre mystere "); // message de tentative

        for (int i = 0; i < nombreJoueurs; i++) { // Boucle pour chaque joueur
            int nombreMystere = random.nextInt(100) + 1; // Génère un nouveau nombre mystère pour chaque joueur
            int essais = 0; // Initialise le compteur d'essais à 0 pour chaque joueur

            System.out.println("Joueur " + (i + 1) + ", c'est à vous de deviner !"); // Annonce le tour du joueur actuel
            boolean victoire = false; // Indique si le joueur a trouvé le nombre mystère

            while (!victoire && essais < maxEssais) { // Boucle pour deviner jusqu'à ce que le nombre mystère soit trouvé ou que le nombre maximal d'essais soit atteint
                System.out.print("Entrez votre proposition : "); // Demande à l'utilisateur de faire une proposition
                int proposition = scanner.nextInt(); // Obtient la proposition du joueur
                essais++; // Incrémente le compteur d'essais

                if (proposition < nombreMystere) {
                    System.out.println("Le nombre mystère est plus grand ! Vous êtes à " + essais + " essai(s)."); // Indique que le nombre mystère est plus grand
                } else if (proposition > nombreMystere) {
                    System.out.println("Le nombre mystère est plus petit ! Vous êtes à " + essais + " essai(s)."); // Indique que le nombre mystère est plus petit
                } else {
                    victoire = true; // Si la proposition est correcte, le joueur gagne
                }

                if (essais == maxEssais && !victoire) {
                    System.out.println("Désolé, vous avez atteint le nombre maximal d'essais (" + maxEssais + "). Le nombre mystère était : " + nombreMystere);
                    // Affiche un message indiquant que le joueur a dépassé le nombre maximal d'essais et révèle le nombre mystère
                }
            }

            if (victoire) {
                System.out.println("Bravo Joueur " + (i + 1) + "! Vous avez trouvé le nombre mystère en " + essais + " essais.");
                // Annonce le succès du joueur s'il a trouvé le nombre mystère
            }
        }
    }

    public static int demanderNombreJoueurs(Scanner scanner) {
        System.out.print("Entrez le nombre de joueurs : "); // Demande à l'utilisateur d'entrer le nombre de joueurs
        return scanner.nextInt(); // Retourne le nombre de joueurs choisi par l'utilisateur
    }
}
