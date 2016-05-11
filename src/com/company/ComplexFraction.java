package com.company;

public class ComplexFraction extends Fraction{

    ComplexNumber num;
    ComplexNumber denum;
    public ComplexFraction(ComplexNumber numerator, ComplexNumber denominator) {
        this.num = numerator;
        this.denum = denominator;
    }

    public ComplexNumber getNums(){
        return num;
    }
    public void setNum(ComplexNumber num) {
        this.num = num;
    }

    public ComplexNumber getDenum() {
        return denum;
    }

    public void setDenum(ComplexNumber denum) {
        this.denum = denum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplexFraction)) return false;
        if (o == null) return false;

        ComplexFraction complexFraction= (ComplexFraction) o;

        return complexFraction.getNums().equals(num) & complexFraction.getDenum().equals(denum);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (denum != null ? denum.hashCode() : 0);
        return result;
    }

    public ComplexFraction mov(ComplexFraction a){
        return new ComplexFraction(this.num.mov(a.num),this.denum.mov(a.denum));
    }

    public ComplexFraction sub(ComplexFraction a){
        return new ComplexFraction(this.num.mov(a.denum).sub(this.denum.mov(a.num)),this.denum.mov(a.denum));
    }

    public ComplexFraction add(ComplexFraction a){
        return new ComplexFraction(this.num.mov(a.denum).plus(this.denum.mov(a.num)),this.denum.mov(a.denum));
    }

    public ComplexFraction div(ComplexFraction a){
        return new ComplexFraction(this.num.mov(a.denum),this.denum.mov(a.num));
    }

    public static ComplexNumber simpleNumber(ComplexFraction a){
        return a.num.div(a.denum);
    }


}
