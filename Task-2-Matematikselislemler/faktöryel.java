public class faktöryel {
    public static void main (String[] args) {
        int sayi =5;
        int faktöryel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktöryel *=i;
        }

         System.out.println("5! ="+faktöryel);
    }

}
