package ejercicio7;

public class AgenteCredito implements IAgentePago{
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

        if(ManejadorPrestamo.getInstance().getCantidadPagada() < (ManejadorPrestamo.getInstance().getCantidadOriginal()*50)/100) {
            ManejadorPrestamo.getInstance().setCantidadPagada(ManejadorPrestamo.getInstance().getCantidadPagada() + cantidad);
            System.out.println("Pago realizado con exito por el Agente de credito, Desea refinanciar su prestamo??");

        } else {
            next.pagar(cantidad);
        }
    }


}
