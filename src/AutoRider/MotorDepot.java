package AutoRider;

import java.sql.Driver;
import java.util.ArrayList;

public class MotorDepot {


}

class Dispatcher extends MotorDepot{
    private ArrayList order;
    private ArrayList rider;
    private ArrayList cars;
    boolean isDriver;

    public String distributedOrder(Orders orders, Rider riders, Cars car){

        if(riders.isActions() & isDriver){
            rider.add(riders);
            if (car.isCondition()) {
                attachCar(car);
            }
            order.add(orders);
        }
        return order + " " + riders+ " " + car + " " ;
    }

    public String attachCar(Cars car){
        if(car.isCondition()) {
            cars.add(car);
            return String.valueOf(car);
        }
        return "Автомобиль готов к восстановлению" + String.valueOf(car.condition == false);
    }

    public void suspendedDriverFromWork(Rider riders){
        if(riders.isActions() == false) {
            System.out.println(riders+ "отстранен от работы");
        }
    }


}

class Rider extends Dispatcher{
    private int counter = 0;

    private String name;
    private String surname;
    private int age;
    private boolean actions;

    public Rider(int counter,String name, String surname,
                 int age, boolean actions){
        this.counter = counter;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.actions = actions;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActions() {
        return actions;
    }

    public void setActions(boolean actions) {
        this.actions = actions;
    }

    public void repair(){
        Cars car = new Cars();
        if(car.condition == false){
            System.out.println("Машина "+ car.getCar()+ " "+
            car.isCondition() + "в ожидании ремонта");
        }
    }
    public boolean noteOfOrder(Orders order){
        if(order.isCondition()){
            return true;
        }
        return false;
    }

    public void makeNoteOfCarCondition(Cars cars) {
        if(cars.isCondition()==false){
            System.out.println("Водитель отмечаet, что автомобиль неисправен");
        } else {
            System.out.println("\n" +
                    "Водитель отмечаet, что состояние автомобиля идеально подходит и может принять заказ");
        }
    }
    @Override
    public String toString() {
        return  "counter=" + counter +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", actions=" + actions+",";
    }
}
