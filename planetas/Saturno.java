package planetas;

public class Saturno {
    double gravidade = 0.93;
    public double calculoPeso(double pesoNorm){
        double pesoFinal = pesoNorm * gravidade;
        return pesoFinal;
    }
}
