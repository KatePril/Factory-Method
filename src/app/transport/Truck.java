package app.transport;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Cargo was delivered with truck");
    }
}
