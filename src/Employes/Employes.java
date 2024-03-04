package Employes;

import java.util.ArrayList;
import java.util.List;
public abstract class Employes {
    public static void main(String[] args) {

        List<EmployesInterface> Employes = new ArrayList<>();
        Employes.add(new Manager() {
            @Override
            public void analyzeData() {

            }

            @Override
            public void makeDecisions() {

            }

            @Override
            public void executeTask() {
                super.executeTask();
            }
        });
        Employes.add(new Analyst() {
            @Override
            public void manageTeam() {

            }

            @Override
            public void makeDecisions() {

            }

            @Override
            public void executeTask() {
                super.executeTask();
            }
        });
        Employes.add(new Director() {
            @Override
            public void manageTeam() {

            }

            @Override
            public void analyzeData() {

            }

            @Override
            public void executeTask() {
                super.executeTask();
            }
        });

        for (EmployesInterface employe : Employes) {
            employe.executeTask();
        }
    }
}
