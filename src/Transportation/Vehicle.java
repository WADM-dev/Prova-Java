package Transportation;

public abstract class Vehicle extends Transportation implements TransportationInterface{
    private String ararTerra;
    private String motorDeArranque;

    public String getArarTerra() {
        return ararTerra;
    }

    public String getMotorDeArranque() {
        return motorDeArranque;
    }



    public void ligarMotor() {
        System.out.println("Veículo Ligado");
    }

    @Override
    public void travel() {
        System.out.println("Veículo pronto para viagem");
    }
}
