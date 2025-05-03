/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudaissdalabassignment;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("ST123", "Ali Khan", "ali@email.com");

        FeeCalculator calculator = new FeeCalculator();
        double totalFee = calculator.calculateTotalFee(student.getStudentId());

        Payment payment = new Payment(student.getStudentId(), totalFee);

        PaymentProcessor processor = new PaymentProcessor();
        processor.receivePayment(payment);

        VoucherGenerator voucherGen = new VoucherGenerator();
        String voucher = voucherGen.generateVoucher(student.getStudentId());
        System.out.println("Voucher Generated: " + voucher);
    }
}
