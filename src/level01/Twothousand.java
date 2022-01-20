package level01;


import java.time.DayOfWeek;
import java.time.LocalDate;

public class Twothousand {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        String answer = "";
        LocalDate date = LocalDate.of(2016,a,b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        int day = dayOfWeek.getValue();

        System.out.println(day);

        switch(day) {
            case 1:
                answer = "MON";
                break;
            case 2:
                answer = "TUE";
                break;
            case 3:
                answer = "WED";
                break;
            case 4:
                answer = "THU";
                break;
            case 5:
                answer = "FRI";
                break;
            case 6:
                answer = "SAT";
                break;
            default:
                answer = "SUN";
                break;
        }
        System.out.println(answer);
    }
}
