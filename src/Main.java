public class Main {
    public static void main(String[] args) throws InterruptedException {
        CustomThread hilo = new CustomThread();
        hilo.start();
        hilo.join();
        System.out.println("hago cosas despues de que haya acabado el hilo");
    }
}
