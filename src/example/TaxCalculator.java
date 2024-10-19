package example;

import javax.jws.WebService;

@WebService(targetNamespace = "http://eaxmple/")
public class TaxCalculator {

    public double calculateTax(double income) {
        // 简单的税率示例，实际情况应根据税法进行计算
        double tax = 0.0;
        if (income <= 36000) {
            tax = income * 0.03;
        } else if (income <= 144000) {
            tax = income * 0.1 - 2520;
        } else if (income <= 300000) {
            tax = income * 0.2 - 16920;
        } else if (income <= 420000) {
            tax = income * 0.25 - 31920;
        } else if (income <= 660000) {
            tax = income * 0.3 - 52920;
        } else if (income <= 960000) {
            tax = income * 0.35 - 85920;
        } else {
            tax = income * 0.45 - 181920;
        }
        return tax;
    }
}