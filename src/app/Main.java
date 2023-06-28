package app;

import app.logistics.Logistics;
import app.logistics.RoadLogistics;
import app.logistics.SeaLogistics;

public class Main {
    public static void main(String[] args) {
        Logistics logistics = new Logistics();
        logistics.planDelivery();

        RoadLogistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        SeaLogistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}
