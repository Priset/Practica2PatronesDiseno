package ejercicio2;

public class Launch {
    public static void main(String[] args) {
        CuerpoDelEjercito ejercito = new CuerpoDelEjercito();

        ejercito.orden(new Soldado("Arturo", "7SDDFDSF"),"entrevistas");
        //ejercito.orden(new Soldado("Roman", "DDS16516"),"disciplina");
        //ejercito.orden(new Soldado("Joaquin","7879QWWE"),"desbloqueos/manifestaciones");
        //ejercito.orden(new Soldado("Jonas", "ETERT78941"),"limpiezas");
    }
}
