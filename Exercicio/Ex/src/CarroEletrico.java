public class CarroEletrico extends Carro{

    public static final double CONSUMOKWH = 5;
    public double bateriakwh;
    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros,String tipoCombustivel,double bateriakwh) {
        super(marca, modelo, ano, capacidadePassageiros, tipoCombustivel);
        this.bateriakwh = bateriakwh;
    }

    @Override
    public double calcularAutonomia(){
        return CONSUMOKWH * bateriakwh;
    }

    @Override
    public String toString() {
        return super.toString() + ", Consumo KWH: " + CONSUMOKWH;
    }
}
