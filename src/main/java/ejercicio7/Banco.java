package ejercicio7;

public class Banco implements IAgentePago{
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

        Cajero cajero = new Cajero();
        AgenteCredito agenteCredito = new AgenteCredito();
        Supervisor supervisor = new Supervisor();
        EncargadoPrestamos encargadoPrestamos = new EncargadoPrestamos();

        this.setNext(cajero);
        cajero.setNext(agenteCredito);
        agenteCredito.setNext(supervisor);
        supervisor.setNext(encargadoPrestamos);

        this.next.pagar(cantidad);

    }

}
