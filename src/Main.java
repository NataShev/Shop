public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shop shop = new Shop();
        Thread magazine1 = new Thread(null,() -> shop.setReport(10569),"на Якиманке ");
        Thread magazine2 = new Thread(null,() -> shop.setReport(20549),"в Люблино ");
        Thread magazine3 = new Thread(null,() -> shop.setReport(5558),"на улице Всеволжская ");

        magazine1.start();
        magazine2.start();
        magazine3.start();

        magazine3.join();
        magazine2.join();
        magazine1.join();
        System.out.println("Общая выручка со всех магазинов равна " + shop.getReport());

    }
}
