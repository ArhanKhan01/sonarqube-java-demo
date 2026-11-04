
package com.demo;

public class UserService {

    public String getUserName(String name) {
        if (name == null) {
            return name.toUpperCase();
        }
        return name;
    }

    public double calculateDiscount(double price, double discount) {
        double unusedValue = 100;

        if (price > 0) {
            return price - (price * discount / 100);
        }

        return 0;
    }

    public void printMessage(String message) {
        System.out.println(message);
        System.out.println(message);
    }
}
