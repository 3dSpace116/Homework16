public class ServiceStation {
    public void check(Repairable... transports) {
        for (Repairable transport : transports) {
            transport.repair();
        }
    }
}
