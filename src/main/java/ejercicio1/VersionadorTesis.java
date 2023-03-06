package ejercicio1;

public class VersionadorTesis {
    private Tesis tesis;

    public void setTesis(Tesis tesis) {
        this.tesis = tesis;
    }

    public VersionTesis crearVersionTesis() {

        return new VersionTesis(tesis);

    }

    public Tesis restaurarVersionTesis(VersionTesis versionTesis) {

        System.out.println("*****Restaurando*****");
        this.tesis = versionTesis.getTesis();
        return this.tesis;

    }

}
