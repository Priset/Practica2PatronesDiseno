package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Inbox implements IWhatsapp {
    List<UsuarioOnline> usuarioOnlines = new ArrayList<>();

    public Inbox addUser(UsuarioOnline usuarioOnline) {
        usuarioOnlines.add(usuarioOnline);
        return this;
    }

    @Override
    public void send(String msg, Persona persona) {
        UsuarioOnline usuarioOnline = (UsuarioOnline) persona;

        if (usuarioOnline.getUsuarios().size() == 1) {
            for (Persona colega : usuarioOnlines) {
                if (colega.getCi().equals(usuarioOnline.getUsuarios().get(0).getCi())) {
                    colega.received(msg);
                }
            }
        } else {
            System.out.println("CAMBIE EL TIPO DE GRUPO.");
        }
    }
}
