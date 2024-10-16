import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RestaurantApp {
    public static void main(String[] args) {
        LocalDateTime heureCommande = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Bienvenue dans notre restaurant !");
        System.out.println("Heure de la commande : " + heureCommande.format(formatter));
        
        // Ici, vous pouvez ajouter la logique pour prendre la commande.

        System.out.println("Merci pour votre commande !");
        System.out.println("Heure de la commande : " + heureCommande.format(formatter));
    }
}
