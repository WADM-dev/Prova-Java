import Devices.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<DevicesInterface> devicesI = new ArrayList<>();
//        devicesI.add(new Smartphone());
//        devicesI.add(new Laptop());
//        devicesI.add(new SmartTv());
//
//        for (DevicesInterface device : devicesI) {
//            device.performAction();
//        }

        Smartphone smartphone = new Smartphone();
        smartphone.setConector("a");

        Laptop laptop = new Laptop();
        laptop.setSsd(256L);

        SmartTv tv = new SmartTv();
        tv.setAbaixaVolume("Abaixando 1");

        List<Device> devices = new ArrayList<>();
        devices.add(smartphone);
        devices.add(laptop);
        devices.add(tv);

        for (Device device : devices) {
            System.out.println(device);
        }
    }
}
