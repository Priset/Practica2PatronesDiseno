package ejercicio3;

public class Celular {

    private String modelo;
    private String marca;
    private String gamma;
    private int precio;

    public Celular(String modelo, String marca, String gamma, int precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.gamma = gamma;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGamma() {
        return gamma;
    }

    public void setGamma(String gamma) {
        this.gamma = gamma;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void showCelular(){
        System.out.println("********CELULAR***********");
        System.out.println("Modelo: "+getModelo());
        System.out.println("Marca: "+getMarca());
        System.out.println("Gamma: "+getGamma());
        System.out.println("Precio: "+getPrecio());
    }
}
