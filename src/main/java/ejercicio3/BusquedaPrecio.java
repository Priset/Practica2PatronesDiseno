package ejercicio3;

import java.util.List;

public class BusquedaPrecio implements IBusqueda{
    @Override
    public void busqueda(List<Celular> celularList, Celular celular) {
        System.out.println("*********Usa busqueda por precio: ************".toUpperCase());

        for (Celular listaCelular : celularList) {
            if(celular.getPrecio() == listaCelular.getPrecio()) {
                listaCelular.showCelular();
            }
        }
    }
}
