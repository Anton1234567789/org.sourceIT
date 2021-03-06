package com.company;


public class Fraction {
    int num;
    int denum;

    public Fraction() {

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Fraction)) {
            return false;
        }
        Fraction another = (Fraction) obj;

        return this.num == another.num & this.denum == another.denum;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Fraction(int numerator, int denominator) {
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

    public Fraction add(Fraction first, Fraction second) {
        return new Fraction(first.getNum() * second.getZnum() + second.getNum() * first.getZnum(), first.getZnum() * second.getZnum());

    }

    public Fraction sub(Fraction a, Fraction b) {
        return new Fraction(a.getNum() * b.getZnum() - b.getNum() * a.getZnum(), a.getZnum() * b.getZnum());
    }

    public Fraction mov(Fraction first, Fraction second) {
        return new Fraction(first.getNum() * second.getNum(), first.getZnum() * second.getZnum());
    }

    public Fraction div(Fraction first, Fraction second) {
        return new Fraction(first.getNum() * second.getZnum(), first.getZnum() * second.getNum());
    }

    public double toDoubleSum(Fraction first, Fraction second) {
        double drob = (double) (first.getNum() * second.getZnum() + second.getNum() * first.getZnum()) /
                (double) (first.getZnum() * second.getZnum());
        return drob;
    }

    public double toDoubleSub(Fraction first, Fraction second) {
        double drob = (double) (first.getNum() * second.getZnum() - second.getNum() * first.getZnum()) /
                (double) (first.getZnum() * second.getZnum());
        return drob;
    }

    public double toDoubleMov(Fraction first, Fraction second) {
        double drob = (double) (first.getNum() * second.getNum()) /
                (double) (first.getZnum() * second.getZnum());
        return drob;
    }

    public double toDoubleDiv(Fraction first, Fraction second) {
        double drob = (double) (first.getNum() * second.getZnum()) /
                (double) (first.getZnum() * second.getNum());
        return drob;
    }


    @Override
    public String toString() {
        return getNum() + "/" + getZnum();
    }

}
