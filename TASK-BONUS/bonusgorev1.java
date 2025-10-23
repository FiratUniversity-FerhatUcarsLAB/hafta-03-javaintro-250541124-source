public class bonusgorev1 {
    public static void main(String[] args) {
        long totalSeconds = 4728;
        long hours = totalSeconds/3600;
        long minutes = (totalSeconds % 3600) /60;
        long seconds = totalSeconds %60;

        System.out.printf("%d:%02d:%02d",hours,minutes,seconds);

    }
}
