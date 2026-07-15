package Week2.Day2;

public class Main2 {
        public static void main(String[] args) {
            // We can group them by their shared capability (Payable)
            Payable[] payroll = new Payable[2];
            payroll[0] = new Employee2("Alice", 120000.00);        // $120k a year
            payroll[1] = new Contractor("Bob", 50.00, 40.5);      // $50/hr for 40.5 hours

            // Process payroll
            for (Payable worker : payroll) {
                System.out.printf("Payment due: $%.2f\n", worker.calculatePayment());
            }
        }
}
