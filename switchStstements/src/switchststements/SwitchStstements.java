/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchststements;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author griebjos
 */
public class SwitchStstements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        out.println("You stumble apon a house of horror at night.\n"
                + " Your only chance of survival is to go through one of four "
                + "doors.\n The first door has a pool of lava. The second door is"
                + " full of ice cold water that will freeze you instantly.\n"
                + "The third door is full of poisonous gas.\n"
                + " The last door has a serial killer that terrorized the"
                + " streets of your town in 1865.\n\n What door do you go in to "
                + "escape without harm: door 1, door 2, door 3, or door 4?\n\n");
        
        
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();
        switch (answer) {
            case "door 1":
            case "1": System.out.println("you burn to death from the intense "
                    + "heat of the lava.\n\n GAME OVER");
            break;
            case "door 2":
            case "2": System.out.println("you freeae to death from the intense "
                    + "cold of the water.\n\n GAME OVER");
            break;
            case "door 3":
            case "3": System.out.println("you melt to death from the poisonous "
                    + "gas in this room.\n\n GAME OVER");
            break;
            case "door 4":
            case "4": System.out.println("you escape safely because the killer "
                    + "died over 200 years ago.");
            break;
            default: System.out.println("Not valad responce. use numbers 1, "
                    + "2, 3, or 4 only.");
        }
    }
    
}
