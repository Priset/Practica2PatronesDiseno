package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class ChatGrupal implements IChat {
    private List<SalaDesarrollador> desarrolladores = new ArrayList<>();

    public ChatGrupal addDesarrolador(SalaDesarrollador desarroladorSala) {
        desarrolladores.add(desarroladorSala);
        return this;
    }

    @Override
    public void send(String msg, Desarrollador desarrollador) {
        SalaDesarrollador salaDesarrollador = (SalaDesarrollador) desarrollador;
        for(Desarrollador desarrolladorColega: desarrolladores) {
            if(!desarrolladorColega.getCi().equals(salaDesarrollador.getCi())) {
                desarrolladorColega.received(msg);
            }

        }

    }
}
