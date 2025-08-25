package main.Classical.Kinematics;
import java.util.Scanner;

import main.Utils.Utils;

public class Kinematics {
    public void showInfo(Scanner scan) {
        System.out.print("Welcome to the Kinematics module. Please select a sub-module:\n1. Motion in One Dimension\n2. Motion in Two Dimensions\n3. Motion in Three Dimension\n4. Back\n>");
        int choice = scan.nextInt();
        if (choice == 1) {
            Utils.clearScreen();
            OneDMotion(scan);
        } else if (choice == 2) {
            Utils.clearScreen();
            TwoDMotion(scan);
        }else if(choice ==3){
            ThreeDMotion(scan);
        } else if (choice == 4) {
            System.out.println("Returning to Classical Mechanics menu.");
            main.Classical.ClassicalMechanics cm = new main.Classical.ClassicalMechanics();
            Utils.clearScreen();
            cm.showInfo(scan);
        }
    }

    public void OneDMotion(Scanner scan) {
            Utils.clearScreen();
            System.out.println("You have selected the Motion in One Dimension module.");
            System.out.print("Please choose a specific topic:\n1. Displacement, Velocity, and Speed\n2. Acceleration\n3. Motion with Constant Acceleration\n4. Back\n>");
            int subChoice = scan.nextInt();
            if (subChoice == 1) {
                Utils.clearScreen();
                //Begin displacement, velocity, speed
                System.out.println("This topic covers the concepts of displacement, velocity, and speed in one-dimensional motion.");
                System.out.println("Displacement is a vector quantity that refers to the change in position of an object. Velocity is the rate of change of displacement with respect to time, and speed is the magnitude of velocity, not considering the direction of the velocity.");
                System.out.println("Formulas:\nDisplacement (delta x) = x_final - x_initial\nAverage Velocity (v_avg) = delta x / delta t\nSpeed = |v_avg|");
                // Static example
                System.out.println("Example: An object moves from x_initial = 2 m to x_final = 10 m in delta t = 4 s.");
                System.out.println("We can calculate the displacement (delta x), average velocity (v_avg), and speed as follows:");
                System.out.println("x_initial = 2 m, x_final = 10 m, delta t = 4 s");
                System.out.println("Displacement delta x = x_final - x_initial");
                System.out.println("Average velocity v_avg = delta x / delta t");
                System.out.println("Speed = |v_avg|");
                double ex_x_initial = 2;
                double ex_x_final = 10;
                double ex_displacement = ex_x_final - ex_x_initial;
                double ex_delta_t = 4;
                double ex_average_velocity = ex_displacement / ex_delta_t;
                System.out.println("Displacement: " + ex_displacement + " m");
                System.out.println("Average velocity: " + ex_average_velocity + " m/s");
                System.out.println("Speed: " + Math.abs(ex_average_velocity) + " m/s");
                System.out.println();
                // Interactive example
                System.out.println("Now, let's try your own values. Please enter the initial position (x_initial) and final position (x_final) of the object, in meters:");
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
                //Begin acceleration
                Utils.clearScreen();
                System.out.println("This topic covers the concept of acceleration and its relation to velocity and time.");
                System.out.println("Acceleration is a vector quantity that represents the rate of change of velocity with respect to time. It can be positive (speeding up) or negative (slowing down).");
                System.out.println("Formulas:\nAcceleration (a) = delta v / delta t\nWhere deltav is the change in velocity and delta t is the time interval.");
                // Static example
                System.out.println("Example: A car's velocity changes from 5 m/s to 25 m/s in 10 seconds.");
                System.out.println("We can calculate the change in velocity (delta v) and the acceleration (a) as follows:");
                System.out.println("v_initial = 5 m/s, v_final = 25 m/s, delta t = 10 s");
                System.out.println("Delta v = v_final - v_initial");
                System.out.println("Acceleration a = delta v / delta t");
                double ex_v_initial = 5;
                double ex_v_final = 25;
                double ex_delta_t = 10;
                double ex_delta_v = ex_v_final - ex_v_initial;
                double ex_acceleration = ex_delta_v / ex_delta_t;
                System.out.println("Change in velocity: " + ex_delta_v + " m/s");
                System.out.println("Acceleration: " + ex_acceleration + " m/s²");
                System.out.println();
                // Interactive example
                System.out.println("Let's try your own values. Please enter the initial velocity (v_initial) and final velocity (v_final) of the object, in m/s:");
                double v_initial = scan.nextDouble();
                double v_final = scan.nextDouble();
                System.out.println("Please enter the time interval (delta t) during which the change in velocity occurred, in seconds:");
                double delta_t = scan.nextDouble();
                double delta_v = v_final - v_initial;
                double acceleration = delta_v / delta_t;
                System.out.println("The acceleration (a) is: " + acceleration + " m/s²");
                System.out.println("Please enter any key to return to the Motion in One-Dimension menu.");
                scan.next();
                System.out.println("Returning to Motion in One Dimension menu.");
                Utils.clearScreen();
                OneDMotion(scan);
                //End acceleration
            } else if (subChoice == 3) {
                //Begin motion with constant acceleration
                Utils.clearScreen();
                System.out.println("This topic covers motion with constant acceleration, including free fall.");
                System.out.println("Formulas:\nv = v_initial + a * t\nx = x_initial + v_initial * t + 0.5 * a * t^2\nv^2 = v_initial^2 + 2 * a * (x - x_initial)");
                System.out.println("Where:\nv = final velocity\na = acceleration\nt = time\nx = final position\nx_initial = initial position\nv_initial = initial velocity");
                // Static example
                System.out.println("Example: A car starts from rest (v_initial = 0 m/s) and accelerates at 2 m/s² for 6 seconds.");
                System.out.println("We can calculate the final velocity (v) and displacement (x - x_initial) as follows:");
                System.out.println("v_initial = 0 m/s, a = 2 m/s², t = 6 s");
                System.out.println("Final velocity v = v_initial + a * t");
                System.out.println("Displacement x - x_initial = v_initial * t + 0.5 * a * t^2");
                double ex_v_initial2 = 0;
                double ex_a = 2;
                double ex_t = 6;
                double ex_v_final2 = ex_v_initial2 + ex_a * ex_t;
                double ex_x_initial = 0;
                double ex_x_final = ex_x_initial + ex_v_initial2 * ex_t + 0.5 * ex_a * ex_t * ex_t;
                System.out.println("Final velocity: " + ex_v_final2 + " m/s");
                System.out.println("Displacement: " + (ex_x_final - ex_x_initial) + " m");
                System.out.println();
                // Interactive example
                System.out.println("Now, let's try your own values. Please enter the initial velocity (v_initial), acceleration (a), and time (t) of the object:");
                double v_initial = scan.nextDouble();
                double a = scan.nextDouble(); 
                double t = scan.nextDouble();
                double v_final = v_initial + a * t;
                double x_initial = 0; // initial position in meters
                double x_final = x_initial + v_initial * t + 0.5 * a * t * t;
                System.out.println("The final velocity (v) is: " + v_final + " m/s");
                System.out.println("The displacement (x - x_initial) is: " + (x_final - x_initial) + " meters");
                System.out.println("Please enter any key to return to the Motion in One-Dimension menu.");
                scan.next();
                System.out.println("Returning to Motion in One Dimension menu.");
                Utils.clearScreen();
                OneDMotion(scan);
                //End motion with constant acceleration
            } else if (subChoice == 4){
                System.out.println("Returning to Kinematics Module menu.");
                Utils.clearScreen();
                showInfo(scan);
            }
        }
        public void TwoDMotion(Scanner scan) {
            Utils.clearScreen();
            System.out.println("You have selected the Motion in Two Dimensions module.");
            System.out.println("This sub-module covers the concepts of motion in a plane, including vectors, velocity, and acceleration in two dimensions.");
            System.out.println("Please select a specific topic:\n1. Vectors and Vector Addition\n2. Projectile Motion in 2D\n3. Uniform Circular Motion\n4. Back\n>");
            int subChoice = scan.nextInt();
            if (subChoice == 1) {
                Utils.clearScreen();
                //Begin vectors and vector addition
                System.out.println("This topic covers the representation and addition of vectors in two dimensions.");
                System.out.println("Vectors can be represented in component form (i, j) or in magnitude and direction (r, theta).");
                System.out.println("Vector Addition:\nIf A = A_x i + A_y j and B = B_x i + B_y j, then the resultant vector R = (A_x + B_x) i + (A_y + B_y) j.");
                System.out.println("Magnitude of R: |R| = sqrt((A_x + B_x)² + (A_y + B_y)²)");
                System.out.println("Direction of R: theta_R = tan^(-1)((A_y + B_y)/(A_x + B_x))");
                System.out.println("Where : A_x and A_y are the components of vector A, and B_x and B_y are the components of vector B\nR is the resultant vector, and theta_R is the angle of R with respect to the x-axis.");
                // Static example
                System.out.println("Example: Vector A = (3, 4), Vector B = (1, 2)");
                System.out.println("We can calculate the resultant vector (R), its magnitude (|R|), and direction (theta_R) as follows:");
                System.out.println("Resultant vector R = (A_x + B_x, A_y + B_y)");
                System.out.println("Magnitude of R = sqrt((A_x + B_x)² + (A_y + B_y)²)");
                System.out.println("Direction of R = tan^(-1)((A_y + B_y)/(A_x + B_x))");
                double ex_A_x = 3, ex_A_y = 4, ex_B_x = 1, ex_B_y = 2;
                double ex_R_x = ex_A_x + ex_B_x;
                double ex_R_y = ex_A_y + ex_B_y;
                double ex_R_magnitude = Math.sqrt(ex_R_x * ex_R_x + ex_R_y * ex_R_y);
                double ex_R_angle = Math.toDegrees(Math.atan2(ex_R_y, ex_R_x));
                System.out.println("Resultant vector R: (" + ex_R_x + ", " + ex_R_y + ")");
                System.out.println("Magnitude of R: " + ex_R_magnitude);
                System.out.println("Direction of R: " + ex_R_angle + " degrees from the x-axis");
                System.out.println();
                // Interactive example
                System.out.println("Now, let's do your own example. Please enter the components of vector A (A_x and A_y):");
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
                //End vectors and vector addition
            } else if (subChoice == 2) {
                Utils.clearScreen();
                //Begin projectile motion in 2D
                System.out.println("This topic covers projectile motion, which is the motion of an object thrown or projected into the air, subject to only the acceleration of gravity.");
                System.out.println("Key Equations:\nHorizontal Motion: x = v_initial * cos(theta) * t\nVertical Motion: y = v_initial * sin(theta) * t - 0.5 * g * t²\nWhere g is the acceleration due to gravity (approximately 9.81 m/s²).");
                System.out.println("Time of Flight: T = (2 * v_initial * sin(theta)) / g\nMaximum Height: H = (v_initial² * sin²(theta)) / (2 * g)\nRange: R = (v_initial² * sin(2theta)) / g");
                System.out.println("Where:\nv_initial = initial velocity\ntheta = launch angle\nt = time\nx = horizontal position\ny = vertical position");
                // Static example
                System.out.println("Example: v_initial = 20 m/s, theta = 45 degrees");
                double ex_v_initial = 20;
                double ex_theta = Math.toRadians(45);
                double ex_g = 9.81;
                double ex_time_of_flight = (2 * ex_v_initial * Math.sin(ex_theta)) / ex_g;
                double ex_max_height = (Math.pow(ex_v_initial, 2) * Math.pow(Math.sin(ex_theta),2)) / (2 * ex_g);
                double ex_range = (Math.pow(ex_v_initial, 2) * Math.sin(2 * ex_theta)) / ex_g;
                System.out.println("Time of flight: " + ex_time_of_flight + " s");
                System.out.println("Maximum height: " + ex_max_height + " m");
                System.out.println("Range: " + ex_range + " m");
                System.out.println();
                // Interactive example
                System.out.println("Now, let's do your own example. Please enter the initial velocity (v_initial) in m/s and the launch angle (theta) in degrees:");
                double v_initial = scan.nextDouble();
                double theta = Math.toRadians(scan.nextDouble());
                double g = 9.81; // acceleration due to gravity in m/s²
                double time_of_flight = (2 * v_initial * Math.sin(theta)) / g;
                double max_height = (Math.pow(v_initial, 2) * Math.pow(Math.sin(theta),2)) / (2 * g);
                double range = (Math.pow(v_initial, 2) * Math.sin(2 * theta)) / g;
                System.out.println("The time of flight (T) is: " + time_of_flight + " seconds");
                System.out.println("The maximum height (H) is: " + max_height + " meters");
                System.out.println("The range (R) is: " + range + " meters");
                System.out.println("Please enter any key to return to the Motion in Two-Dimensions menu.");
                scan.next();
                System.out.println("Returning to Motion in Two Dimensions menu.");
                Utils.clearScreen();
                TwoDMotion(scan);
                //End projectile motion in 2D
            } else if (subChoice == 3) {
                Utils.clearScreen();
                //Begin uniform circular motion
                System.out.println("This topic covers uniform circular motion, which is the motion of an object moving at a constant speed along a circular path.");
                System.out.println("Key Concepts:\nCentripetal Acceleration: a_c = v² / r\nCentripetal Force: F_c = m * a_c = m * v² / r\nWhere v is the tangential speed, r is the radius of the circle, and m is the mass of the object.");
                // Static example
                System.out.println("Example: v = 10 m/s, r = 5 m");
                double ex_v = 10;
                double ex_r = 5;
                double ex_a_c = (ex_v * ex_v) / ex_r;
                System.out.println("Centripetal acceleration: " + ex_a_c + " m/s²");
                System.out.println();
                // Interactive example
                System.out.println("Now, let's do your own example. Please enter the tangential speed (v) in m/s and the radius (r) in meters of the circular path:");
                double v = scan.nextDouble();
                double r = scan.nextDouble();
                double a_c = (v * v) / r;
                System.out.println("The centripetal acceleration (a_c) is: " + a_c + " m/s²");
                System.out.println("Please enter any key to return to the Motion in Two-Dimensions menu.");
                scan.next();
                System.out.println("Returning to Motion in Two Dimensions menu.");
                Utils.clearScreen();
                TwoDMotion(scan);
                //End uniform circular motion
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
        public static void ThreeDMotion(Scanner scan){
            Utils.clearScreen();
            System.out.println("This topic covers motion in three dimensions, including vectors, projectile motion in 3D, and uniform circular motion in 3D.");
            System.out.println("Please select a specific topic:\n1. Vectors and Vector Addition\n2. Projectile Motion in 3D\n3. Uniform Circular Motion\n4. Back\n>");
            int subChoice = scan.nextInt();
            if (subChoice == 1) {
                Utils.clearScreen();
                //Begin vectors and vector addition in 3D
                System.out.println("This topic covers the representation and addition of vectors in three dimensions.");
                System.out.println("Vectors can be represented in component form (i, j, k) or in magnitude and direction (r, theta, phi).");
                System.out.println("Vector Addition:\nIf A = A_x i + A_y j + A_z k and B = B_x i + B_y j + B_z k, then the resultant vector R = (A_x + B_x) i + (A_y + B_y) j + (A_z + B_z) k.");
                System.out.println("Magnitude of R: |R| = sqrt((A_x + B_x)² + (A_y + B_y)² + (A_z + B_z)²)");
                System.out.println("Direction of R: theta_R = tan^(-1)(sqrt((A_y + B_y)² + (A_z + B_z)²)/(A_x + B_x)), phi_R = cos^(-1)((A_z + B_z)/|R|)");
                System.out.println("Where : A_x, A_y, A_z are the components of vector A, and B_x, B_y, B_z are the components of vector B\nR is the resultant vector, theta_R is the angle of R with respect to the x-axis, and phi_R is the angle with respect to the z-axis.");
                System.out.println("Let's do an example. Please enter the components of vector A (A_x, A_y, A_z):");
                double A_x = scan.nextDouble();
                double A_y = scan.nextDouble();
                double A_z = scan.nextDouble();
                System.out.println("Please enter the components of vector B (B_x, B_y, B_z):");
                double B_x = scan.nextDouble();
                double B_y = scan.nextDouble();
                double B_z = scan.nextDouble();
                double R_x = A_x + B_x;
                double R_y = A_y + B_y;
                double R_z = A_z + B_z;
                double R_magnitude = Math.sqrt(Math.pow(R_x,2) + Math.pow(R_y,2) + Math.pow(R_z,2));
                double R_angle_theta = Math.toDegrees(Math.atan2(Math.sqrt(Math.pow(R_y,2)+ Math.pow(R_z,2)), R_x));
                double R_angle_phi = Math.toDegrees(Math.acos(R_z / R_magnitude)); 
                System.out.println("The resultant vector R has components: (" + R_x + ", " + R_y + ", " + R_z + ")");
                System.out.println("The magnitude of R is: " + R_magnitude);
                System.out.println("The direction of R is: theta = " + R_angle_theta + " degrees from the x-axis, phi = " + R_angle_phi + " degrees from the z-axis.");
                System.out.println("Please enter any key to return to the Motion in Three-Dimensions menu.");
                scan.next();
                System.out.println("Returning to Motion in Three Dimensions menu.");
                Utils.clearScreen();
                ThreeDMotion(scan);
                //End vectors and vector addition in 3D
            } else if (subChoice == 2) {
                Utils.clearScreen();
                //Begin projectile motion in 3D
                System.out.println("This topic covers projectile motion in three dimensions, which involves motion in both horizontal and vertical planes.");
                System.out.println("Key Equations:\nHorizontal Motion: x = v_initial * cos(theta) * cos(phi) * t\ny = v_initial * cos(theta) * sin(phi) * t\nVertical Motion: z = v_initial * sin(theta) * t - 0.5 * g * t²\nWhere g is the acceleration due to gravity (approximately 9.81 m/s²).");
                System.out.println("Time of Flight: T = (2 * v_initial * sin(theta)) / g\nMaximum Height: H = (v_initial² * sin²(theta)) / (2 * g)\nRange in x-direction: R_x = (v_initial² * sin(2theta) * cos(phi)) / g\nRange in y-direction: R_y = (v_initial² * sin(2theta) * sin(phi)) / g");
                System.out.println("Where:\nv_initial = initial velocity\ntheta = launch angle from horizontal\nphi = azimuthal angle in horizontal plane\nt = time\nx, y = horizontal positions\nz = vertical position");
                System.out.println("Let's do an example. Please enter the initial velocity (v_initial) in m/s, the launch angle (theta) in degrees, and the azimuthal angle (phi) in degrees:");
                double v_initial = scan.nextDouble();
                double theta = Math.toRadians(scan.nextDouble());
                double phi = Math.toRadians(scan.nextDouble());
                double g = 9.81; // acceleration due to gravity in m/s²
                double time_of_flight = (2 * v_initial * Math.sin(theta)) / g;
                double max_height = (Math.pow(v_initial, 2) * Math.pow(Math.sin(theta),2)) / (2 * g);
                double range_x = (Math.pow(v_initial, 2) * Math.sin(2 * theta) * Math.cos(phi)) / g;
                double range_y = (Math.pow(v_initial, 2) * Math.sin(2 * theta) * Math.sin(phi)) / g;
                System.out.println("The time of flight (T) is: " + time_of_flight + " seconds");
                System.out.println("The maximum height (H) is: " + max_height + " meters");
                System.out.println("The range in x-direction (R_x) is: " + range_x + " meters");
                System.out.println("The range in y-direction (R_y) is: " + range_y + " meters");
                System.out.println("Please enter any key to return to the Motion in Three-Dimensions menu.");
                scan.next();
                System.out.println("Returning to Motion in Three Dimensions menu.");
                Utils.clearScreen();
                ThreeDMotion(scan);
                //End projectile motion in 3D
            } else if (subChoice == 3) {
                Utils.clearScreen();
                //Begin uniform circular motion in 3D
                System.out.println("This topic covers uniform circular motion in three dimensions, which involves motion along a circular path in a 3D space.");
                System.out.println("Key Concepts:\nCentripetal Acceleration: a_c = v² / r\nCentripetal Force: F_c = m * a_c = m * v² / r\nWhere v is the tangential speed, r is the radius of the circular path, and m is the mass of the object.");
                System.out.println("For example, consider an object moving in a horizontal circle with a radius of 1.54 meters at a constant speed of 5 m/s. The centripetal acceleration is directed towards the center of the circle.");
                System.out.println("We can calculate the centripetal acceleration (a_c) as follows:");
                System.out.println("a_c = v² / r");
                double ex_v = 5;
                double ex_r = 1.54;
                double ex_a_c = (ex_v * ex_v) / ex_r;
                System.out.println("Centripetal acceleration: " + ex_a_c + " m/s²");
                System.out.println("Let's do another example. Please enter the tangential speed (v) in m/s and the radius (r) in meters of the circular path:");
                double v = scan.nextDouble();
                double r = scan.nextDouble();
                double a_c = (v * v) / r;
                System.out.println("The centripetal acceleration (a_c) is: " + a_c + " m/s²");
                System.out.println("Please enter any key to return to the Motion in Three-Dimensions menu.");
                scan.next();
                System.out.println("Returning to Motion in Three Dimensions menu.");
                Utils.clearScreen();
                ThreeDMotion(scan);
            }
    }
}