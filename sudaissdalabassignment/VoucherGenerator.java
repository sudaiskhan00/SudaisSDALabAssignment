/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudaissdalabassignment;

/**
 *
 * @author lenovo
 */
public class VoucherGenerator {
    public String generateVoucher(String studentId) {
        return "VCHR-" + studentId + "-" + System.currentTimeMillis();
    }
}
