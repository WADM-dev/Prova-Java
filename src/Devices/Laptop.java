package Devices;

public class Laptop extends Device implements DevicesInterface {

    private String teclado;
    private String Tela;

    private long ssd;

    public java.lang.String getTeclado() {
        return teclado;
    }

    public java.lang.String getTela() {
        return Tela;
    }


    void runSoftware() {
        System.out.println("Abrindo o joguinho da paciência");
    }

    public void performAction() {
        System.out.println("Incializando Windows");
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public void setTela(String tela) {
        Tela = tela;
    }

    public long getSsd() {
        return ssd;
    }

    public void setSsd(long ssd) {
        this.ssd = ssd;
    }
}
