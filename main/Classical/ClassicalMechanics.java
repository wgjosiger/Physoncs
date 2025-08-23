package main.Classical;
import main.Utils.Utils;
import java.util.Scanner;

import main.Classical.Kinematics.Kinematics;
public class ClassicalMechanics {
    public void showInfo(Scanner scan) {
        System.out.print("Welcome to the Classical Mechanics chapter. Please select a module: \n1. Kinematics\n2. Dynamics\n3. Energy and Work\n4. Fluid Mechanics\n5. Oscillations and Waves\n6. Gravitation\n7. Back\n>");
        int choice = scan.nextInt();
        if(choice == 1) {
            System.out.println("You selected Kinematics.");
            System.out.println("This module covers the motion of objects without considering the forces that cause the motion.");
            Kinematics km = new Kinematics();
            Utils.clearScreen();
            km.showInfo(scan);
        } else if(choice == 2) {
            System.out.println("You selected Dynamics.");
        } else if(choice == 3) {
            System.out.println("You selected Energy and Work.");
        } else if(choice == 4) {
            System.out.println("You selected Fluid Mechanics.");
        } else if(choice == 5) {
            System.out.println("You selected Oscillations and Waves.");
        } else if(choice == 6) {
            System.out.println("You selected Gravitation.");
        } else if(choice == 7) {
            System.out.println("Returning to main menu.");
            Utils.clearScreen();
            main.Main.physicsProgram(scan);
        }
    }
}
