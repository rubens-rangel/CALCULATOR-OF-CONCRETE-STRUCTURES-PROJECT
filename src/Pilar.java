public class Pilar {
    public double largura;
    public double altura;
    public double comprimento;

    public double calculo() {
        double  volume = (((comprimento * altura) * largura) / 1000);
        return  volume;
    }
}