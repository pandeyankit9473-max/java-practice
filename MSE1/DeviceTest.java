interface Device {
    void turnOn();
    void turnOff();
}

class Television implements Device {
    public void turnOn() {
        System.out.println("Television is ON");
    }

    public void turnOff() {
        System.out.println("Television is OFF");
    }
}

public class DeviceTest {
    public static void main(String[] args) {
        Device d = new Television();

        d.turnOn();
        d.turnOff();
    }
}