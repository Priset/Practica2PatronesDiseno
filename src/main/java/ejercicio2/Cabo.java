package ejercicio2;

public class Cabo implements IEjercito{
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
        if (tarea.equals("limpiezas")){
            System.out.println("El Cabo: ");
            soldado.showSoldado();
            System.out.println("Pudo realizar la tarea: "+tarea);
        } else {
            System.out.println("El Cabo no pudo realizar la tarea, se la comunica a su superior.");
            next.orden(soldado, tarea);
        }
    }
}
