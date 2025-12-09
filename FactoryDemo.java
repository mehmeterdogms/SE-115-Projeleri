import java.util.Scanner;

public class FactoryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("creating robots");
        Robot r1 = new Robot("X-1000", 100, "Active");
        Robot r2 = new Robot("Y-200", 40, "Charging");

        r1.displayRobotInfo();
        r2.displayRobotInfo();

        System.out.println();
        System.out.print("enter battery amount to consume for x-1000: ");
        int amount = scanner.nextInt();

        if (r1.isBatteryEnough(amount)) {
            r1.consumeBattery(amount);
            System.out.println("consumed " + amount);
        } else {
            System.out.println("not enough battery");
        }
        r1.displayRobotInfo();

        System.out.println();
        System.out.println("charging y-200");
        r2.chargeBattery(50);
        r2.displayRobotInfo();
        r2.chargeBattery(20);
        r2.displayRobotInfo();

        System.out.println();
        System.out.println("single task test");
        Task t1 = new Task("welding", 20);
        Task t2 = new Task("painting", 30);

        t1.describeTask();
        r1.performTask(t1);
        r1.displayRobotInfo();

        System.out.println();
        System.out.println("batch test bonus part");
        TaskBatch batch = new TaskBatch();
        batch.addTask(new Task("assembly", 15));
        batch.addTask(new Task("quality check", 10));
        batch.addTask(new Task("packaging", 25));

        batch.printBatchInfo();
        System.out.println("total batch cost: " + batch.getTotalEnergyCost());

        System.out.println();
        System.out.println("x-1000 attempting batch");
        System.out.println("before:");
        r1.displayRobotInfo();

        r1.performTaskBatch(batch);

        System.out.println("after:");
        r1.displayRobotInfo();

        scanner.close();
    }
}
