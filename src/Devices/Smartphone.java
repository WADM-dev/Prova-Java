package Devices;

public class Smartphone extends Device implements DevicesInterface{

    private String conector;
    private String botaoBloqueio;

    public java.lang.String getConector() {
        return conector;
    }
    public java.lang.String getBotaoBloqueio() {
        return botaoBloqueio;
    }

    public void performAction() {
        System.out.println("Chamada em Andamento");
    }
}
