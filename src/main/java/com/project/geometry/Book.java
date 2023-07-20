package com.project.geometry;

public class Book {

    public static final double PI=3.14;

    public byte a=1;
    protected short b=2;
    int c=322_569_125;
    long d=4L;
    float e= 5.5F;
    double f=6.6;
    char h='7';
    boolean o = true;

    protected void read(){
        byte a1;
        short b1;
        int c1;
        long d1;
        float e1;
        double f1;
        char h1;
        boolean o1;

        System.out.println("Hello father");
        if (b>=5){
            System.out.println("URAA");
        } else {
            System.out.println(":(((");
        }
        switch (b){
            case 1:
                System.out.println("№1");
                break;
            case 2:
                System.out.println("№2");
                break;

            default:
                System.out.println("№X");
        }

        while (d < 7){
            d++;
//            if(d==5) break;
            if (d==5) continue;
            System.out.println("loop while");
        }
        do {
            System.out.println("LOOP DO WHILE");
        }while (b!=2);

        for(int i=0; i<2; i++) {
            System.out.println("LOOP FOR");
        }


    }
}
