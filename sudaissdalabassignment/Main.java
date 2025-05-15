/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudaissdalabassignment;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;

class FeeCalculator {
    private double baseFee = 5000;
    private double lateFine = 500;

    public double calculateTotalFee(String studentId) {
        // Assume late fine applies for demo
        return baseFee + lateFine;
    }
}

class Payment {
    private String studentId;
    private double amount;
    private String status;

    public Payment(String studentId, double amount) {
        this.studentId = studentId;
        this.amount = amount;
        this.status = "Pending";
    }

    public String getStudentId() { return studentId; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

class PaymentProcessor {
    private String paymentMode = "Online";
    private NotificationService notifier = new NotificationService();

    public boolean receivePayment(Payment payment) {
        System.out.println("Processing payment of " + payment.getAmount() + " for student: " + payment.getStudentId());
        payment.setStatus("Paid");
        updatePaymentStatus(payment.getStudentId());
        
        return true;
    }

    public void updatePaymentStatus(String studentId) {
        System.out.println("Payment status updated in database for " + studentId);
    }
}

class NotificationService {
    // You can add methods here for sending notifications, emails, etc.
}

class Student {
    private String studentId;
    private String name;
    private String email;

    public Student(String studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}

class VoucherGenerator {
    public String generateVoucher(String studentId) {
        return "VCHR-" + studentId + "-" + System.currentTimeMillis();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student information
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Email: ");
        String email = scanner.nextLine();

        // Create Student object with input values
        Student student = new Student(studentId, name, email);

        // Calculate total fee
        FeeCalculator calculator = new FeeCalculator();
        double totalFee = calculator.calculateTotalFee(student.getStudentId());

        // Process Payment
        Payment payment = new Payment(student.getStudentId(), totalFee);

        PaymentProcessor processor = new PaymentProcessor();
        processor.receivePayment(payment);

        // Generate Voucher
        VoucherGenerator voucherGen = new VoucherGenerator();
        String voucher = voucherGen.generateVoucher(student.getStudentId());
        System.out.println("Voucher Generated: " + voucher);

        scanner.close();
    }
}
