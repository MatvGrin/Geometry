package com.epam.learnt.main;

import java.io.IOException;

public class InputProgram {
    public static void main(String[] args) {
        int x;
        try {
            x = System.in.read();
            System.out.println("code =" + x + " x=" + (char)x);
        } catch (IOException a){
            a.printStackTrace();
        }
    }
}
