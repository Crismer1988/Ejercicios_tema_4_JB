package Devices.SmartDevices;

import Devices.SmartDevice;

public class SmartPhone extends SmartDevice {

    public int cameraMegapixels;
    public boolean fastCharge;
    public double screenSize;
    public boolean nfcSensor;

    public SmartPhone() {}

    @Override
    public String toString() {
        return "SmartPhone{" +
                "cameraMegapixels=" + cameraMegapixels +
                ", fastCharge=" + fastCharge +
                ", screenSize=" + screenSize +
                ", nfcSensor=" + nfcSensor +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", battery=" + battery +
                '}';
    }

    public SmartPhone(int cameraMegapixels, boolean fastCharge, double screenSize, boolean nfcSensor) {
        this.cameraMegapixels = cameraMegapixels;
        this.fastCharge = fastCharge;
        this.screenSize = screenSize;
        this.nfcSensor = nfcSensor;

    }
}