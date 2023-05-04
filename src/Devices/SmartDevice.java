package Devices;

import Devices.SmartDevices.SmartPhone;

public abstract class SmartDevice {

        protected String name;
        protected String model;
        protected int ram;
        protected int storage;
        protected int battery;

    public SmartDevice() {}

    public SmartDevice(String name, String model, int ram, int storage, int battery) {
        this.name = name;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.battery = battery;

    }
}
