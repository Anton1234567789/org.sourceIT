package com.company;


public class Fraction {
    int  num, num1;
    int znum, znum1;
    int drob;
    int sumCh;
    int sumZn;

    public String sumFraction(int chis,int z,int chis1,int z1){
        sumCh = chis*z1 + chis1*z;
        sumZn = z*z1;
        System.out.print(chis+"/"+z+"+"+chis1+"/"+z1+"=");
        System.out.println(sumCh+"/"+sumZn);
        return sumCh+"/"+sumZn;
    }
    public String toDiv(int chis,int z,int chis1,int z1){
               sumCh = chis * z1;
        sumZn = z*chis1;
        System.out.print(chis+"/"+z+"*"+z1+"/"+chis1+"=");
        System.out.println(sumCh+"/"+sumZn);
        return sumCh+"/"+sumZn;
    }

    public String toMov(int chis,int z,int chis1,int z1){
        sumCh = chis * chis1;
        sumZn = z*z1;
        System.out.print(chis+"/"+z+"*"+chis1+"/"+z1+"=");
        System.out.println(sumCh+"/"+sumZn);
        return sumCh+"/"+sumZn;
    }
    public String toSub(int chis,int z,int chis1,int z1){
        sumCh = chis*z1 - chis1*z;
        sumZn = z*z1;
        System.out.print(chis+"/"+z+"-"+chis1+"/"+z1+"=");
        System.out.println(sumCh+"/"+sumZn);
        return sumCh+"/"+sumZn;
    }

    @Override
    public String toString() {
        return "Fraction{" + sumCh +"/" + sumZn+'}';
    }

    public double doDoubleSum(int chis, int z, int chis1, int z1){
        num = chis;
        znum = z;
        num1 = chis1;
        znum1=z1;
        double drob = (double)(num*znum1+num1*znum)/(double)(znum*znum1);
        System.out.println(num+"/"+znum +"+"+num1+"/"+znum1+"="+drob);
        return drob;
    }

    public double doDoubleDiv(int chis, int z, int chis1, int z1){
        num = chis;
        znum = z;
        num1 = chis1;
        znum1=z1;
        double drob = (double)(num*znum1)/(double)(znum*num1);
        System.out.println(num+"/"+znum +"*"+znum1+"/"+num1+"="+drob);
        return drob;
    }
    public double doDoubleMov(int chis, int z, int chis1, int z1){
        num = chis;
        znum = z;
        num1 = chis1;
        znum1=z1;
        double drob = (double)(num*num1)/(double)(znum*znum1);
        System.out.println(num+"/"+znum +"*"+num1+"/"+znum1+"="+drob);
        return drob;
    }

    public double doDoubleSub(int chis, int z, int chis1, int z1){
        num = chis;
        znum = z;
        num1 = chis1;
        znum1=z1;
        double drob = (double)(num*znum1-num1*znum)/(double)(znum*znum1);
        System.out.println(num+"/"+znum +"-"+num1+"/"+znum1+"="+drob);
        return drob;
    }

 /* public static void main(String[] args) {
      Fraction fraction = new Fraction();
      fraction.sumFraction(3,5,5,7);
      fraction.toDiv(3,5,5,7);
      fraction.toMov(3,7,8,9);
      fraction.toSub(3,9,5,6);
      fraction.doDoubleSum(3,5,5,7);
      fraction.doDoubleDiv(3,5,5,7);
      fraction.doDoubleMov(3,7,8,9);
      fraction.doDoubleSub(3,9,5,6);

  }*/

}
