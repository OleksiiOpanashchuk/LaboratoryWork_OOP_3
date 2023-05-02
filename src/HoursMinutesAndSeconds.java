public class HoursMinutesAndSeconds {
    public static void main(String[] args) {
        for (int h = 0; h <= 2; h++) {
            for (int min = 0; min < 60; min++) {
                for (int sec = 0; sec < 60; sec++) {
                    System.out.println(h + "h " + min + "min" + sec + "sec");
                }
            }
        }
}
}
