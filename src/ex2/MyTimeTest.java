package ex2;
//import org.junit.jupiter.api.Test;

public class MyTimeTest {
    public static void main(String[] args) {
        MyTime myTime1 = new MyTime(23,59,59);
        System.out.println(myTime1.getHour()+":"+myTime1.getMinute()+":"+ myTime1.getSecond());
        MyTime myTime2 = new MyTime();
        myTime2.setHour(15);
        myTime2.setMinute(20);
        myTime2.setSecond(3);
        System.out.println(myTime2);
        myTime2.setTime(21,53,17);
        System.out.println(myTime2);
        myTime2.previousMinute();
        myTime2.previousHour();
        myTime2.previousSecond();
        System.out.println(myTime2);
        myTime2.nextSecond();
        myTime2.nextHour();
        myTime2.nextMinute();
        System.out.println(myTime2);
    }
//    @Test
//    void TestMyTime() {
//        MyTime myTime1 = new MyTime(23,59,59);
//        System.out.println(myTime1.getHour()+":"+myTime1.getMinute()+":"+ myTime1.getSecond());
//        MyTime myTime2 = new MyTime();
//        myTime2.setHour(15);
//        myTime2.setMinute(20);
//        myTime2.setSecond(3);
//        System.out.println(myTime2);
//        myTime2.setTime(21,53,17);
//        System.out.println(myTime2);
//        myTime2.previousMinute();
//        myTime2.previousHour();
//        myTime2.previousSecond();
//        System.out.println(myTime2);
//        myTime2.nextSecond();
//        myTime2.nextHour();
//        myTime2.nextMinute();
//        System.out.println(myTime2);
//
//    }
}