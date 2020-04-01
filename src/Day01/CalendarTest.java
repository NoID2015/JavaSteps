import java.time.*;

public class CalendarTest {
    public static void printMonthCalendar(LocalDate localDate){
        int currentMonth = localDate.getMonthValue();
        //当前月份第多少天
        int monthToday = localDate.getDayOfMonth();
        //当前年第多少天
        int yearToday = localDate.getDayOfYear();
        //将今天设置成该年的第一天
        LocalDate date = localDate.minusDays(yearToday-1);

        for(int m = 1; m <= 12; m++ ){
            System.out.printf("Mon Tue Wed Thu Fri Sat Sun (%d)\n",date.getMonthValue());
            DayOfWeek weekday = date.getDayOfWeek();
            int value = weekday.getValue();
            for(int i = 1;i < value; i++){
                System.out.print("    ");
            }
            //每个月份的起始循环条件，以是否为当月为循环结束的条件
            int month = date.getMonthValue();
            while (date.getMonthValue() == month){
                System.out.printf("%3d", date.getDayOfMonth());
                if(date.getDayOfMonth() == monthToday&&date.getMonthValue() == currentMonth) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                date = date.plusDays(1);
                if(date.getDayOfWeek().getValue() == 1) System.out.println();
            }
            System.out.println();
        }
    }
}