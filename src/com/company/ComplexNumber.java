package com.company;

public class ComplexNumber {

    private double re;
    private double im;

    public ComplexNumber(double real,double imag){
        this.re=real;
        this.im= imag;
    }

    @Override
    public String toString() {
        if(im==0){return re+"";}
        if(re==0){return im+"i";}
        if (im<0){return re + " - "+(-im)+"i";}
        return re+" + "+ im +"i";
    }

    public ComplexNumber plus(ComplexNumber b){
        ComplexNumber a =this;
        double real = a.re + b.re;
        double imag = a.im + b.im;
        return new ComplexNumber(real,imag);
    }
    public ComplexNumber sub(ComplexNumber b){
        ComplexNumber a=this;
        double real = a.re - b.re;
        double imag = a.im - b.im;
        return new ComplexNumber(real,imag);
    }
    public ComplexNumber mov(ComplexNumber b){
        ComplexNumber a =this;
        double real = a.re*b.re - a.im*b.im;
        double imag = a.re*b.im + a.im*b.re;
        return new ComplexNumber(real,imag);
    }
    public ComplexNumber conj(){
        return new ComplexNumber(re,-im);
    }


    public ComplexNumber div(ComplexNumber b){
        ComplexNumber a = this;
        double real = (a.re*b.re +a.im*b.im)/(b.re*b.re+b.im*b.im);
        double imag = (a.im*b.re-a.re*b.im)/(b.re*b.re+b.im*b.im);
        return new ComplexNumber(real ,imag);

    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(5,6);
        ComplexNumber b = new ComplexNumber(-3,4);
        System.out.println("a+b= " + b.plus(a));
        System.out.println("a-b= " + b.sub(a));
        System.out.println("a*b= " + a.mov(b));
        System.out.println("a/b= " + a.div(b));
    }

}
