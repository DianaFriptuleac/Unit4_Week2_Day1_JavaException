package Ex3;

public class BancaException extends Exception{
    public BancaException(String str){
        super("La stringa inserita "+ str + " non è valida!");
    }
}
