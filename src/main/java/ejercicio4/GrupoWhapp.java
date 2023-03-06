package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class GrupoWhapp implements IWhatsapp{
    private List<UsuarioOnline> usuarioOnlines = new ArrayList<>();

    public GrupoWhapp addUser(UsuarioOnline usuarioOnline) {
        usuarioOnlines.add(usuarioOnline);
        return this;
    }

    @Override
    public void send(String msg, Persona persona) {
        UsuarioOnline usuarioOnline = (UsuarioOnline) persona;

        for(UsuarioOnline colega : usuarioOnlines) {

            for(UsuarioOnline colegaRemitente : usuarioOnline.getUsuarios()) {

                if (!usuarioOnline.getCi().equals(colega.getCi())) {

                    if (colega.getCi().equals(colegaRemitente.getCi())) {
                        colega.received(msg);

                    }
                }

            }

        }
    }
}
