package AutoRider;


public class Cars {
    String car;
    boolean condition;
    int carId;

    Cars(){

    }
    public Cars(String car, boolean condition, int carId){
        this.car=car;
        this.condition= condition;
        this.carId = carId;

    }

    @Override
    public String toString() {
        return "car='" + car + '\'' +", condition=" + condition +
                ", carId=" + carId +
                '}';
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

}
