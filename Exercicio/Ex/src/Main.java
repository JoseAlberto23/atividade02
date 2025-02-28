//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Veiculo busao = new Onibus("Vovlo", "suv", 2024, 30, "Gasolina",8);

        Veiculo refrigerado = new CaminhaoRefrigerado("Volvo", "caminhão", 2024, 5, "Gasolina",
        10, 8);

        Veiculo caminhao = new Caminhao("volvo ", "caminhão", 2021, 2, "gasolina", 10);

        System.out.println(caminhao.toString());

        System.out.println(refrigerado.toString());



    }
}