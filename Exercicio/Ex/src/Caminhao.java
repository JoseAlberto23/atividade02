public class Caminhao extends Veiculo{
    public static final double CAPACIDADETANQUE =300;
    public static final double KMPORLITRO =6;
    public double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros,String tipoCombustivel, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, tipoCombustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAutonomia(){
        if(capacidadeCarga == 0){
            return CAPACIDADETANQUE*KMPORLITRO;
        } else if (capacidadeCarga >=1 && capacidadeCarga <=25) {
              double porcentual = capacidadeCarga * 1;
              double kmLitroAjustado = KMPORLITRO - (KMPORLITRO *porcentual/100);
              return kmLitroAjustado * CAPACIDADETANQUE;
        } else {
            System.out.println(" Peso de carga acima do limite");
            return 0;
        }
    }

    @Override
    public String toString(){
        return "Veiculo" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", capacidadePassageiros=" + capacidadePassageiros +
                ", tipoCombustivel='" + tipoCombustivel +
                ", Capacidade de carga= " + capacidadeCarga;
    }
}


