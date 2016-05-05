package com.company;

public class FractionComplex {
    private final double re;
    private final double im;
    private final double re1;
    private final double im2;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj ==this){
            return true;
        }
        if (!(obj instanceof FractionComplex)){
            return false;
        }
        FractionComplex a = (FractionComplex) obj;
        return this.re==a.re & this.im==a.im & this.re1==a.re1 & this.im2==a.im2;
    }

    public FractionComplex(double re, double im,double re1, double im1){
        this.re = re;
        this.im = im;
        this.re1 = re1;
        this.im2 = im1;
    }

    @Override
    public String toString() {
        return "("+ re +"+"+ im +"i" +")"+"/"+"("+ re1 +"+"+ im2 +"i"+")";
    }


    public  FractionComplex add(FractionComplex b){
        FractionComplex a = this;
        return new FractionComplex(a.re *b.re1 + b.re *a.re1,a.re *b.im2 +a.im *b.re1 -a.im *b.im2 +b.re *a.im2 +b.im *a.re1 -b.im *a.im2,
                a.re1 *b.re1,a.re1 *b.im2 +a.im2 *b.re1 -a.im2 *b.im2);

    }
    public FractionComplex sub(FractionComplex b){
        FractionComplex a = this;
        return new FractionComplex(a.re *b.re1 - b.re *a.re1,a.re *b.im2 +a.im *b.re1 -a.im *b.im2 -b.re *a.im2 - b.im *a.re1 +b.im *a.im2,
                a.re1 *b.re1,a.re1 *b.im2 +a.im2 *b.re1 -a.im2 *b.im2);
    }
    public FractionComplex mov(FractionComplex b){
        FractionComplex a =this;
        return new FractionComplex(a.re *b.re,a.re*b.im+a.im*b.re-a.im*b.im,a.re1*b.re1,a.re1*b.im2+ a.im2*b.re1-a.im2*b.im2);
    }
    public FractionComplex div(FractionComplex b){
        FractionComplex a = this;
        return  new FractionComplex(a.re*b.re1,a.re*b.im2+ a.im*b.re1 -a.im*b.im2,a.re1*b.re,a.re1*b.im+ a.im2*b.re-a.im2*b.im);
    }

    public double toDoubleSum(FractionComplex b){
        FractionComplex a = this;
        double drob = ((double)(a.re *b.re1 + b.re *a.re1)+(double)(a.re *b.im2 +a.im *b.re1 -a.im *b.im2 +b.re *a.im2 +b.im *a.re1 -b.im *a.im2))/
                ((double)(a.re1 *b.re1)+(double)(a.re1 *b.im2 +a.im2 *b.re1 -a.im2 *b.im2));
        return drob;
    }

    public double toDoubleSub(FractionComplex b){
        FractionComplex a =this;
        double drob = ((double)(a.re *b.re1 - b.re *a.re1)+(double)(a.re *b.im2 +a.im *b.re1 -a.im *b.im2 -b.re *a.im2 - b.im *a.re1 +b.im *a.im2))/
                ((double)(a.re1 *b.re1)+(double)(a.re1 *b.im2 +a.im2 *b.re1 -a.im2 *b.im2));
        return drob;
    }

    public double toDoubleMov(FractionComplex b){
        FractionComplex a = this;
        double drob = ((double)(a.re *b.re)+(double)(a.re*b.im+a.im*b.re-a.im*b.im))/
                ((double)(a.re1*b.re1)+(double)(a.re1*b.im2+ a.im2*b.re1-a.im2*b.im2));
        return drob;
    }

    public double toDoubleDiv(FractionComplex b){
        FractionComplex a = this;
        double drob = ((double)(a.re*b.re1)+(double)(a.re*b.im2+ a.im*b.re1 -a.im*b.im2))/((double)(a.re1*b.re)+(double)(a.re1*b.im+ a.im2*b.re-a.im2*b.im));
        return drob;
    }


}

