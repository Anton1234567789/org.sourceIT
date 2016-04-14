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
        FractionComplex c = (FractionComplex) obj;
        return Double.compare(re,re1)==0 &&
                Double.compare(im,im2)==0;
    }

    public static void main(String[] args) {
        FractionComplex a =new FractionComplex(3,4,2,3);
        FractionComplex b =new FractionComplex(2,3,5,3);

        System.out.println(a.toString()+"+"+b.toString()+"="+a.add(b));
        System.out.println(a.toString()+"-"+b.toString()+"="+a.sub(b));
        System.out.println(a.toString()+"*"+b.toString()+"="+a.mov(b));
        System.out.println(a.toString()+"/"+b.toString()+"="+a.div(b));
        System.out.println(a.toString()+"/"+b.toString()+"="+a.toDoubleSum(b));
        System.out.println(a.toString()+"/"+b.toString()+"="+a.toDoubleSub(b));;
        System.out.println(a.toString()+"/"+b.toString()+"="+a.toDoubleMov(b));
        System.out.println(a.toString()+"/"+b.toString()+"="+a.toDoubleDiv(b));
    }

    public FractionComplex(double re, double im,double re1, double im1){
        this.re = re;
        this.im = im;
        this.re1 = re1;
        this.im2 = im1;
    }

    @Override
    public String toString() {
        /*if(im ==0){return re +"";}
        if(re ==0){return im +"i";}
        if (im <0){return re + " - "+(-im)+"i";}
        return "("+ re +"+"+ im +"i" +")"+"/"+"("+ re1 +"+"+ im2 +"i"+")";*/
        return "("+ re +"+"+ im +"i" +")"+"/"+"("+ re1 +"+"+ im2 +"i"+")";
    }

    public  FractionComplex add(FractionComplex b){
        FractionComplex a = this;
        /*double num = a.re *b.re1 + b.re *a.re1;
        double denum = a.re *b.im2 +a.im *b.re1 -a.im *b.im2 +b.re *a.im2 +b.im *a.re1 -b.im *a.im2;
        double numPlus = a.re1 *b.re1;
        double denumPlus = a.re1 *b.im2 +a.im2 *b.re1 -a.im2 *b.im2;*/
        return new FractionComplex(a.re *b.re1 + b.re *a.re1,a.re *b.im2 +a.im *b.re1 -a.im *b.im2 +b.re *a.im2 +b.im *a.re1 -b.im *a.im2,
                a.re1 *b.re1,a.re1 *b.im2 +a.im2 *b.re1 -a.im2 *b.im2);

    }
    public FractionComplex sub(FractionComplex b){
        FractionComplex a = this;
        /*double num = a.re *b.re1 - b.re *a.re1;
        double denum = a.re *b.im2 +a.im *b.re1 -a.im *b.im2 -b.re *a.im2 - b.im *a.re1 +b.im *a.im2;
        double numPlus = a.re1 *b.re1;
        double denumPlus = a.re1 *b.im2 +a.im2 *b.re1 -a.im2 *b.im2;*/
        return new FractionComplex(a.re *b.re1 - b.re *a.re1,a.re *b.im2 +a.im *b.re1 -a.im *b.im2 -b.re *a.im2 - b.im *a.re1 +b.im *a.im2,
                a.re1 *b.re1,a.re1 *b.im2 +a.im2 *b.re1 -a.im2 *b.im2);
    }
    public FractionComplex mov(FractionComplex b){
        FractionComplex a =this;
        /*double num =a.re *b.re;
        double denum =  a.re*b.im+a.im*b.re-a.im*b.im;
        double numPlus = a.re1*b.re1;
        double denumPlus = a.re1*b.im2+ a.im2*b.re1-a.im2*b.im2;*/
        return new FractionComplex(a.re *b.re,a.re*b.im+a.im*b.re-a.im*b.im,a.re1*b.re1,a.re1*b.im2+ a.im2*b.re1-a.im2*b.im2);
    }
    public FractionComplex div(FractionComplex b){
        FractionComplex a = this;
        /*double num=a.re*b.re1;
        double denum =a.re*b.im2+ a.im*b.re1 -a.im*b.im2;
        double numPlus = a.re1*b.re;
        double denumPlus = a.re1*b.im+ a.im2*b.re-a.im2*b.im;*/
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

