package ejercicio3;

public class Launch {
    public static void main(String[] args) {
        TiendaCelular tiendaCelular = new TiendaCelular();

        tiendaCelular.addCelular(new Celular("J5", "Samsung", "Baja", 1500));
        tiendaCelular.addCelular(new Celular("Note10", "Samsung", "Alta", 7000));
        tiendaCelular.addCelular(new Celular("Honor 50", "Honor", "Media", 3000));
        tiendaCelular.addCelular(new Celular("Honor 80", "Honor", "Alta", 5000));
        tiendaCelular.addCelular(new Celular("IPhone 14", "IPhone", "Alta", 7000));
        tiendaCelular.addCelular(new Celular("IPhone 8", "IPhone", "Alta", 5000));

        tiendaCelular.buscarCelular(new Celular("Honor 50", "", "",3000));
        tiendaCelular.buscarCelular(new Celular("Honor 80", "", "",0));
        tiendaCelular.buscarCelular(new Celular(null, "", "",7000));
    }
}
