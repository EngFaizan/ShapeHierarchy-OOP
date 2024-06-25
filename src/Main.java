import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean control = true;
        
        System.out.println("*********Welcome to the Java OO Shapes Program **********");
        
        while(control){
            System.out.println("Select from the menu below:");
            System.out.println("1. Construct a Circle");
            System.out.println("2. Construct a Rectangle");
            System.out.println("3. Construct a Square");
            System.out.println("4. Construct a Triangle");
            System.out.println("5. Construct a Sphere");
            System.out.println("6. Construct a Cube");
            System.out.println("7. Construct a Cone");
            System.out.println("8. Construct a Cylinder");
            System.out.println("9. Construct a Torus");
            System.out.println("10. Exit the program");
            
            int choice = sc.nextInt();
            
            switch (choice){
                case 1:
                    circle(sc);
                    break;
                case 2:
                    rectangle(sc);
                    break;
                case 3:
                    square(sc);
                    break;
                case 4:
                    triangle(sc);
                    break;
                case 5:
                    sphere(sc);
                    break;
                case 6:
                    cube(sc);
                    break;
                case 7:
                    cone(sc);
                    break;
                case 8:
                    cylinder(sc);
                    break;
                case 9:
                    torus(sc);
                    break;
                case 10:
                    control = false;
                    break;
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
            
            if(choice != 10){
                System.out.println("Would you like to continue? (Y or N)");
                char continueChoice = sc.next().toUpperCase().charAt(0);
                if (continueChoice == 'N') {
                    control = false;
                }
            }
        }
        
        System.out.println("Thanks for using the program. Today is + " + getCurrentDateTime());
    }
    
    //Scanner was being used in every method so I simply passed it as a parameter.
    
    private static void circle(Scanner sc){
        System.out.println("You have selected Circle.");
        System.out.println("What is the Radius?");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("The Area of the Circle is " + circle.getArea());
    }
    
    private static void rectangle(Scanner sc){
        System.out.println("You have selected Rectangle.");
        System.out.println("What is the Length?");
        double length = sc.nextDouble();
        System.out.println("What is the Width?");
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length,width);
        System.out.println("The Area of the Rectangle is " + rectangle.getArea());
    }
    
    private static void square(Scanner sc){
        System.out.println("You have selected Square.");
        System.out.println("What is the Side Length?");
        double side = sc.nextDouble();
        Square square = new Square(side);
        System.out.println("The Area of the Square is " + square.getArea());
    }
    
    private static void triangle(Scanner sc){
        System.out.println("You have selected Triangle.");
        System.out.println("What is the Base?");
        double base = sc.nextDouble();
        System.out.println("What is the Height?");
        double height = sc.nextDouble();
        Triangle triangle = new Triangle(base, height);
        System.out.println("The Area of the Circle is " + triangle.getArea());
    }
    
    private static void sphere(Scanner sc){
        System.out.println("You have selected Sphere.");
        System.out.println("What is the Radius?");
        double radius = sc.nextDouble();
        Sphere sphere = new Sphere(radius);
        System.out.println("The Area of the Circle is " + sphere.getVolume());
    }
    
    private static void cube(Scanner sc){
        System.out.println("You have selected Cube.");
        System.out.println("What is the length of Side?");
        double side = sc.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("The Area of the Circle is " + cube.getVolume());
    }
    
    private static void cone(Scanner sc){
        System.out.println("You have selected Cone.");
        System.out.println("What is the Radius?");
        double radius = sc.nextDouble();
        System.out.println("What is the Height?");
        double height = sc.nextDouble();
        Cone cone = new Cone(radius, height);
        System.out.println("The Area of the Circle is " + cone.getVolume());
    }
    
    private static void cylinder(Scanner sc){
        System.out.println("You have selected Cylinder.");
        System.out.println("What is the Radius?");
        double radius = sc.nextDouble();
        System.out.println("What is the Height?");
        double height = sc.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("The Area of the Circle is " + cylinder.getVolume());
    }
    
    private static void torus(Scanner sc){
        System.out.println("You have selected Torus.");
        System.out.println("What is the major Radius?");
        double majorRadius = sc.nextDouble();
        System.out.println("What is the minor Radius?");
        double minorRadius = sc.nextDouble();
        Torus torus = new Torus(majorRadius, minorRadius);
        System.out.println("The Area of the Circle is " + torus.getVolume());
    }
    
    private static String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd 'at' hh:mm a");
        return now.format(formatter);
    }
}
