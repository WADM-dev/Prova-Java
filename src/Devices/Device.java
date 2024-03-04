package Devices;

public class Device {

    private String marca;
    private String cor;
    private double price;
    private long numeroSerie;

    void abastecerEnergia() {
        System.out.println("Ligar aparelho no tomada e/ou carregador");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Device{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", price=" + price +
                ", numeroSerie=" + numeroSerie +
                '}';
    }
}
