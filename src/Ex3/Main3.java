package Ex3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        //Istanzio un ContoCorrente e un ContoOnline
        ContoCorrente contoAnna = new ContoCorrente("Anna Margini", 3850);
        ContoOnLine contoAnnaOnline = new ContoOnLine("Luigi Verdi", 4500, 600);

        try{
            //Prelievo ContoCorrente
            System.out.println("Inserisci l'importo da prelevare dal tuo ContoCorrente: ");
            double conntanti = scanner.nextDouble();
            contoAnna.preleva(conntanti);
            System.out.println("Prelevato! Il saldo attuale: "+ contoAnna.restituisciSaldo() + " euro");

            //Prelievo ContoOnline
            System.out.println("Inserisci l'importo da prelevare dal tuo ContoOnline: ");
            double conntanti2 = scanner.nextDouble();
            contoAnnaOnline.preleva(conntanti2);
            System.out.println("Prelevato! Il saldo attuale: "+ contoAnnaOnline.restituisciSaldo() + " euro");

        } catch (BancaException e){
            //se il prelievo non e valido
            System.out.println("Errore " +e.getMessage());
        } catch (Exception e){
            System.out.println("Errore generico "+ e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
