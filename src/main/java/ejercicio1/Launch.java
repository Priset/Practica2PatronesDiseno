package ejercicio1;

public class Launch {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Joaquin", "74DS48D");
        VersionadorTesis versionadorTesis = new VersionadorTesis();
        Almacenamiento almacenamiento = new Almacenamiento();

        estudiante.setTesis(new Tesis(56," "));

        for(int i = 0; i<5; i++) {
            String revision = "";
            String version = "";

            switch (i) {

                case 0:
                    revision = "Primera";
                    version = "Primera";
                    break;
                case 1:
                    revision = "Segunda";
                    version = "Segunda";
                    break;

                case 2:
                    revision = "Tercera";
                    version = "Tercera";
                    break;

                case 3:
                    revision = "Cuarta";
                    version = "Cuarta";
                    break;

                case 4:
                    revision = "Quinta";
                    version = "Quinta";
                    break;
            }

            estudiante.setTesis(new Tesis(56, revision));

            versionadorTesis.setTesis(estudiante.getTesis());
            almacenamiento.crearVersionTesis(version + " version", versionadorTesis.crearVersionTesis());


        }

        System.out.println("*****QUINTA VERSION*****");

        estudiante.showEstudiante();

        estudiante.setTesis(versionadorTesis.restaurarVersionTesis(almacenamiento.getVersionTesis("Tercera version")));

        System.out.println("********TERCERA VERSION*********");

        estudiante.showEstudiante();


    }
}

