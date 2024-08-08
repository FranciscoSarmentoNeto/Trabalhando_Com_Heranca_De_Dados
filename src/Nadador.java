public class Nadador extends Atleta {
    private int numeroDeMedalhasOlimpicas = 0;

    public Nadador(String nomeDoAtleta, String modalidadeDoAtleta, int idadeDoAtleta, int numeroDeMedalhasOlimpicas) {
        super(nomeDoAtleta, modalidadeDoAtleta, idadeDoAtleta);
        this.numeroDeMedalhasOlimpicas = numeroDeMedalhasOlimpicas;
    }

    @Override
    public void apresentarAtleta() {
        System.out.println("Olá me chamo: " + nomeDoAtleta + " tenho " + idadeDoAtleta + " anos"
                + "  minha modalidade é a seguinte: " + modalidadeDoAtleta + " e tenho " + numeroDeMedalhasOlimpicas
                + " medalhas olímpicas.");
        super.apresentarAtleta();
    }
}
