package Devices;

public class Laptop extends Device implements DevicesInterface{

    private String teclado;
    private String Tela;

    public java.lang.String getTeclado() {
        return teclado;
    }

    public java.lang.String getTela() {
        return Tela;
    }

    public void performAction() {

        System.out.println("Incializando Windows");

    }
}
