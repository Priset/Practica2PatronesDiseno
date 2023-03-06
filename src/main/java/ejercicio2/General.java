package ejercicio2;

public class General implements IEjercito{
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
        if (tarea.equals("entrevistas")){
            System.out.println("El General: ");
            soldado.showSoldado();
            System.out.println("Pudo realizar la tarea: "+tarea);
        } else {
            System.out.println("El General no pudo realizar la tarea.");
        }
    }
}
