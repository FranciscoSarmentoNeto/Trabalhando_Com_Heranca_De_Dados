public class App {
    /*
     * Elabore um programa em Java que gerencie jogadores de diferentes esportes (mínimo de dois), 
     * utilizando herança para compartilhar comportamentos e atributos comuns 
     * entre jogadores de esportes diferentes.
     */

    public static void main(String[] args) throws Exception {
       
        Enxadrista enxadrista = new Enxadrista("Magnus Carslsen", "Xadrez", 33, 2832);
        Futebolista futebolista = new Futebolista("Lionel Messi", "Futebol", 37, 9);
        Nadador nadador = new Nadador("Michael Phelps", "Natação", 39, 28);

        enxadrista.apresentarAtleta();
        futebolista.apresentarAtleta();
        nadador.apresentarAtleta();

    }
}
