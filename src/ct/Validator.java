package ct;

import java.util.Scanner;

public class Validator {
	public static String getYorNo(Scanner sc, String prompt){
        String s = "";
        boolean isValid = false;
        
        while (isValid==false){
        	System.out.print(prompt);
        	s = sc.next(); 
        		if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("n")){
        			isValid=true;
        		}
        		else{
        			System.out.println("Invalid input.");
        		}
        }
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }

    public static int getInt(Scanner sc, String prompt){
        int i = 0;
        boolean isValid = false;
        while (isValid == false){
            System.out.print(prompt);
            if (sc.hasNextInt()){
                i = sc.nextInt();
                isValid = true;
            }
            else{
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt,
    int min, int max){
        int i = 0;
        boolean isValid = false;
        while (isValid == false){
            i = getInt(sc, prompt);
            if (i <= min){
                System.out.println("Error! Number must be greater than " + min + ".");
            }
            else if (i >= max){
                System.out.println("Error! Number must be less than " + max + ".");
            }
            else
                isValid = true;
        }
        return i;
    }

    public static double getDouble(Scanner sc, String prompt){
        double d = 0;
        boolean isValid = false;
        while (isValid == false){
            System.out.print(prompt);
            if (sc.hasNextDouble()){
                d = sc.nextDouble();
                isValid = true;
            }
            else{
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
    
    public static double getPositiveDouble(Scanner sc, String prompt){
        double d = 0;
        boolean isValid = false;
        while (isValid == false){
            System.out.print(prompt);
            if (sc.hasNextDouble()){
                d = sc.nextDouble();
                	if (d>0){
                		isValid = true;
                	}
                	else {
                		System.out.println("Error! Number must be greater than zero.");
                	}
            }
            else {
            	System.out.println("Invalid input!\n");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(Scanner sc, String prompt,
    double min, double max){
        double d = 0;
        boolean isValid = false;
        while (isValid == false){
            d = getDouble(sc, prompt);
            if (d <= min){
                System.out.println("Error! Number must be greater than " + min + ".");
            }
            else if (d >= max){
                System.out.println("Error! Number must be less than " + max + ".");
            }
            else{
                isValid = true;
            }
        }
        return d;
    }
}

