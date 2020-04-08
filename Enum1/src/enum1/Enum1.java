/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enum1;

/**
 *
 * @author JW
 */
public class Enum1 {

    enum Size {SMALL, MEDIUM, LARGE};
    
    public static void main(String[] args) {        
        Size size;        
        size = Size.MEDIUM;
        System.out.println("Size: " + size);
    }
    
}
