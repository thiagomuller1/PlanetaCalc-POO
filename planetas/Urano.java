package planetas;

public class Urano {
    double gravidade = 0.92;
    public double calculoPeso(double pesoNorm){
        double pesoFinal = pesoNorm * gravidade;
        return pesoFinal;
    }
}
