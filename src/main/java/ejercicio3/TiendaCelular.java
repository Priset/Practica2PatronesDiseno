package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class TiendaCelular {

    private List<Celular> ventaCelular = new ArrayList<>();
    private IBusqueda busqueda;

    public TiendaCelular() {
    }

    public List<Celular> getVentaCelular() {
        return ventaCelular;
    }

    public void setVentaCelular(List<Celular> ventaCelular) {
        this.ventaCelular = ventaCelular;
    }

    public IBusqueda getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(IBusqueda busqueda) {
        this.busqueda = busqueda;
    }

    public void addCelular(Celular celular) {
        ventaCelular.add(celular);
    }

    public void buscarCelular(Celular celular) {
        if (ventaCelular.size() < 10) {

            if (celular.getPrecio() == 0) {

                setBusqueda(new BusquedaModelo());

            } else if (celular.getModelo() == null) {

                setBusqueda(new BusquedaPrecio());

            } else {

                setBusqueda(new BusquedaPrecioModelo());

            }

        }
        busqueda.busqueda(ventaCelular, celular);
    }
}
