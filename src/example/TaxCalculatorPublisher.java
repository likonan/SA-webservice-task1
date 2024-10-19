package example;

import javax.xml.ws.Endpoint;

public class TaxCalculatorPublisher {
    public static void main(String[] args) {
        String address = "http://localhost:8080/tax";
        Endpoint.publish(address, new TaxCalculator());
        System.out.println(address);
    }
}
