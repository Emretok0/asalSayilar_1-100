
public class Main {

    public static void main(String[] args) {

        int baslangic = 1, bitis = 100;

        boolean h = true;

        while (baslangic < bitis) {
            for (int i = 2; i <= baslangic; i++) {
                if (i != baslangic) {
                    if (baslangic % i == 0) {
                        h = false;
                        break;
                    }
                } else {
                    if (baslangic % i==0){
                        h = true;
                    }
                }
            }
            if (h && baslangic!=1){
                System.out.println(baslangic);
            }
            baslangic++;
        }
    }
}
