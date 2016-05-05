package AutoRider;

public class Orders {
    private String address;
    private int passengers;
    private boolean condition;

    public Orders() {

    }

    public Orders(String address, int passengers, boolean condition) {
        this.address = address;
        this.passengers = passengers;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return  "address='" + address + '\'' +
                ", passengers=" + passengers +
                ", condition=" + condition +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }
}
