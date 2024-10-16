import java.util.Scanner;
public class MonPgm {

    public static void main(String[] args) {
        Scanner monScanner = new Scanner (System.in);
        short timer = 0;
        short compteur = 0;
        int maxEssais = 5; // Maximum de tentatives
        int essais = 0;
        short nbMystere = 58;
        short proposition = 0;
         System.out.println("vroum vroum " );

        for ( compteur = 10 ; compteur > timer ; compteur--){
        System.out.println(compteur );
        // compteur = (short)(compteur + 1);
        }
compteur = 18;
System.out.println("Bienvenue dans le jeu du nombre mystère!");

while (essais < maxEssais) {
    System.out.println("Tentative " + (essais + 1) + " sur " + maxEssais);
    System.out.println("Entrez un nombre : ");
    proposition = monScanner.nextShort();

    if (proposition < nbMystere) {
        System.out.println("C'est trop bas !");
    } else if (proposition > nbMystere) {
        System.out.println("C'est trop haut !");
    } else {
        System.out.println("Bravo, vous avez trouvé le nombre mystère !");
        break; // Sort de la boucle si le nombre est trouvé
    }

    essais++;
}

if (essais == maxEssais) {
    System.out.println("Vous avez utilisé toutes vos tentatives. Le nombre mystère était " + nbMystere);
}
        
        

           System.out.println("Perdu vous êtes nul en faite entrainez vous" );













        // Scanner monScanner = new Scanner(System.in);
        //  System.out.println("Quelle age avez vous ?");
        //  Byte age = monScanner.nextByte();
        //  System.out.println("vous avez" + age +"ans" );


      

        

        // if (age > 100) {
        //     System.out.println("tu es mineur");
        // } else if (age < 100 && age > 30) {
        //     System.out.println("tu es un vieux croulant");
        // } else {
        //     System.out.println("tu es mort");
        // }

        // switch(age) {
        //     case 43:
        //     System.out.println("tu es vieux");
        //     break;
        //     case 50:
        //     System.out.println("veiux");
        //     break;
        //     default:
        //     System.out.println("va au travail");
        //     break;
        // }

        monScanner.close();
    }

    @Override
    public String toString() {
        return "MonPgm []";
    }
}


//  3 boucle dans 6 mois une 4 eme 

// while = tant que je cour pas  alors je fais sa = réagis a un evenement

// for = boucle parcours 

// do while = faire ceci tant que 