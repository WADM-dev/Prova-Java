package Transportation;

public class Boat extends Transportation implements TransportationInterface{
    private String todoABombordo;
    private String todoAEstibordo;

    public String getTodoABombordo() {
        return todoABombordo;
    }

    public String getTodoAEstibordo() {
        return todoAEstibordo;
    }

    public void sail(){
        System.out.println("Navegando");
    }

    @Override
    public void travel() {
        System.out.println("Pronto para o melhor Cruzeiro de suas vidas?!");
    }
}
