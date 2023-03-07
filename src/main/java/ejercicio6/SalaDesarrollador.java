package ejercicio6;

public class SalaDesarrollador extends Desarrollador{
    public SalaDesarrollador(IChat salaChat) {
        super(salaChat);
    }

    @Override
    public void send(String msg) {
        salaChat.send(msg, this);
    }
    @Override
    public void received(String msg) {
        System.out.println("Mensaje para: " + getNombre() +": " + msg);
    }

}
