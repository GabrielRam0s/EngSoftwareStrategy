class Disciplina {
    private String nome;
    private double p1;
    private double p2;
    private ICalcMedia calcMedia;

    public Disciplina(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public void calcularMedia() {
        double media = calcMedia.calculaMedia(p1, p2);
        String situacao = calcMedia.situacao(media);
        System.out.println(
            String.format("P1:%.2f P2:%.2f Media:%.2f Situacao: %s",
            p1, p2, media, situacao)
        );
    }
}