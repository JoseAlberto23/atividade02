public class Onibus extends Veiculo {
    public static final double CAPACIDADETANQUE = 200;
    public static final double KMPORLITRO = 5;
    public int quantidadeEixos;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String tipoCombustivel, int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiros, tipoCombustivel);
        if (quantidadeEixos < 6 || quantidadeEixos > 8) {
            throw new IllegalArgumentException("O número de eixos do ônibus deve estar entre 6 e 8.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        if (quantidadeEixos < 6 || quantidadeEixos > 8) {
            throw new IllegalArgumentException("O número de eixos do ônibus deve estar entre 6 e 8.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularAutonomia() {
        return CAPACIDADETANQUE * KMPORLITRO;
    }

    @Override
    public String toString(){
        return super.toString() + "Quantidade de eixos: " + quantidadeEixos;
    }
}
