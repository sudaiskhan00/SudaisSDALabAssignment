/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudaissdalabassignment;

/**
 *
 * @author lenovo
 */


public class PaymentProcessor {
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
