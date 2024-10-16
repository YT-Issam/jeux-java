import java.util.Scanner;

public class Macdo {

    public static void main(String[] args) {
        Byte choix = 1;
        boolean reponse = false;
        // Création scanner
        Scanner monScanner = new Scanner(System.in);

        System.out.println("1 filet-o-fish");
         System.out.println("1 wrap chevre");
          System.out.println("1 mcfirst");
           System.out.println("1 fishanddips ");
           System.out.println("Bravo ! tu es un bon muslim ");

       choix = monScanner.nextByte();

        System.out.println("tu a " +choix + "ans");

        if (choix < 18) {
            System.out.println("tu es mineur");
        } else if (choix < 99) {
            System.out.println("tu es majeur");
        } else {
            System.out.println("tu es mort");
        }

        switch(choix) {
            case 1:
            System.out.println("t'aime vraiment");
            break;
            case 2:
            System.out.println("c'est pas bon le chevre");
            break;
            case 3:
            System.out.println("c'est bien tu mange halal");
            break;
            default:
            System.out.println("tu mange rien ?");
        }
         System.out.println("tu veux un bon mouton halal ? 1-oui je suis un bon muslim moi  0-non je mange du port hahah");
         reponse = monScanner.nextBoolean();
         if(reponse){
             System.out.println("1 filet-o-fish");
         System.out.println("1 wrap chevre");
          System.out.println("1 mcfirst");
           System.out.println("1 fishanddips ");
           System.out.println("Bravo ! tu es un bon muslim ");
        }
        System.out.println("beh casse toi la ");

        monScanner.close();
    }
}