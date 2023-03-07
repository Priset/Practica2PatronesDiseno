package ejercicio7;

public class Launch {
    public static void main(String[] args) {
        ManejadorPrestamo.getInstance().setCantidadOriginal(100);

        Banco banco = new Banco();

        banco.pagar(10);
        banco.pagar(25);
        banco.pagar(10);
        banco.pagar(30);
        banco.pagar(25);
    }
}
