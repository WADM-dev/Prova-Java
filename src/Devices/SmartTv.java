package Devices;

public class SmartTv extends Device implements DevicesInterface {
    private String aumentaVolume;
    private String abaixaVolume;
    private String smartOs;

    public java.lang.String getAumentaVolume() {
        return aumentaVolume;
    }

    public java.lang.String getAbaixaVolume() {

        return abaixaVolume;
    }

    void streamContent() {
        System.out.println("Abrindo The Witcher na Netflix");
    }

    public void performAction() {
        System.out.println("Acessando StarPlus");
    }

    public void setAumentaVolume(String aumentaVolume) {
        this.aumentaVolume = aumentaVolume;
    }

    public void setAbaixaVolume(String abaixaVolume) {
        this.abaixaVolume = abaixaVolume;
    }

    public String getSmartOs() {
        return smartOs;
    }

    public void setSmartOs(String smartOs) {
        this.smartOs = smartOs;
    }
}
