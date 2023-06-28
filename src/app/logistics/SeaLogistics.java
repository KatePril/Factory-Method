package app.logistics;

import app.transport.Ship;
import app.transport.Transport;

public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
