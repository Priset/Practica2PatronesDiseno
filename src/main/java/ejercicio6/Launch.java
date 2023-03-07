package ejercicio6;

public class Launch {
    public static void main(String[] args) {
        ChatIndividual chatIndividual = new ChatIndividual();
        ChatGrupal chatGrupal = new ChatGrupal();

        SalaDesarrollador desarrollador1 = new SalaDesarrollador(chatIndividual);
        SalaDesarrollador desarrollador2 = new SalaDesarrollador(chatIndividual);

        chatIndividual.addDesarrolador(desarrollador1).addDesarrolador(desarrollador2);

        desarrollador1.setNombre("Jonas").setCi("87987SDFDSF");
        desarrollador2.setNombre("Jose").setCi("798SDFDDSF");

        desarrollador1.setColega(desarrollador2);

        desarrollador1.send("Buenos días colega.");

        System.out.println("***************************************************");

        SalaDesarrollador desarrollador3 = new SalaDesarrollador(chatGrupal);
        SalaDesarrollador desarrollador4 = new SalaDesarrollador(chatGrupal);
        SalaDesarrollador desarrollador5 = new SalaDesarrollador(chatGrupal);


        desarrollador3.setNombre("Paul").setCi("4984SFDDSF");
        desarrollador4.setNombre("Roman").setCi("4894SDFSD");
        desarrollador5.setNombre("Arturo").setCi("198SDFDF");

        chatGrupal.addDesarrolador(desarrollador3)
                .addDesarrolador(desarrollador4).addDesarrolador(desarrollador5);


        desarrollador4.send("Entren al servidor ya esta abierto.");

    }
}
