package Employes;

public abstract class Analyst extends Employes implements EmployesInterface{

    private String analiseDeRequisitos;
    private String criarPlanilhas;

    public String getAnaliseDeRequisitos() {
        return analiseDeRequisitos;
    }

    public String getCriarPlanilhas() {
        return criarPlanilhas;
    }

    @Override
    public void executeTask() {
        System.out.println("Analista de Planejamento");
    }

    @Override
    public void analyzeData() {
        System.out.println("Analisando Datas");
    }
}
