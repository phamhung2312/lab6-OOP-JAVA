package ex3;

public class MyDate {
    private int year;
    private int month;
    private int day;
    String[] MONTHS=new String[]{"Jan","Feb","Mar","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    String[] DAYS = new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    int[] DAYS_IN_MONTHS=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

    public boolean isLeapYear(int year){
        return (year%4==0&&year%100!=0)||year%400==0?true:false;
    }

    public boolean isValidDate(int year,int month,int day){
        if(year>9999||year<1||month<1||month>12||day<1){
            return false;
        }
        if(isLeapYear(year) && month==2&&day<=29){
            return true;
        }
        return day<=DAYS_IN_MONTHS[month-1]?true:false;
    }
}
