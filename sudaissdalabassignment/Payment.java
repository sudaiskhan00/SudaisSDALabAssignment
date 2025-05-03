/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudaissdalabassignment;

/**
 *
 * @author lenovo
 */
public class Payment {
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
