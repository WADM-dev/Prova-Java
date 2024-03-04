package Transportation;

import Employes.EmployesInterface;
import Employes.Manager;

import java.util.ArrayList;
import java.util.List;
public class Transportation {

    public static void main(String[] args) {
        List<TransportationInterface> transportation = new ArrayList<>();
        transportation.add(new Vehicle() {
            @Override
            public void travel() {
                super.travel();
            }
        });
        transportation.add(new Car() {
            @Override
            public void travel() {
                super.travel();
            }
        });
        transportation.add(new AirPlane() {
            @Override
            public void travel() {
                super.travel();
            }
        });
        transportation.add(new Boat() {
            @Override
            public void travel() {
                super.travel();
            }
        });
    }
}
