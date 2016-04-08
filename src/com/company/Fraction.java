package com.company;


public class Fraction {
    int  num;
    int denum;

    public Fraction(int numerator, int denominator){
        this.num = numerator;
        this.denum = denominator;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getZnum() {
        return denum;
    }

    public void setZnum(int znum) {
        this.denum = znum;
    }

    public Fraction add(Fraction first, Fraction second){
        return new Fraction(first.getNum()*second.getZnum()+second.getNum()*first.getZnum(),first.getZnum()*second.getZnum());

    }
    public Fraction sub(Fraction a,Fraction b){
        return new Fraction(a.getNum()*b.getZnum()-b.getNum()*a.getZnum(),a.getZnum()*b.getZnum());
    }
    public Fraction mov(Fraction first, Fraction second){
        return new Fraction(first.getNum()*second.getNum(),first.getZnum()*second.getZnum());
    }
    public Fraction div(Fraction first,Fraction second){
        return new Fraction(first.getNum()*second.getZnum(), first.getZnum()*second.getNum());
    }
    public double toDoubleSum(Fraction first,Fraction second){
        double drob = (double)(first.getNum()*second.getZnum()+second.getNum()*first.getZnum())/(double)(first.getZnum()*second.getZnum());
        return drob;
    }
    public double toDoubleSub(Fraction first, Fraction second){
        double drob = (double)(first.getNum()*second.getZnum()-second.getNum()*first.getZnum())/(double)(first.getZnum()*second.getZnum());
        return drob;
    }
    public double toDoubleMov(Fraction first, Fraction second){
        double drob = (double)(first.getNum()*second.getNum())/(double)(first.getZnum()*second.getZnum());
        return drob;
    }
    public double toDoubleDiv(Fraction first, Fraction second){
        double drob = (double)(first.getNum()*second.getZnum())/(double)(first.getZnum()*second.getNum());
        return drob;
    }


    @Override
    public String toString() {
        return getNum()+"/" + getZnum();
    }

    public static void main(String[] args) {
        Fraction first = new Fraction(3,4);
        Fraction second = new Fraction(5,6);
      System.out.println(first.toString()+"+"+second.toString()+"="+first.add(first,second));
        System.out.println(first.toString()+"-"+second.toString()+"="+first.sub(first,second));
       System.out.println(first.toString()+"*"+second.toString()+"="+first.mov(first,second));
       System.out.println(first.toString()+":"+second.toString()+"="+first.div(first,second));
       System.out.println(first.toString()+"+"+second.toString()+"="+first.toDoubleSum(first,second));
       System.out.println(first.toString()+"-"+second.toString()+"="+first.toDoubleSub(first,second));
       System.out.println(first.toString()+"*"+second.toString()+"="+first.toDoubleMov(first,second));
       System.out.println(first.toString()+":"+second.toString()+"="+first.toDoubleDiv(first,second));

    }
}
