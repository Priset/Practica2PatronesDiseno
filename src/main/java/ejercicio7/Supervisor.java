package ejercicio7;

public class Supervisor implements IAgentePago{
    private IAgentePago next;

    @Override
    public void setNext(IAgentePago agentePago) {
        next = agentePago;
    }

    @Override
    public IAgentePago next() {
        return next;
    }

    @Override
    public void pagar(int cantidad) {

        if(ManejadorPrestamo.getInstance().getCantidadPagada() < ManejadorPrestamo.getInstance().getCantidadOriginal()) {
            ManejadorPrestamo.getInstance().setCantidadPagada(ManejadorPrestamo.getInstance().getCantidadPagada() + cantidad);
            System.out.println("Pago realizado con exito por el Supervisor, Desea algun prestamo más?");
            if(ManejadorPrestamo.getInstance().getCantidadPagada() >= ManejadorPrestamo.getInstance().getCantidadOriginal()) {
                System.out.println("Ha completado la totalidad de su pago. Le enviaremos con el Encargado de Prestamos.");
                next.pagar(cantidad);
            }
        } else {
            next.pagar(cantidad);
        }
    }

}
