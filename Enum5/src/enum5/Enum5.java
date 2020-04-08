/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enum5;

/**
 *
 * @author JW
 */
enum Color {
    CYAN, MAGENTA, YELLOW, BLACK;

    // enum constructor called separately for each 
    // constant 
    private Color() {
        System.out.println("Constructor called for : "
                + this.toString());
    }

    public void colorInfo() {
        System.out.println("CMYK");
    }
}

public class Enum5 {
// enums can have constructor and concrete methods. 

    public static void main(String[] args) {
        Color cmyk = Color.MAGENTA;
        System.out.println(cmyk);
        cmyk.colorInfo();
    }
}
