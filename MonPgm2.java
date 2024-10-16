import java.util.Scanner;

public class MonPgm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = 2; // Nombre de joueurs

        for (int i = 0; i < numberOfPlayers; i++) {
            playGame(scanner, i + 1);
        }

        displayLeaderboard();
    }

    public static void playGame(Scanner scanner, int playerNumber) {
        short min = 1;
        short max = 100;
        short nbEssaiMax = 5;
        byte ecartMax = 15;

        short nbMystere = (short) (min + (int) (Math.random() * ((max - min) + 1)));
        short proposition = 0;
        short nbEssaiUtlisateur = 0;
        byte erreur = 0;
        boolean finDePartie = false;

        while (finDePartie == false) {
            System.out.println("Joueur " + playerNumber);
            System.out.println("Nombre mystère : " + nbMystere);
            System.out.println("Entrez un nombre entre " + min + " et " + max);
            proposition = scanner.nextShort();

            if (proposition < (nbMystere - ecartMax)) {
                finDePartie = true;
                erreur = 1;
            } else if (proposition > (nbMystere + ecartMax)) {
                finDePartie = true;
                erreur = 2;
            } else if (nbEssaiUtlisateur > nbEssaiMax || proposition == nbMystere) {
                finDePartie = true;
            } else if (proposition < nbMystere) {
                System.out.println("C'est trop bas");
            } else if (proposition > nbMystere) {
                System.out.println("C'est trop haut");
            }

            nbEssaiUtlisateur++;

            if (finDePartie == false) {
                System.out.println("Il vous reste " + (nbEssaiMax - nbEssaiUtlisateur) + " tentatives.");
            }
        }

        if (nbMystere == proposition) {
            System.out.println(" ***** GG ******");
        } else {
            System.out.println(" ***** Echec ******");
            System.out.println("Erreur : " + erreur);
            switch (erreur) {
                case 0:
                    System.out.println("T'as raté trop de fois");
                    break;
                case 1:
                    System.out.println("Nan là tu forces, c'est trop bas");
                    break;
                case 2:
                    System.out.println("Nan là tu forces, c'est trop haut");
                    break;
            }
        }
    }

    public static void displayLeaderboard() {
        // Mettez en place la logique pour afficher le classement des joueurs ici.
        // Vous pouvez utiliser des tableaux ou des structures de données pour stocker les scores.
    }
}
