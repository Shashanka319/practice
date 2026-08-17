package com.javapractice.casting;

public class TypeCasting {
    public static void main(String[] args) {
      //getImplicitly();
      //getExplicitly();
      getPattern();
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
    public static void getPattern(){
        char ch = 'A';
        for(int i=1;i<=5;i++){

            for(int j=1;j<=6;j++){
                System.out.print(ch+" ");
                //ch =(char) (ch+1);
                //ch++;
                ch +=1;
                if(ch>'Z'){
                    break;
                }
            }
            System.out.println(" ");
        }
    }

}
