package Transportation;

public class AirPlane extends Transportation implements TransportationInterface {
    private String decolar;
    private String aterrissar;

    public String getDecolar() {
        return decolar;
    }

    public String getAterrissar() {
        return aterrissar;
    }

    public void fly() {
        System.out.println("Avião Decolando");
    }

    @Override
    public void travel() {
        System.out.println("Aperte os cintos, avião DECOLANDO!");
    }
}
