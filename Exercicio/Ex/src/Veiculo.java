public abstract class Veiculo {
    public String marca;
    public String modelo;
    public int ano;
    public int capacidadePassageiros;
    public String tipoCombustivel;

    public Veiculo(String marca, String modelo, int ano, int capacidadePassageiros, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadePassageiros = capacidadePassageiros;
        this.tipoCombustivel = tipoCombustivel;
    }

    public abstract double calcularAutonomia();

    @Override
    public String toString() {
        return "Veiculo" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", capacidadePassageiros=" + capacidadePassageiros +
                ", tipoCombustivel='" + tipoCombustivel;
    }
}