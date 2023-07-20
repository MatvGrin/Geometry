package com.project.geometry;

import com.project.algebra.DayOfWeek;
import com.project.algebra.Room;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();

        System.out.println(book.a);
        System.out.println(book.b);
        System.out.println(book.c);
        System.out.println(book.d);
        System.out.println(book.e);
        System.out.println(book.f);
        System.out.println(book.h);
        System.out.println(book.o);

        book.read();

        Room room = new Room();

        System.out.println(DayOfWeek.TUESDAY);



    }
}
