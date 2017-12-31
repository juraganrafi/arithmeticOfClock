
package aoc;

public class CalculateClock {
    
    private int jam, menit, detik;
    private int hours1, minutes1, seconds1;
    private int hours2, minutes2, seconds2;
    int plusClock;
    private int plusSeconds, plusMinutes, plusHours;
    
    private int calculateInput1, calculateInput2;
    private int minClock;
    private int minSeconds;
    private int minMinutes;
    private int minHours;
    
    //
    public void allInput1(int jam,int menit,int detik){
        calculateInput1 = (jam*3600)+(menit*60)+detik;
        seconds1        = (calculateInput1%3600)%60;
        minutes1        = (calculateInput1%3600)/60;
        hours1          = calculateInput1 / 3600;

        if(seconds1 >= 60){
            minutes1 ++;
            seconds1 = this.seconds1-60;
        } else if (minutes1>= 60){
            hours1 ++;
            hours1 = this.minutes1-60;
        }
    }
    //
    public void allInput2(int jam,int menit,int detik){
        calculateInput2 = (jam*3600)+(menit*60)+detik;
        seconds2        = (calculateInput2%3600)%60;
        minutes2        = (calculateInput2%3600)/60;
        hours2          = calculateInput2 / 3600;
        
        if(seconds2 >= 60){
            minutes2 ++;
            seconds2 = this.seconds2-60;
        } else if (minutes2>= 60){
            hours2 ++;
            hours2 = this.minutes2-60;
        }
    }
    //
    public void OpsiClock(int opsi){
        
        switch (opsi) {
            case 1:
                plusClock   = calculateInput1 + calculateInput2;
                
                plusSeconds = (plusClock%3600)%60;
                plusMinutes = (plusClock%3600)/60;
                plusHours   = plusClock / 3600;
                
                if(plusSeconds >= 60){
                    plusSeconds ++;
                    plusSeconds = this.plusSeconds-60;
                } else if (plusMinutes>= 60){
                    plusHours ++;
                    plusHours = this.plusHours-60;
                }       displayPlus();
                break;
            case 2:
                minClock    = calculateInput1 - calculateInput2;
                
                minSeconds  = (minClock%3600)%60;
                minMinutes  = (minClock%3600)/60;
                minHours    = minClock / 3600;
                
                if(minSeconds >= 60){
                    minSeconds ++;
                    minSeconds = this.minSeconds-60;
                } else if (minMinutes>= 60){
                    minHours ++;
                    minHours = this.minHours-60;
                }       displayMin();
                break;
            default:
                System.out.println("Maaf opsi yang anda masukkan tidak ada, berikut hasil akhir : ");
                break;
        }
        
    }
    //
    public int getallSecInput1(){
        return calculateInput1;
    }
    
    public int getallSecInput2(){
        return calculateInput2;
    }
    
    public int getHours1(){
        return hours1;
    }
    
    public int getMinutes1(){
        return minutes1;
    }
    
    public int getSeconds1(){
        return seconds1;
    }
    //
    public int getHours2(){
        return hours2;
    }
    
    public int getMinutes2(){
        return minutes2;
    }
    
    public int getSeconds2(){
        return seconds2;
    }
    //
    public int getallPlusClock(){
        return plusClock;
    }
        
    public int getPlusHours(){
        return plusHours;
    }
    
    public int getPlusMinutes(){
        return plusMinutes;
    }
    
    public int getPlusSeconds(){
        return plusSeconds;
    }
    //
    public int getallMinClock(){
        return minClock;
    }
        
    public int getMinHours(){
        return minHours;
    }
    
    public int getMinMinutes(){
        return minMinutes;
    }
    
    public int getMinSeconds(){
        return minSeconds;
    }
    //
    public String stringCastingInput1(){
        String calculateSecString1 = String.valueOf(calculateInput1);
        return calculateSecString1;
    }
    
    public String stringHours1(){
        String calculateHour1 = String.valueOf(hours1);
        return calculateHour1;
    }
    
    public String stringMinutes1(){
        String calculateMinutes1 = String.valueOf(minutes1);
        return calculateMinutes1;
    }
    
    public String stringSeconds1(){
        String calculateSecond1 = String.valueOf(seconds1);
        return calculateSecond1;
    }
    // 
    public String stringCastingInput2(){
        String calculateSecString2 = String.valueOf(calculateInput2);
        return calculateSecString2;
    }
    
    public String stringHours2(){
        String calculateHour2 = String.valueOf(hours2);
        return calculateHour2;
    }
    
    public String stringMinutes2(){
        String calculateMinutes2 = String.valueOf(minutes2);
        return calculateMinutes2;
    }
    
    public String stringSeconds2(){
        String calculateSecond2 = String.valueOf(seconds2);
        return calculateSecond2;
    }
    //
    public String stringPlusAll(){
        String calculateStringPlus = String.valueOf(plusClock);
        return calculateStringPlus;
    }
    
    public String stringPlusHours(){
        String calculateStringPlusHours = String.valueOf(plusHours);
        return calculateStringPlusHours;
    }
    
    public String stringPlusMinutes(){
        String calculateStringPlusMinutes = String.valueOf(plusMinutes);
        return calculateStringPlusMinutes;
    }
    
    public String stringPlusSeconds(){
        String calculateStringPlusSeconds = String.valueOf(plusSeconds);
        return calculateStringPlusSeconds;
    }
    //
    public String stringMinAll(){
        String calculateStringMin = String.valueOf(minClock);
        return calculateStringMin;
    }
    
    public String stringMinHours(){
        String calculateStringMinHours = String.valueOf(minHours);
        return calculateStringMinHours;
    }
    
    public String stringMinMinutes(){
        String calculateStringMinMinutes = String.valueOf(minMinutes);
        return calculateStringMinMinutes;
    }
    
    public String stringMinSeconds(){
        String calculateStringMinSeconds = String.valueOf(minSeconds);
        return calculateStringMinSeconds;
    }
    //
    public void displayPlus(){
        System.out.println("\n");
        System.out.println("---------------------------------------");
        System.out.println("Hasil Akhir dari penambahan kedua jam");
        System.out.println("---------------------------------------");
        //System.out.println("Hasil dalam Jumlah detik Integer : "+getallPlusClock());
        //System.out.println("Hasil akhir dalam Integer : "+getPlusHours()+" jam, "+getPlusMinutes()+" Menit, dan "+getPlusSeconds()+" Detik");
        System.out.println("Hasil dalam Jumlah detik String : "+stringPlusAll());
        System.out.println("Hasil akhir dalam String : "+stringPlusHours()+" jam,"+stringPlusMinutes()+" Menit, dan "+stringPlusSeconds()+" Detik");
    }
    //
    public void displayMin(){
        System.out.println("\n");
        System.out.println("---------------------------------------");
        System.out.println("Hasil Akhir dari pengurangan kedua jam");
        System.out.println("---------------------------------------");
        //System.out.println("Hasil dalam Jumlah detik Integer : "+getallMinClock());
        //System.out.println("Hasil akhir dalam Integer : "+getMinHours()+" jam, "+getMinMinutes()+" Menit, dan "+getMinSeconds()+" Detik");
        System.out.println("Hasil dalam Jumlah detik String : "+stringMinAll());
        System.out.println("Hasil akhir dalam String : "+stringMinHours()+" jam,"+stringMinMinutes()+" Menit, dan "+stringMinSeconds()+" Detik");
    }
}
