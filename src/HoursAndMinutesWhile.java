public class HoursAndMinutesWhile {
    public static void main(String[] args) {
        int hours = 0;
        int minutes = 0;

        while (hours < 3) {
            System.out.printf("%d h %d min\n", hours, minutes);

            minutes++;

            if (minutes == 60) {
                hours++;
                minutes = 0;
            }
        }


    }
}