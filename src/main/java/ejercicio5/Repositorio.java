package ejercicio5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Repositorio implements IRepositorio{
    private Map<String, Commit> almacenamieto = new LinkedHashMap<>();

    private List<IDesarrollador> desarrolladores = new ArrayList<>();

    public void createCommit(String commitIdentifier, Commit commit) {

        almacenamieto.put(commitIdentifier, commit);

    }

    public Commit getCommit(String commitIdentifier) {

        return almacenamieto.get(commitIdentifier);

    }

    @Override
    public void agregar(IDesarrollador desarrollador) {
        desarrolladores.add(desarrollador);
    }

    @Override
    public void eliminarTodo() {
        desarrolladores.clear();
    }

    @Override
    public void notificacionDesarrolladores(Commit commit) {

        for(IDesarrollador desarrollador: desarrolladores) {
            desarrollador.update("Commit Recuperado", commit);
        }

    }
}
