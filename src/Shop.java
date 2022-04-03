import java.util.concurrent.atomic.LongAdder;

public class Shop {
    LongAdder report = new LongAdder();

    public void setReport(long magReport) {
        System.out.println("Выручка магазина " + Thread.currentThread().getName() + magReport);
        report.add(magReport);
    }

    public Long getReport(){
        return report.sum();
    }
}
