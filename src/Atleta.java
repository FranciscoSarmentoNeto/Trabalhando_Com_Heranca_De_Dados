public class Atleta {
    String nomeDoAtleta = "";
    String modalidadeDoAtleta = "";
    int idadeDoAtleta = 0;

    public Atleta(String nomeDoAtleta, String modalidadeDoAtleta, int idadeDoAtleta) {
        this.nomeDoAtleta = nomeDoAtleta;
        this.modalidadeDoAtleta = modalidadeDoAtleta;
        this.idadeDoAtleta = idadeDoAtleta;
    }

    public void apresentarAtleta() {
        System.out.println("Olá me chamo: " + nomeDoAtleta + " tenho " + idadeDoAtleta + " anos" + " e minha modalidade é a seguinte: " + modalidadeDoAtleta);
    }

}
