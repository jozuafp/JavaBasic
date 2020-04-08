/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enum2;

// An Enum class 
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;
}

public class Enum2 {

    Day day;

    // Constructor 
    public Enum2(Day day) {
        this.day = day;
    }

    public void dayIsLike() {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Hari Kerja");
                break;
            case FRIDAY:
            default:
                System.out.println("Hari libur");
                break;
        }
    }

    public static void main(String[] args) {
        String str = "SATURDAY";
        Enum2 t1 = new Enum2(Day.valueOf(str));
        t1.dayIsLike();
    }
}
