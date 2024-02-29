package Devices;
import java.util.ArrayList;
import java.util.List;

public abstract class Device {
    public static void main(String[] args){

        List<DevicesInterface> Devices = new ArrayList<>();
        Devices.add(new Smartphone());
        Devices.add(new Laptop());
        Devices.add(new SmartTv());

        for (DevicesInterface device : Devices.toArray(new DevicesInterface[0])) {
            device.performAction();
        }

    }




}
