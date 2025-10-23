public class hesapozeti {
    public static void main(String[] args) {
        System.out.println("========HESAP ÖZETİ========");
        System.out.printf("%-15s %-10s %-10s%n", "ÜRÜN","MİKTAR","FİYAT");


        System.out.println("---------------------------------------------");

        System.out.printf("%-15s %-10d %-10.2fn","EKMEK", 2, 15.00);
        System.out.printf("%-15s %-10d %-10.2fn", "MEYVE", 1, 30.00);
        System.out.printf("%-15s %-10d %-10.2fn", "YUMURTA",10, 80.00);

        System.out.println("-----------------------------------------------");
        System.out.printf("%-15s %-10s %-10.2fn", "TOPLAM","",(15.00*2 + 30.00 +10*80.00));

    }
}
