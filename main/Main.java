package main;
import java.util.Scanner;

import main.Classical.ClassicalMechanics;
import main.Electro.Electromagnetism;
import main.Thermo.Thermodynamics;
import main.Utils.Utils;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Utils.clearScreen();
        System.out.print("Welcome to the program! Please select a sub-program:\n1. Select a physics program\n2. Exit\n>");
        int in = scan.nextInt();
        if (in == 2) {
            System.exit(0);
        } else if (in == 1) {
            Utils.clearScreen();
            physicsProgram(scan);
        }
    }
        public static void restart(Scanner scan) {
        System.out.print("Please select a sub-program:\n1. Select a physics program\n2. Exit\n>");
        int in = scan.nextInt();
        if (in == 2) {
            System.exit(0);
        } else if (in == 1) {
            Utils.clearScreen();
            physicsProgram(scan);
        }
    }
    public static void physicsProgram(Scanner scan) {
        System.out.print("Please select a physics module:\n1. Classical Mechanics\n2. Electromagnetism\n3. Thermodynamics\n4. Back\n>");
        int choice = scan.nextInt();
        if (choice == 1) {
            System.out.println("You selected Classical Mechanics.");
            Utils.clearScreen();
            ClassicalMechanics cm = new ClassicalMechanics();
            cm.showInfo(scan);
        } else if (choice == 2) {
            System.out.println("You selected Electromagnetism.");
            Utils.clearScreen();
            Electromagnetism em = new Electromagnetism();
            em.showInfo();
        } else if (choice == 3) {
            System.out.println("You selected Thermodynamics.");
            Utils.clearScreen();
            Thermodynamics td = new Thermodynamics();
            td.showInfo();
        }
        else if(choice == 4) {
            Utils.clearScreen();
            restart(scan);
        }
    }
}