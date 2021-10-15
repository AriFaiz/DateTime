package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSpecificCalendar {
    public static void main(String[] args) {

        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());

        // Menampilkan waktu 15 hari yang lalu
        calendar.add(Calendar.DATE, -200);
        System.out.println("15 minggu yang lalu: " + calendar.getTime());

        // Menampilkan waktu 4 bulan yang akan datang
        calendar.add(Calendar.MONTH, 95);
        System.out.println("4 bulan kemudian: " + calendar.getTime());

        // Menampilkan waktu 2 tahun yang akan datang
        calendar.add(Calendar.YEAR, 10000);
        System.out.println("10000 tahun kemudian: " + calendar.getTime());
    }

}
