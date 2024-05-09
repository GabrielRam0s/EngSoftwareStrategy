class MediaAritmetica implements ICalcMedia {
    @Override
    public double calculaMedia(double p1, double p2) {
        return (p1 + p2) / 2.0;
    }

    @Override
    public String situacao(double media) {
        return media > 5.0 ? "Aprovado" : "Reprovado";
    }
}

