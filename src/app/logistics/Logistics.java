package app.logistics;

import app.transport.Transport;

public class Logistics {
    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }

    public Transport createTransport() {
        return new Transport() {
            @Override
            public void deliver() {
                System.out.println("Cargo was delivered with transport");
            }
        };
    }
}
