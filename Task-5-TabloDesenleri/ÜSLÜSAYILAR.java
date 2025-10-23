public class ÜSLÜSAYILAR {
    public static void main(String[] args) {
        System.out.println("==========ÜSLÜ SAYILAR TABLOSU========");
        System.out.printf("%-10s %-10s %-10s%n", "sayı","karesi", "kübü");
        System.out.println("--------------------------------------");

        for (int i=1; i<=5; i++) {
            int kare = i*i;
            int kup = i*i*i;
            System.out.printf("%-10s %-10s %-10s%n",i,kare,kup);
        }

    }
}
