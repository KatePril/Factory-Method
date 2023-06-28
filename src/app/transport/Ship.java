package app.transport;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Cargo was delivered with ship");
    }
}
