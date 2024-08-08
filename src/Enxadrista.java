public class Enxadrista extends Atleta {
    private int numeroDeRating = 0;

    public Enxadrista(String nomeDoAtleta, String modalidadeDoAtleta, int idadeDoAtleta, int numeroDeRating) {
        super(nomeDoAtleta, modalidadeDoAtleta, idadeDoAtleta);
        this.numeroDeRating = numeroDeRating;
    }

    @Override
    public void apresentarAtleta() {
        System.out.println("Olá me chamo: " + nomeDoAtleta + " tenho " + idadeDoAtleta + " anos"
                + "  minha modalidade é a seguinte: " + modalidadeDoAtleta + " e tenho " + numeroDeRating
                + " pontos de rating.");
        super.apresentarAtleta();
    }
}
