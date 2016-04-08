package AutoRider;

public class MotorDepot {

    protected String nameRider;
    protected int numberAuto;
    protected int numberFlight; //nomer рейса
    MotorDepot(){
        nameRider = "Sva";
        numberAuto = 2134;
        numberFlight = 5;
    }
    MotorDepot(String name, int numberAuto, int numberFlight){
        this.nameRider = name;
        this.numberAuto = numberAuto;
        this.numberFlight = numberFlight;
    }

    public String getNameRider() {return nameRider;}

    public void setNameRider(String nameRider) {
        this.nameRider = nameRider;
    }

    public int getNumberAuto() {return numberAuto;}

    public void setNumberAuto(int numberAuto) {
        this.numberAuto = numberAuto;
    }

    public int getNumberFlight() {return numberFlight; }

    public void setNumberFlight(int numberFlight) {
        this.numberFlight = numberFlight;
    }


}
interface Automobile{
    public abstract void toAuto();
}
class Dispatcher extends MotorDepot implements Automobile{
    void doZayava(){    }
    void doCancelWork(){    }


    public void toAuto() {

    }
}

class Rider extends Dispatcher{
    void doRemont(){}
    void doNiceFlight(){}
    void doNiceAuto() {}


}
