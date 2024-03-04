package Transportation;

public class Car extends Transportation implements TransportationInterface {
    private int quantidadeDePortas;
    private String cor;

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public String getCor() {
        return cor;
    }

    public void drive() {
        System.out.println("Dirigindo o Carro");
    }

    @Override
    public void travel() {
        System.out.println("Carro pronto para partida");
    }
}
