package com.Testing;

class A{
    int maths(int a){
        try{
            int div = a/0;
            return div;
        }
        catch (ArithmeticException ex){
            throw ex;
        }


    }
}
class B extends A {
    @Override
    int maths(int a) {

        try {
            int area = a + a;
            return area;
        } catch (Exception ex) {
            throw ex;
        }

    }
}


public class Polymorphism {
    public static void main(String[] args) {
        A obj = new B();

        System.out.println(obj.maths(10));

    }
}
