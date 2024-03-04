package Devices;

public class Smartphone extends Device implements DevicesInterface {

    private String conector;
    private String botaoBloqueio;

    private long mahBateriaLitio;

    public java.lang.String getConector() {
        return conector;
    }

    public java.lang.String getBotaoBloqueio() {
        return botaoBloqueio;
    }

    void makeCall() {
        System.out.println("Realizando a ligação pro mozão");
    }

    public void performAction() {
        System.out.println("Chamada em Andamento");
    }

    public void setConector(String conector) {
        this.conector = conector;
    }

    public void setBotaoBloqueio(String botaoBloqueio) {
        this.botaoBloqueio = botaoBloqueio;
    }

    public long getMahBateriaLitio() {
        return mahBateriaLitio;
    }

    public void setMahBateriaLitio(long mahBateriaLitio) {
        this.mahBateriaLitio = mahBateriaLitio;
    }
}
