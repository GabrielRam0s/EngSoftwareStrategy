public class Main {
    public static void main(String[] args) {
        MediaAritmetica calculo = new MediaAritmetica(); 
        // MediaGeometrica calculo = new MediaGeometrica();
        Disciplina d = new Disciplina(calculo);
        d.setNome("Padroes de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.calcularMedia();
    }
}
