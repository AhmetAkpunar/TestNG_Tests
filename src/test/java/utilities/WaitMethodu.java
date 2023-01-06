package utilities;

public class WaitMethodu {

    public static void bekle(int sayi) {
        try {
            Thread.sleep(1000 * sayi);
        } catch (InterruptedException e) {

        }
    }


}
