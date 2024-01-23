public class Main {
    public static void main(String[] args) {
        run(new Service());
    }

    static void run(Service service) {
        double r1 = service.doHardWork("work1", 10); //считает результат
        double r2 = service.doHardWork("work2", 5);  //считает результат
        double r3 = service.doHardWork("work1", 10); //результат из кеша
    }

}
