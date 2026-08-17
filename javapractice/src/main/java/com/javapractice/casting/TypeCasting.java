package com.javapractice.casting;

public class TypeCasting {
    public static void main(String[] args) {
      getImplicitly();
      getExplicitly();
    }
   //implicitly
    public static void getImplicitly() {
        int a =10;
        double b =a;
        System.out.println(a);
        System.out.println(b);
    }
    //explicitly
    public static void getExplicitly(){
        double  a =45.66;
        int b = (int)a;
        System.out.println(a);
        System.out.println(b);
    }

}
