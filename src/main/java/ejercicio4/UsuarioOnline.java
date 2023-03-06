package ejercicio4;

public class UsuarioOnline extends Persona{
    public UsuarioOnline(IWhatsapp whatsapp) {
        super(whatsapp);
    }

    @Override
    public void send(String msg) {
        iWhatsapp.send(msg, this);
    }

    @Override
    public void received(String msg) {
        System.out.println("Nombre: "+getNombre()+" CI: "+getCi()+" recibe: "+msg);
    }
}
