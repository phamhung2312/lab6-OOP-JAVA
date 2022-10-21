package ex2;

import java.security.PublicKey;

public class MyTime {
    private int hour=0;
    private int minute=0;
    private int second=0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour,int minute,int second) {
        this.hour = hour;
        this.second = second;
        this.minute = minute;
    }

    public static String format(int in){
        return in<10 ? "0" + in: ""+in;
    }

    @Override
    public String toString() {
        return  format(hour) +":"+ format(minute) +":" +format(second) ;
    }

    public MyTime nextHour(){
        hour=hour==23 ? 0 : hour+1;
        return this;
    }
    public MyTime nextMinute(){
        if(minute==59){
            minute=0;
            nextHour();
            return this;
        }
        minute++;
        return this;
    }

    public MyTime nextSecond(){
        if(second==59){
            second=0;
            nextMinute();
            return this;
        }
        second++;
        return this;
    }

    public MyTime previousHour(){
        hour=hour==0 ? 23 : hour-1;
        return this;
    }
    public MyTime previousMinute(){
        if(minute==0){
            minute=59;
            previousHour();
            return this;
        }
        minute--;
        return this;
    }

    public MyTime previousSecond(){
        if(second==0){
            second=59;
            previousMinute();
            return this;
        }
        second--;
        return this;
    }


}
