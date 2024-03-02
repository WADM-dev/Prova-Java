package Employes;

import java.util.ArrayList;
import java.util.List;
public abstract class Employes {
    public static void main(String[] args) {

        List<EmployesInterface> Employes = new ArrayList<>();
        Employes.add(new Manager());
        Employes.add(new Analyst());
        Employes.add(new Director());

        for (EmployesInterface employe : Employes.toArray(new EmployesInterface[0])) {
            employe.executeTask();
        }
    }
}
