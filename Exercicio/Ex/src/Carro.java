public class Carro extends Veiculo{

    public static final double CAPACIDADETANQUE =50;
    public static final double KMPORLITRO =12;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String tipoCombustivel) {
        super(marca, modelo, ano, capacidadePassageiros, tipoCombustivel);
    }


    @Override
    public double calcularAutonomia(){
        return CAPACIDADETANQUE*KMPORLITRO;
    }


}
