package Employes;

public abstract class Director extends Employes implements EmployesInterface{

    private String realizarConvencaoGeral;
    private String tomarDecisoes;
    public String getRealizarConvencaoGeral() {
        return realizarConvencaoGeral;
    }

    public String getTomarDecisoes() {
        return tomarDecisoes;
    }

    @Override
    public void executeTask() {
        System.out.println("Diretor executivo");
    }

    @Override
    public void makeDecisions() {
        System.out.println("Tomando Decisões");
    }
}
