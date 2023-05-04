package Devices.SmartDevices;

import Devices.SmartDevice;

public class SmartWatch extends SmartDevice {

    public boolean heartRate;
    public boolean bloodPressure;
    public boolean sportsMode;
    public boolean waterProof;

    public SmartWatch() {}

    @Override
    public String toString() {
        return "SmartWatch{" +
                "heartRate=" + heartRate +
                ", bloodPressure=" + bloodPressure +
                ", sportsMode=" + sportsMode +
                ", waterProof=" + waterProof +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", battery=" + battery +
                '}';
    }

    public SmartWatch(boolean heartRate, boolean bloodPressure, boolean sportsMode, boolean waterProof) {
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.sportsMode = sportsMode;
        this.waterProof = waterProof;

    }
}
