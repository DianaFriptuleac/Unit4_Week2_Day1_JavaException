package Ex2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args){
        //Interi

      /*  try{
            System.out.println("Inserisci in numero di km percorsi: ");
            int km = scanner.nextInt();

            System.out.println("Inserisci i litri consumati: ");
            int litri = scanner.nextInt();

         //km/litro
            int consumo = km/litri;
            System.out.println("Il consumo è stato di "+consumo + "km per litro.");
        }catch (ArithmeticException e){
            //Se inserizco 0 litri
            System.out.println("I litri inseriti sono = 0. Non puoi dividere per zero!!!");
        } finally {
            scanner.close();
        }
*/

//Decimali

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Inserisci il numero di km percorsi: ");
            String kmInput = scanner.next().replace(",", "."); // Sostituisci eventuali virgole con il punto
            double km = Double.parseDouble(kmInput);

            System.out.println("Inserisci i litri consumati: ");
            String litriInput = scanner.next().replace(",", "."); // Sostituisci eventuali virgole con il punto
            double litri = Double.parseDouble(litriInput);

            if (litri == 0) {
                //mi lancio nell'ecezione perche don i double la divisione per zero e consentita e il risultato e
                //infinito o NAN.
                throw new ArithmeticException("Non puoi dividere per zero!");
            }

            //km/litro
            double consumo = km / litri;
            System.out.println("Il consumo è stato di " + consumo + "km per litro.");
        } catch (ArithmeticException e) {
            //Se inserizco 0 litri
            System.out.println("I litri inseriti sono = 0. Non puoi dividere per zero!!!");
        }



    }
}
