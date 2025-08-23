package main.Classical.Kinematics;
import java.util.Scanner;

import main.Utils.Utils;

public class Kinematics {
    public void showInfo(Scanner scan) {
        System.out.print("Welcome to the Kinematics module. Please select a sub-module:\n1. Motion in One Dimension\n2. Motion in Two Dimensions\n3. Projectile Motion\n4. Back\n>");
        int choice = scan.nextInt();
        if (choice == 1) {
            Utils.clearScreen();
            OneDMotion(scan);
        } else if (choice == 2) {
            Utils.clearScreen();
            TwoDMotion(scan);
        } else if (choice == 3) {
            Utils.clearScreen();
            System.out.println("You have selected Projectile Motion.");
            System.out.println("This sub-module covers the motion of objects that are launched into the air and are subject to gravity.");
        } else if (choice == 4) {
            System.out.println("Returning to Classical Mechanics menu.");
            main.Classical.ClassicalMechanics cm = new main.Classical.ClassicalMechanics();
            Utils.clearScreen();
            cm.showInfo(scan);
        }
    }

public void OneDMotion(Scanner scan) {
        System.out.println("You have selected the Motion in One Dimension module.");
            System.out.print("Please choose a specific topic:\n1. Displacement, Velocity, and Speed\n2. Acceleration\n3. Motion with Constant Acceleration\n4. Back\n>");
            int subChoice = scan.nextInt();
            if (subChoice == 1) {
                Utils.clearScreen();
                //Begin displacement, velocity, speed
                System.out.println("This topic covers the concepts of displacement, velocity, and speed in one-dimensional motion.");
                System.out.println("Displacement is a vector quantity that refers to the change in position of an object. Velocity is the rate of change of displacement with respect to time, and speed is the magnitude of velocity, not considering the direction of the velocity.");
                System.out.println("Formulas:\nDisplacement (delta x) = x_final - x_initial\nAverage Velocity (v_avg) = delta x / delta t\nSpeed = |v_avg|");
                //add example
                System.out.println("Let's do another example. Please enter the initial position (x_initial) and final position (x_final) of the object, in meters:");
                double x_initial = scan.nextDouble();
                double x_final = scan.nextDouble();
                double displacement = x_final - x_initial;
                System.out.println("The displacement (delta x) is: " + displacement );
                System.out.println("Now, please enter the time interval (delta t), in seconds, during which the displacement occurred:");
                double delta_t = scan.nextDouble();
                double average_velocity = displacement / delta_t;
                System.out.println("The average velocity (v_avg) is: " + average_velocity + " m/s");
                System.out.println("The speed is the absolute value of the average velocity, which in this case is: " + Math.abs(average_velocity));
                System.out.println("Please enter any key to return to the Motion in One-Dimension menu.");
                scan.next();
                System.out.println("Returning to Motion in One Dimension menu.");
                Utils.clearScreen();
                OneDMotion(scan);

                //End displacement, velocity, speed
            } else if (subChoice == 2) {
                Utils.clearScreen();
                //Begin acceleration
                System.out.println("This topic covers the concept of acceleration and its relation to velocity and time.");
                System.out.println("Acceleration is a vector quantity that represents the rate of change of velocity with respect to time. It can be positive (speeding up) or negative (slowing down).");
                System.out.println("Formulas:\nAcceleration (a) = delta v / delta t\nWhere deltav is the change in velocity and delta t is the time interval.");
                System.out.println("For example, if a car's velocity changes from 0 m/s to 20 m/s in 5 seconds, the acceleration can be calculated as follows:");
                System.out.println("Initial Velocity (v_initial) = 0 m/s\nFinal Velocity (v_final) = 20 m/s\nTime Interval (delta t) = 5 s");
                System.out.println("Change in Velocity (delta v) = v_final - v_initial = 20 m/s - 0 m/s = 20 m/s");
                System.out.println("The acceleration (a) is therefore: 4 m/s²");
                System.out.println("Let's do another example. Please enter the initial velocity (v_initial) and final velocity (v_final) of the object, in m/s:");
                double v_initial = scan.nextDouble();
                double v_final = scan.nextDouble();
                System.out.println("Please enter the time interval (delta t) during which the change in velocity occurred, in seconds:");
                double delta_t = scan.nextDouble();
                double delta_v = v_final - v_initial;
                double acceleration = delta_v / delta_t;
                System.out.println("The acceleration (a) is: " + acceleration + " m/s²");
                //End acceleration
                System.out.println("Please enter any key to return to the Motion in One-Dimension menu.");
                scan.next();
                System.out.println("Returning to Motion in One Dimension menu.");
                Utils.clearScreen();
                OneDMotion(scan);
            } else if (subChoice == 3) {
                Utils.clearScreen();
                System.out.println("This topic covers motion with constant acceleration, including free fall.");
                System.out.println("Formulas:\nv = v_initial + a * t\nx = x_initial + v_initial * t + 0.5 * a * t^2\nv^2 = v_initial^2 + 2 * a * (x - x_initial)");
                System.out.println("Where:\nv = final velocity\na = acceleration\nt = time\nx = final position\nx_initial = initial position\nv_initial = initial velocity");
            } else if (subChoice == 4){
                System.out.println("Returning to Kinematics Module menu.");
                Utils.clearScreen();
                showInfo(scan);
            }
        }
        public void TwoDMotion(Scanner scan) {
            System.out.println("You have selected the Motion in Two Dimensions module.");
            System.out.println("This sub-module covers the concepts of motion in a plane, including vectors, velocity, and acceleration in two dimensions.");
            System.out.println("Please select a specific topic:\n1. Vectors and Vector Addition\n2. Projectile Motion in 2D\n3. Uniform Circular Motion\n4. Back\n>");
            int subChoice = scan.nextInt();
            if (subChoice == 1) {
                System.out.println("This topic covers the representation and addition of vectors in two dimensions.");
                System.out.println("Vectors can be represented in component form (i, j) or in magnitude and direction (r, θ).");
                System.out.println("Vector Addition:\nIf A = A_x i + A_y j and B = B_x i + B_y j, then the resultant vector R = (A_x + B_x) i + (A_y + B_y) j.");
                System.out.println("Magnitude of R: |R| = sqrt((A_x + B_x)² + (A_y + B_y)²)");
                System.out.println("Direction of R: θ_R = tan^(-1)((A_y + B_y)/(A_x + B_x))");
                System.out.println("Where : A_x and A_y are the components of vector A, and B_x and B_y are the components of vector B\nR is the resultant vector, and θ_R is the angle of R with respect to the x-axis.");
                System.out.println("Let's do an example. Please enter the components of vector A (A_x and A_y):");
                double A_x = scan.nextDouble();
                double A_y = scan.nextDouble();
                System.out.println("Please enter the components of vector B (B_x and B_y):");
                double B_x = scan.nextDouble();
                double B_y = scan.nextDouble();
                double R_x = A_x + B_x;
                double R_y = A_y + B_y;
                double R_magnitude = Math.sqrt(R_x * R_x + R_y * R_y);
                double R_angle = Math.toDegrees(Math.atan2(R_y, R_x));
                System.out.println("The resultant vector R has components: (" + R_x + ", " + R_y + ")");
                System.out.println("The magnitude of R is: " + R_magnitude);
                System.out.println("The direction of R is: " + R_angle + " degrees from the x-axis.");
                System.out.println("Please enter any key to return to the Motion in Two-Dimensions menu.");
                scan.next();
                System.out.println("Returning to Motion in Two Dimensions menu.");
                Utils.clearScreen();
                TwoDMotion(scan);
            } else if (subChoice == 2) {
                System.out.println("This topic covers projectile motion, which is the motion of an object thrown or projected into the air, subject to only the acceleration of gravity.");
                System.out.println("Key Equations:\nHorizontal Motion: x = v_initial * cos(θ) * t\nVertical Motion: y = v_initial * sin(θ) * t - 0.5 * g * t²\nWhere g is the acceleration due to gravity (approximately 9.81 m/s²).");
                System.out.println("Time of Flight: T = (2 * v_initial * sin(θ)) / g\nMaximum Height: H = (v_initial² * sin²(θ)) / (2 * g)\nRange: R = (v_initial² * sin(2θ)) / g");
            } else if (subChoice == 3) {
                System.out.println("This topic covers uniform circular motion, which is the motion of an object moving at a constant speed along a circular path.");
                System.out.println("Key Concepts:\nCentripetal Acceleration: a_c = v² / r\nCentripetal Force: F_c = m * a_c = m * v² / r\nWhere v is the tangential speed, r is the radius of the circle, and m is the mass of the object.");
            } else if (subChoice == 4){
                System.out.println("Returning to Kinematics Module menu.");
                Utils.clearScreen();
                showInfo(scan);
            }
            System.out.println("Please enter any key to return to the Kinematics menu.");
            scan.next();
            Utils.clearScreen();
            showInfo(scan);
        }
    }