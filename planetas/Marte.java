package planetas;

public class Marte {
    double gravidade = 0.38;
    public double calculoPeso(double pesoNorm){
        double pesoFinal = pesoNorm * gravidade;
        return pesoFinal;
    }
}
