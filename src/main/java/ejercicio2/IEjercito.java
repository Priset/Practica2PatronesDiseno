package ejercicio2;

public interface IEjercito {
    void setNext(IEjercito ejercito);
    IEjercito next();

    void orden(Soldado soldado, String tarea);
}
