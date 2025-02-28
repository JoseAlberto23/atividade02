public class CaminhaoRefrigerado extends Caminhao {

    private double temperaturaMinima;

    public CaminhaoRefrigerado(String marca, String modelo, int ano, int capacidadePassageiros, String tipoCombustivel, double capacidadeCarga, double temperaturaMinima) {
        super(marca, modelo, ano, capacidadePassageiros, tipoCombustivel, capacidadeCarga);
        this.temperaturaMinima = temperaturaMinima;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public double calcularAutonomia() {
        double autonomia = super.calcularAutonomia();


        autonomia = autonomia * 0.90;
        return autonomia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Temperatura Mínima: " + temperaturaMinima +
                " Capacidade de carga: " + capacidadeCarga +
                " Capacidade do tanque: " +CAPACIDADETANQUE +
                " Km por litro: " +KMPORLITRO;
    }
}
