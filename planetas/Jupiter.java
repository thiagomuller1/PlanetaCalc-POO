package planetas;

public class Jupiter {
    double gravidade = 2.34;
    public double calculoPeso(double pesoNorm){
        double pesoFinal = pesoNorm * gravidade;
        return pesoFinal;
    }
}


