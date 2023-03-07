package ejercicio7;

public class EncargadoPrestamos implements IAgentePago{
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

        if(ManejadorPrestamo.getInstance().getCantidadPagada() >= ManejadorPrestamo.getInstance().getCantidadOriginal()*50/100) {
            System.out.println("Gracias por la confianza le entregamos sus documentos.");

        } else {
            System.out.println("Verifique la entrada!");
        }
    }

}
