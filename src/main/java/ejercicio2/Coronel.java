package ejercicio2;

public class Coronel implements IEjercito{
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
        if (tarea.equals("desbloqueos/manifestaciones")){
            System.out.println("El Coronel: ");
            soldado.showSoldado();
            System.out.println("Pudo realizar la tarea: "+tarea);
        } else {
            System.out.println("El Coronel no pudo realizar la tarea, se la comunica a su superior.");
            next.orden(soldado, tarea);
        }
    }
}
