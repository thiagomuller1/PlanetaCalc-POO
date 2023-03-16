package planetas;

public class Venus {
    double gravidade = 0.91;
    public double calculoPeso(double pesoNorm){
        double pesoFinal = pesoNorm * gravidade;
        return pesoFinal;
    }
}
