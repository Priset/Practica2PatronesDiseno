package ejercicio2;

public class Teniente implements IEjercito{
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
        if (tarea.equals("disciplina")){
            System.out.println("El Teniente: ");
            soldado.showSoldado();
            System.out.println("Pudo realizar la tarea: "+tarea);
        } else {
            System.out.println("El Teniente no pudo realizar la tarea, se la comunica a su superior.");
            next.orden(soldado, tarea);
        }
    }
}
