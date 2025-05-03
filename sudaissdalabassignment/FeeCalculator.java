/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudaissdalabassignment;

/**
 *
 * @author lenovo
 */
public class FeeCalculator {
    private double baseFee = 5000;
    private double lateFine = 500;

    public double calculateTotalFee(String studentId) {
        // Assume late fine applies for demo
        return baseFee + lateFine;
    }
}
