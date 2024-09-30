package Ex1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();  //x il valore casuale dei nr. dell'array

        int[] arrayOfNumbers = new int[5];

        // Popolo l'array con 5 numeri casuali tra 1 e 10
        for(int i = 0; i < arrayOfNumbers.length; i++){
            arrayOfNumbers[i] = random.nextInt(10) + 1;  // Genera numeri da 1 a 10
        }

        System.out.println("Stampa dell'array iniziale: " + Arrays.toString(arrayOfNumbers));

        while(true) {

            // Inserisci un numero nell'array
            System.out.println("Inserisci un numero diverso da zero, oppure 0 per uscire: ");
            int nr = scanner.nextInt();

            if (nr == 0) {   // Se inserisci 0, termina l'operazione
                break;
            }

            // Inserisci la posizione desiderata
            System.out.println("Inserisci la posizione desiderata da 0 a 4: ");
            int position = scanner.nextInt();

            // Gestisce eventuali errori dovuti alla violazione dei limiti dell'array
            if (position < 0 || position >= arrayOfNumbers.length) {
                System.out.println("La posizione inserita non è valida!");
            } else {
                arrayOfNumbers[position] = nr;
                // Stampa il nuovo array
                System.out.println("Stampa del nuovo array: " + Arrays.toString(arrayOfNumbers));
            }
        }

        scanner.close(); // Chiudo lo scanner
    }

}
