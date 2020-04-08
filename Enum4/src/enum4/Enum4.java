/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enum4;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Enum4 {

    public static void main(String[] args) {
        for (Level Val : Level.values()) {
            System.out.println(Val);
        }
    }
}
