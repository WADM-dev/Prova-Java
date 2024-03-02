package Employes;

public abstract class Manager extends Employes implements EmployesInterface {

    private String ajustarFolhaDePonto;
    private String realizarFeedback;

    public String getAjustarFolhaDePonto() {
        return ajustarFolhaDePonto;
    }

    public String getRealizarFeedback() {
        return realizarFeedback;
    }

    @Override
    public void executeTask() {
        System.out.println("Gerente de Seção B");
    }

    @Override
    public void manageTeam() {
        System.out.println("Gerenciando Time");
    }
}
