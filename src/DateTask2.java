import java.util.*;

public class DateTask2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Формат ввода Январь - 1, Февраль - 2 и т.д.");
        System.out.println("Введите месяц в котором вы хотите посчитать количество пятниц: ");

        int month = in.nextInt();

        GregorianCalendar data = new GregorianCalendar();
        data.set(2016,month-1,1);
//        System.out.println(data.getTime());
//        System.out.println(data.get(Calendar.MONTH));

        int CurrentMonth = data.get(Calendar.MONTH);

        int numberOfFridays = 0;

        do{
            if (data.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY)
                numberOfFridays += 1;
            data.add(Calendar.DAY_OF_YEAR, 1);
        } while (CurrentMonth == data.get(Calendar.MONTH));

        System.out.println("В указанном вами месяце " + numberOfFridays + " пятниц");


    }
}
