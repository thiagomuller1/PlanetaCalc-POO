package planetas;

public class Terra {
     public double gravidade = 1.00;
     public double calculoPeso(double pesoNorm){
          double pesoFinal = pesoNorm * gravidade;
          return pesoFinal;
     }
}
