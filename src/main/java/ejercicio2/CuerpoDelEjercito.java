package ejercicio2;

public class CuerpoDelEjercito implements IEjercito{
    private IEjercito next;

    @Override
    public void setNext(IEjercito ejercito) {
        next=ejercito;
    }

    @Override
    public IEjercito next() {
        return next;
    }

    @Override
    public void orden(Soldado soldado, String tarea) {
       Cabo cabo = new Cabo();
       Coronel coronel = new Coronel();
       Teniente teniente = new Teniente();
       General general = new General();

       this.setNext(cabo);
       cabo.setNext(coronel);
       coronel.setNext(teniente);
       teniente.setNext(general);

       this.next.orden(soldado, tarea);
    }
}
