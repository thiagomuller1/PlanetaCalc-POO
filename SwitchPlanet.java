import planetas.*;

public class SwitchPlanet {
    public double Switch(int escolha, double peso) {
        double resultado = 0;
        switch (escolha){

            case 1:
                Mercurio mercurio = new Mercurio();
                resultado=mercurio.calculoPeso(peso);
                break;
            case 2:
                Venus venus = new Venus();
                resultado=venus.calculoPeso(peso);
                break;
            case 3:
                Terra terra = new Terra();
                resultado=terra.calculoPeso(peso);
                break;
            case 4:
                Marte marte = new Marte();
                resultado=marte.calculoPeso(peso);
                break;
            case 5:
                Jupiter jupiter = new Jupiter();
                resultado=jupiter.calculoPeso(peso);
                break;
            case 6:
                Saturno saturno = new Saturno();
                resultado=saturno.calculoPeso(peso);
                break;
            case 7:
                Urano urano = new Urano();
                resultado=urano.calculoPeso(peso);
                break;
            case 8:
                Netuno netuno = new Netuno();
                resultado=netuno.calculoPeso(peso);
                break;
        }
        return resultado;
    }
}
