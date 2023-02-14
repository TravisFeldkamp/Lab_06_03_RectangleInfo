import java.util.Scanner;//import scanner into program


public class rectangleInfo {
    public static void main(String [] args) {
            Scanner in = new Scanner(System.in);//initializes the scanner
            double lengthR = 0 ;//variable for user input of length
            double widthR = 0 ;// variable for user input of width
            String trash = "";// variable for invalid user input
            double diagonalR = 0;// variable for storing diagonal info before square root
            double perimeterR = 0;// variable for storing perimeter
            double areaR = 0;//variable for area
            double diagonalFinal = 0;//variable for diagonal


        System.out.println("What is the length of the rectangle?");//output to user for length

            if(in.hasNextDouble()) {//if valid input is given run this code
                lengthR = in.nextDouble();// storing user input as length
            }
            else{// if invalid input is given run this block
                trash = in.nextLine();//invalid user input stored as trash
                System.out.println("That was an invalid response: " + trash);//output to user telling them invalid input
                System.out.println("run the program again");
                System.exit(0);//quitting the program
            }
        System.out.println("What is the width of the rectangle?");//output asking user for width
            if (in.hasNextDouble()){//run code block if given valid entry
                widthR = in.nextDouble();//store user input as widthR variable
            }
            else {//run this block if invalid response given
                trash = in.nextLine();//store invalid input
                System.out.println("That was an invalid response: " +trash);//output to user telling them invalid input
                System.out.println("run the program again");
                System.exit(0);//quit the program
            }
            perimeterR = lengthR + lengthR + widthR + widthR;//adding all 4 sides of rectangle to get perimeter
            areaR = lengthR * widthR;// multiplying L * W to get area
            diagonalR = lengthR * lengthR + widthR * widthR;// finding squares of both length and width then adding together
            diagonalFinal = Math.sqrt(diagonalR);//finding square root of the answer to get diagonal


        System.out.println("The perimeter of the rectangle is: " + perimeterR );//output to user of perimeter
        System.out.println("The area of the rectangle is: " + areaR );//output to user of are
        System.out.println("The diagonal of the rectangle is: " + diagonalFinal);//output to user of diagonal















    }
}