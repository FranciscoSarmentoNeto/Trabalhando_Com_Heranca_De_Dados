public class Futebolista extends Atleta {
    private int numeroDeBolasDeOuro = 0;

    public Futebolista(String nomeDoAtleta, String modalidadeDoAtleta, int idadeDoAtleta, int numeroDeBolasDeOuro) {
        super(nomeDoAtleta, modalidadeDoAtleta, idadeDoAtleta);
        this.numeroDeBolasDeOuro = numeroDeBolasDeOuro;
    }

    @Override
    public void apresentarAtleta() {
        System.out.println("Olá me chamo: " + nomeDoAtleta + " tenho " + idadeDoAtleta + " anos"
                + "  minha modalidade é a seguinte: " + modalidadeDoAtleta + " e tenho " + numeroDeBolasDeOuro
                + " medalhas olímpicas.");
        super.apresentarAtleta();
    }
}
