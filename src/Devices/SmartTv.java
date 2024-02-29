package Devices;

public class SmartTv extends Device implements DevicesInterface {
    private String aumentaVolume;
    private String abaixaVolume;

    public java.lang.String getAumentaVolume() {
        return aumentaVolume;
    }
    public java.lang.String getAbaixaVolume() {

        return abaixaVolume;
    }

    public void performAction(){
        System.out.println("Acessando StarPlus");
    }
}
