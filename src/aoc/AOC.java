
package aoc;

import java.util.Scanner;

public class AOC {
    public static void main(String[] args) {
        
    String sec1, min1, hr1;
    String sec2, min2, hr2;

    int opsi;
        
    Scanner inSec1 = new Scanner(System.in);
    Scanner inMin1 = new Scanner(System.in);
    Scanner inHr1 = new Scanner(System.in);
    
    Scanner inSec2 = new Scanner(System.in);
    Scanner inMin2 = new Scanner(System.in);
    Scanner inHr2 = new Scanner(System.in);
    
    Scanner inOpsi = new Scanner(System.in);
    
    CalculateClock calculateSec = new CalculateClock();
    CalculateClock calculateClock = new CalculateClock();
    
    FilterNumber filterNumber = new FilterNumber();
    
    System.out.println("---------------------------------------");
    System.out.println("Masukan Jam Pertama");
    System.out.println("---------------------------------------");
    
    System.out.print("Hour : ");
    hr1 = inHr1.next();
    System.out.print("Minute : ");
    min1 = inMin1.next();    
    System.out.print("Second : ");
    sec1 = inSec1.next();
    
    System.out.println("Apakah anda ingin melakukan penambahan atau pengurangan? : ");
    System.out.println("1. Penambahan");
    System.out.println("2. Pengurangan");
    System.out.print("Jawaban anda: ");
    opsi = inOpsi.nextInt();
    
    System.out.println("---------------------------------------");
    System.out.println("Masukan Jam Kedua");
    System.out.println("---------------------------------------");
    
    System.out.print("Hour : ");
    hr2 = inHr2.next();
    System.out.print("Minute : ");
    min2 = inMin2.next();
    System.out.print("Second : ");
    sec2 = inSec2.next();
    
    //-------------------------------------------------------------------
    String hour1 = filterNumber.FilterNumber(hr1);
    String minute1 = filterNumber.FilterNumber(min1);
    String second1 = filterNumber.FilterNumber(sec1);
    
    String hour2 = filterNumber.FilterNumber(hr2);
    String minute2 = filterNumber.FilterNumber(min2);
    String second2 = filterNumber.FilterNumber(sec2);
    
    //-------------------------------------------------------------------
    int jam1 = Integer.parseInt(hour1);
    int menit1 = Integer.parseInt(minute1);
    int detik1 = Integer.parseInt(second1);

    int jam2 = Integer.parseInt(hour2);
    int menit2 = Integer.parseInt(minute2);
    int detik2 = Integer.parseInt(second2);
    
    //-------------------------------------------------------------------
    System.out.println("---------------------------------------");
    System.out.println("Object Scanner 1");
    System.out.println("---------------------------------------");
    System.out.println("Inputan variable dalam String : "+hour1+" Jam, "+minute1+" Menit, dan "+second1+" Detik." );
    System.out.println("Inputan variable dalam Integer : "+jam1+" Jam, "+menit1+" Menit, dan "+detik1+" Detik." );

    System.out.println("---------------------------------------");
    System.out.println("Object Scanner 2");
    System.out.println("---------------------------------------");
    System.out.println("Inputan variable dalam String : "+hour2+" Jam, "+minute2+" Menit, dan "+second2+" Detik." );    
    System.out.println("Inputan variable dalam Integer : "+jam2+" Jam, "+menit2+" Menit, dan "+detik2+" Detik." );

    //-------------------------------------------------------------------
    calculateSec.allInput1(jam1, menit1, detik1);
    System.out.println("---------------------------------------");
    System.out.println(" Hasil Jam pertama");
    System.out.println("---------------------------------------");
    System.out.println("Hasil dalam Jumlah detik Integer : "+calculateSec.getallSecInput1());
    
    calculateSec.allInput2(jam2, menit2, detik2);
    System.out.println("---------------------------------------");
    System.out.println("Hasil Jam kedua");
    System.out.println("---------------------------------------");
    System.out.println("Hasil dalam Jumlah detik Integer : "+calculateSec.getallSecInput2());

    //
    System.out.println("---------------------------------------");
    System.out.println("Jam Pertama");
    System.out.println("---------------------------------------");
    System.out.println("Hasil akhir dalam Integer : "+calculateSec.getHours1()+" jam, "+calculateSec.getMinutes1()+" Menit, dan "+calculateSec.getSeconds1()+" Detik");
    //System.out.println("Hasil akhir dalam String : "+calculateSec.stringHours1()+" jam, "+calculateSec.stringMinutes1()+" Menit, dan "+calculateSec.stringSeconds1()+" Detik");
        
    System.out.println("---------------------------------------");
    System.out.println("Jam kedua");
    System.out.println("---------------------------------------");
    System.out.println("Hasil akhir dalam Integer : "+calculateSec.getHours2()+" jam, "+calculateSec.getMinutes2()+" Menit, dan "+calculateSec.getSeconds2()+" Detik");
    //System.out.println("Hasil akhir dalam String : "+calculateSec.stringHours2()+" jam, "+calculateSec.stringMinutes2()+" Menit, dan "+calculateSec.stringSeconds2()+" Detik");
    
    // ------------------ MEMULAI PERHITUNGAN PENAMBAHAN AKHIR -----------------------
    // -------------- Hasil akhir perhitungan --------------
        calculateSec.OpsiClock(opsi);
    }
}
