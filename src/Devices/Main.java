package Devices;

import Devices.SmartDevices.SmartPhone;
import Devices.SmartDevices.SmartWatch;

public class Main {
    public static void main(String[] args) {

        // Smartphone Samsung Galaxy S22
        SmartPhone samsungPhone = new SmartPhone();
        samsungPhone.name = "Galaxy";
        samsungPhone.model = "S22";
        samsungPhone.ram = 6;
        samsungPhone.storage = 64;
        samsungPhone.battery = 3500;
        samsungPhone.cameraMegapixels = 60;
        samsungPhone.fastCharge = true;
        samsungPhone.screenSize = 6.1;
        samsungPhone.nfcSensor = true;

        // Smartwatch Samsung Galaxy Watch 4
        SmartWatch samsungWatch = new SmartWatch();
        samsungWatch.name = "Galaxy";
        samsungWatch.model = "Watch4";
        samsungWatch.ram = 2;
        samsungWatch.storage = 16;
        samsungWatch.battery = 2000;
        samsungWatch.heartRate = true;
        samsungWatch.bloodPressure = false;
        samsungWatch.sportsMode = true;
        samsungWatch.waterProof = true;

        System.out.println(samsungPhone);
        System.out.println(samsungWatch);

    }
}