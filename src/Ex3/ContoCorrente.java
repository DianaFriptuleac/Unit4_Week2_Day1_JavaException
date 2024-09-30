package Ex3;

public class ContoCorrente {
    String titolare;
    private int nMovimenti;
    private final int maxMovimenti = 50;
    private double saldo;


    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    //Getter e setter
    public String getTitolare() {
        return titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    public int getMaxMovimenti() {
        return maxMovimenti;
    }

    public double getSaldo() {
        return saldo;
    }

    //Lancio un'eccezione se il saldo è negativo
    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) saldo = saldo - x;
        else saldo = saldo - x - 0.50;
        nMovimenti++;

        //se il saldo dopo la sottrazione è
        //minore di zero il metodo lancia un'eccezione di tipo BancaException
        if(saldo < 0){
            throw new BancaException("Il conto corrente è in rosso!");
        }
    }

    public double restituisciSaldo() {
        return saldo;
    }
}