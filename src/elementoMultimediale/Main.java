package elementoMultimediale;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<ElementoMultimediale> elementi =new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di elemento (1=Immagine, 2=Audio, 3=Video): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            switch (tipo){

                case 1:
                    System.out.println("Inserisci la luminosità: ");
                    int luminosita = scanner.nextInt();
                    elementi.add(new Img(titolo, luminosita));
                    break;

                case 2:
                    System.out.println("Inserisci la durata: ");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeAudio = scanner.nextInt();
                    elementi.add(new Audio(titolo, durataAudio, volumeAudio));
                    break;

                case 3:
                    System.out.println("Inserisci la durata: ");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità: ");
                    int luminositaVideo = scanner.nextInt();
                    elementi.add(new Video(titolo, durataVideo, volumeVideo, luminositaVideo));
                    break;

                default:
                    System.out.println("Tipo non valido.");
                    i--;
                    break;
            }

        }

        int scelta;

        do {
            System.out.println("Scegli un elemento da eseguire (1-" + elementi.size() + ") oppure 0 per terminare: ");
            scelta = scanner.nextInt();

            if (scelta > 0 && scelta <= elementi.size()) {
                ElementoMultimediale elemento = elementi.get(scelta - 1);
                elemento.show();
            } else if (scelta != 0) {
                System.out.println("Scelta non valida. Inserisci un numero tra 1 e " + elementi.size() + " oppure 0 per uscire.");
            }
        } while (scelta != 0);
        System.out.println("Programma terminato.");

        scanner.close();

    }
}
