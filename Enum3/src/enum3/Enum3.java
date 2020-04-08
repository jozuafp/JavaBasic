/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enum3;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Enum3 {

    public static void main(String[] args) {
        Level Val = Level.HIGH;

        switch (Val) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
