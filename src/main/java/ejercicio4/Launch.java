package ejercicio4;

public class Launch {
    public static void main(String[] args) {
        Inbox inbox = new Inbox();
        GrupoWhapp grupoWhapp = new GrupoWhapp();

        UsuarioOnline persona1 = new UsuarioOnline(inbox);
        UsuarioOnline persona2 = new UsuarioOnline(inbox);
        UsuarioOnline persona3 = new UsuarioOnline(inbox);
        UsuarioOnline persona4 = new UsuarioOnline(inbox);
        UsuarioOnline persona5 = new UsuarioOnline(inbox);
        UsuarioOnline persona6 = new UsuarioOnline(inbox);
        UsuarioOnline persona7 = new UsuarioOnline(inbox);
        UsuarioOnline persona8 = new UsuarioOnline(inbox);
        UsuarioOnline persona9 = new UsuarioOnline(inbox);
        UsuarioOnline persona10 = new UsuarioOnline(inbox);

        persona1.setCi("55D4F6").setNombre("Jonas");
        persona2.setCi("2313SDF").setNombre("Jose");
        persona3.setCi("SDFSD4").setNombre("Juan");
        persona4.setCi("FDSG1D65").setNombre("Patty");
        persona5.setCi("DSF898").setNombre("Emanuel");
        persona6.setCi("SDF156").setNombre("Arturo");
        persona7.setCi("HJ4GHJ5").setNombre("Paul");
        persona8.setCi("YUIU879").setNombre("Walter");
        persona9.setCi("NBMB445").setNombre("Enrique");
        persona10.setCi("QEW8879").setNombre("Tadeo");

            inbox.addUser(persona1)
                .addUser(persona2)
                .addUser(persona3).addUser(persona4)
                .addUser(persona5).addUser(persona6)
                .addUser(persona7).addUser(persona8)
                .addUser(persona9)
                .addUser(persona10);

        persona1.addUser(persona2);

        persona1.send("Termina la torre de control pofavo");

        System.out.println("***************************************************************");


        persona1.setiWhatsapp(grupoWhapp);
        persona2.setiWhatsapp(grupoWhapp);
        persona3.setiWhatsapp(grupoWhapp);
        persona4.setiWhatsapp(grupoWhapp);
        persona5.setiWhatsapp(grupoWhapp);
        persona6.setiWhatsapp(grupoWhapp);
        persona7.setiWhatsapp(grupoWhapp);
        persona8.setiWhatsapp(grupoWhapp);
        persona9.setiWhatsapp(grupoWhapp);
        persona10.setiWhatsapp(grupoWhapp);

        grupoWhapp.addUser(persona1)
                .addUser(persona2)
                .addUser(persona3).addUser(persona4)
                .addUser(persona5).addUser(persona6)
                .addUser(persona7).addUser(persona8)
                .addUser(persona9)
                .addUser(persona10);

        persona10.addUser(persona1).addUser(persona2).addUser(persona3).addUser(persona4).addUser(persona5)
                .addUser(persona6).addUser(persona7).addUser(persona8)
                .addUser(persona9);

        persona10.send("Bienvenidos al mundo del bellaqueo.");
    }
}
