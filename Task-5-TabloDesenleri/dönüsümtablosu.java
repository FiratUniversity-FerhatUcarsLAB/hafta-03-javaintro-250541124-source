public class dönüsümtablosu {
    public static void main(String[] args) {
        System.out.println("----------MİL-KİLOMETRE DÖNÜŞÜM TABLOSU------- ");
        System.out.printf("%-10s %-15s%n","Mil","Kilometre");
        System.out.println("-------------------");

        double[] mildeğerleri = {1, 5, 10 , 20 ,50};

        for (double mil :mildeğerleri) {
            double km = mil*1.609344;
            System.out.printf("%-10s %-15s%n",mil,km);
        }
    }
}
