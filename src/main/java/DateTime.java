import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime strDT=LocalDateTime.of(2021,12,12,3,20,30);

        System.out.println(now.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(now.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("d/M/yyyy");
        System.out.println(now.format(f));

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("d/MMM/yyyy");
        System.out.println(now.format(f2));

        String str="20/8/2021";
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        LocalDate ld=LocalDate.parse(str,f3);
        System.out.println(ld);

//        Set<String> zones= ZoneId.getAvailableZoneIds();

        LocalDateTime ldt2=LocalDateTime.of(2021,10,10,10,10,10);
        Duration dr=Duration.between(ldt2,strDT);//độ chênh lệch
    }

//    public static void main(String[] args) {
//        LocalTime now=LocalTime.now();
//        System.out.println(now);
//
//        LocalTime lt=LocalTime.of(9,30,40);
//        System.out.println(lt);
//        LocalTime lt2=LocalTime.ofSecondOfDay(60);
//        System.out.println("lt2 "+lt2);
//
//        System.out.println(now.getHour());
//        System.out.println(now.getMinute());
//        System.out.println(now.getSecond());
//        System.out.println(now.getNano());
//
//        System.out.println("-----------");
//        System.out.println(now.plusHours(2));
//        System.out.println(now.plusMinutes(2));
//
//        System.out.println("------------");
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        LocalDate today=LocalDate.now();
//        System.out.println(today);
//
//        LocalDate ld=LocalDate.of(2001,2,28);
//        System.out.println(ld);
//
//        System.out.println("------------------");
//        System.out.println(today.getDayOfYear());
//        System.out.println(today.getDayOfMonth());
//        System.out.println(today.getDayOfWeek());
//
//        System.out.println("------------");
//        System.out.println(today.getMonth());
//        System.out.println(today.getMonthValue());
//
//        System.out.println("------------");
//        System.out.println(today.getYear());
//
//        System.out.println("----------------");
//        System.out.println(today.plusDays(2));
//        System.out.println(today.plusMonths(1));
//        System.out.println(today.plusYears(2));
//        System.out.println(today.plusWeeks(2));
//
//        System.out.println("----------------");
//        System.out.println(today.minusDays(2));
//        System.out.println(today.minusMonths(1));
//        System.out.println(today.minusYears(2));
//        System.out.println(today.minusWeeks(2));
//
//        System.out.println("-------------");
//        System.out.println(today.isBefore(ld));
//        System.out.println(today.isAfter(ld));
//        System.out.println(today.compareTo(ld));//ra số âm thì ngày dang dùng (today)bé hơn số so sánh
//        System.out.println(today.compareTo(LocalDate.now()));
//        System.out.println(today.compareTo(LocalDate.of(2021,8,9)));
//
//        System.out.println("-------------------");
//        if(today.isEqual(LocalDate.of(2021,8,20))){
//            System.out.println("Equals");
//        }
//
//        System.out.println("---------");
//        LocalDate eld=LocalDate.ofEpochDay(10);// unittime:
//    }

}
