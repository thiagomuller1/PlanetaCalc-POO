package planetas;

public class Netuno {
    double gravidade = 1.12;
    public double calculoPeso(double pesoNorm){
        double pesoFinal = pesoNorm * gravidade;
        return pesoFinal;
    }
}
