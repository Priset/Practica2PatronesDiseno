package ejercicio3;

import java.util.List;

public class BusquedaPrecioModelo implements IBusqueda{

    @Override
    public void busqueda(List<Celular> celularList, Celular celular) {
        System.out.println("*********Usa busqueda por precio y modelo: ************".toUpperCase());

        for (Celular listaCelular : celularList) {
            if(celular.getPrecio() == listaCelular.getPrecio() && celular.getModelo().equals(listaCelular.getModelo())) {
                listaCelular.showCelular();
            }
        }
    }

}
