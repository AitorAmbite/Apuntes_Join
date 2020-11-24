public class CustomThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("hago cosillas y espero 2 segundos");
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
