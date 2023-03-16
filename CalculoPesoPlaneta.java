// Feito por Lucas Daniel Gomes e Rennan Beck
public class CalculoPesoPlaneta {
    public static void main(String[] args) {
        SwitchPlanet switchPlanet = new SwitchPlanet();
        InputPeso inputPeso = new InputPeso();
        EscolhaPlaneta escolhaPlaneta = new EscolhaPlaneta();
        double peso = inputPeso.readDouble("Digite seu peso (Kg): ");
        EscolhaPlaneta.ImprimePlaneta();
        int planet = escolhaPlaneta.readInt();
        double resultado = switchPlanet.Switch(planet, peso);
        System.out.println(resultado);
    }
}