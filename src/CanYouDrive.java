
import java.util.Scanner;

public class CanYouDrive {
    public static void main(String[] args) {

        System.out.println("Hallo, hoe heet je? ");
        Scanner scanner = new Scanner(System.in);
        String naam = scanner.nextLine();

        System.out.println("Heb je al een scooterrijbewijs? ");
        Boolean scooter = scanner.nextBoolean();


        if (scooter == true) {
            System.out.println("Hallo " + naam + " je mag scooter rijden want je hebt een scooter rijbewijs");
        }
        else if (scooter == false) {
            System.out.println("Helaas");
        }
        System.out.println("Hoe oud ben je? ");
        int oud = scanner.nextByte();


        if (oud == 17) {
            System.out.println("Je mag je rijbewijs halen maar je moet wel begeleid rijden!");
        } else if (oud < 17 & scooter == false) {
            System.out.println("");
        } else if (oud < 16) {
            System.out.println("Sorry " + naam + "je bent nog te jong om auto of scooter te rijden");
        } else if (oud > 18) {
            System.out.println("Gefelicteerd " + naam + " je mag zelfstandig rijden mits je een auto rijbewijs hebt!");
        }


    }
}