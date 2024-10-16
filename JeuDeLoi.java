import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class JeuDeLoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Définir la durée maximale de jeu en secondes (2 minutes)
        int dureeMax = 120;
        long tempsDebut = System.currentTimeMillis();
        long tempsFin = tempsDebut + (dureeMax * 1000);
        
        // Définir le nombre de tentatives
        int nombreTentatives = 10;
        int tentativesRestantes = nombreTentatives;
        
        System.out.println("Bienvenue dans le jeu de loi!");
        System.out.println("Vous avez " + dureeMax + " secondes et " + nombreTentatives + " tentatives pour obtenir un 6 au dé.");
        
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                long tempsRestant = (tempsFin - System.currentTimeMillis()) / 1000;
                System.out.println("Temps restant : " + tempsRestant + " secondes");
            }
        }, 0, 30000); // Rappel toutes les 30 secondes
        
        boolean gagne = jouerJeuDeLoi(tentativesRestantes);
        
        // Arrêter le timer
        timer.cancel();
        
        if (gagne) {
            System.out.println("Félicitations! Vous avez obtenu un 6 et gagné le jeu de loi!");
        } else {
            System.out.println("Dommage! Vous n'avez pas obtenu un 6 en " + nombreTentatives + " tentatives ou dans le temps imparti.");
        }
        
        scanner.close();
    }
    
    public static boolean jouerJeuDeLoi(int tentativesRestantes) {
        Scanner scanner = new Scanner(System.in);
        int tentativesEffectuees = 0;
        
        while (tentativesRestantes > 0) {
            System.out.println("Appuyez sur Entrée pour lancer le dé (Tentatives restantes : " + tentativesRestantes + ")...");
            scanner.nextLine();
            
            // Lancer un dé (simulé par un nombre aléatoire entre 1 et 6)
            int resultatDu = (int) (Math.random() * 6) + 1;
            System.out.println("Résultat du dé : " + resultatDu);
            
            if (resultatDu == 6) {
                return true; // Vous avez gagné
            }
            
            tentativesRestantes--;
        }
        
        return false; // Vous n'avez pas obtenu un 6 en nombreTentatives tentatives
    }
}
