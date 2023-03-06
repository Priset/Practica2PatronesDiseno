package ejercicio3;

import java.util.List;

public class BusquedaModelo implements IBusqueda{
    @Override
    public void busqueda(List<Celular> celularList, Celular celular) {
        System.out.println("*********Usa busqueda por modelo: ************".toUpperCase());

        for (Celular listaCelular : celularList) {
            if(celular.getModelo().equals(listaCelular.getModelo())) {
                listaCelular.showCelular();
            }
        }
    }
}
