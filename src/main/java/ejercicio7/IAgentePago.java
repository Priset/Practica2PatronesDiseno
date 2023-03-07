package ejercicio7;

public interface IAgentePago {
    void setNext(IAgentePago agentePago);
    IAgentePago next();
    void pagar(int cantidad);
}
