//Nancy
import java.util.*;
public class MatricesLab
{
    //question 1
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("How many rows in your first matrix?");
        int r1 = s.nextInt();
        System.out.println("How many columns in your first matrix?");
        int c1 = s.nextInt();
        System.out.println("How many rows in your second matrix?");
        int r2 = s.nextInt();
        System.out.println("How many columns in your second matrix?");
        int c2 = s.nextInt();
        double [] [] m1 = new double [r1] [c1];
        double [] [] m2 = new double [r2] [c2];
        System.out.println();
        System.out.println("Now fill your first matrix");
        for (int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1 [i].length; j++){
                System.out.println("Input a double.");
                m1 [i] [j] = s.nextDouble();
                System.out.println();
            }
        }
        System.out.println("Great! Now fill your second matrix");
        for (int i = 0; i < m2.length; i++){
            for (int j = 0; j < m2 [i].length; j++){
                System.out.println("Input a double.");
                m2 [i] [j] = s.nextDouble();
                System.out.println();
            }
        }
        boolean running = true;
        while (running){
            System.out.println();
            System.out.println("Your options are: ");
            System.out.println("(1) Scalar Multiplication");
            System.out.println("(2) Adding the Matrices");
            System.out.println("(3) Subtracting the Matrices");
            System.out.println("(4) Multiplying the Matrices");
            System.out.println("(5) Finding the Inverse");
            System.out.println("(6) Quitting the Program");
            int option = s.nextInt();
            boolean answer = true;
            double [] [] ans = m1;
            if (option == 6){
                running = false;
                answer = false;
            }
            else if (option == 1){
                System.out.println("Which matrix? (1 or 2)");
                int m = s.nextInt();
                System.out.println("Pick a scalar.");
                double scalar = s.nextDouble();
                if (m == 1){ ans = scalarMult(scalar, m1);}
                else{ ans = scalarMult(scalar, m2);}
            }
            else if (option == 2){
                if (r1 != r2 || c1 != c2){
                    System.out.println("These matrices can't be added");
                    answer = false;
                }
                else{
                    ans = addEm(m1, m2);
                }
            }
            else if (option == 3){
                if (r1 != r2 || c1 != c2){
                    System.out.println("These matrices can't be subtracted");
                    answer = false;
                }
                else{
                    System.out.println("Which matrix should be subtract" +
                    "ed? (1 or 2)");
                    if (s.nextInt() == 2){ans = subEm(m1, m2);}
                    else{ans = subEm(m2, m1);}
                }
            }
            else if (option == 4){
                if (c1 != r2){
                    System.out.println("These matrices can't be multiplied");
                    answer = false;
                }
                else{
                    System.out.println("Which matrix should be first" +
                    "? (1 or 2)");
                    if (s.nextInt() == 1){ans = multEm(m1, m2);}
                    else{ans = multEm(m2, m1);}
                }
            }
            else{
                System.out.println("Which matrix? (1 or 2)");
                int p = s.nextInt();
                double [] [] matrix;
                if (p == 1){ matrix = m1;}
                else{ matrix = m2;}
                if (matrix.length != 2 || matrix [0].length != 2){
                    System.out.println("Sorry, I can only do 2x2 matrices");
                    answer = false;
                }
                else{ans = invert(matrix);}
            }
            if (answer){
                for (double [] x: ans){
                    System.out.println();
                    for (double y: x){
                        System.out.print(y + " ");
                    }
                }
            }
        }
    }
    // question 2
    public static double [] [] 
    scalarMult (double k, double [] [] m1){
        int r = m1.length;
        int c = m1 [0].length;
        double [] [] ans = new double [r] [c];
        for (int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1 [i].length; j++){
                ans [i] [j] = k * m1 [i] [j];
            }
        }
        return ans;
    }
    //question 3
    public static double [] [] addEm (double [] [] m1, double [] [] m2){
        int r = m1.length;
        int c = m1 [0].length;
        double [] [] ans = new double [r] [c];
        for (int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1 [i].length; j++){
                ans [i] [j] = m1 [i] [j] + m2 [i] [j];
            }
        }
        return ans;
    }
    //question 4
    public static double [] [] subEm (double [] [] m1, double [] [] m2){
        int r = m1.length;
        int c = m1 [0].length;
        double [] [] ans = new double [r] [c];
        for (int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1 [i].length; j++){
                ans [i] [j] = m1 [i] [j] - m2 [i] [j];
            }
        }
        return ans;
    }
    //question 5
    public static double [] [] multEm (double [] [] m1, double [] [] m2){
        int r = m1.length;
        int c = m2 [0].length;
        double [] [] ans = new double [r] [c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                double sumRow = 0;
                for (int k = 0; k < m1 [0].length; k++){
                    sumRow = m1 [i] [k] * m2 [k] [j];
                }
                ans [i] [j] = sumRow;
            }
        }
        return ans;
    }
    //question 6
    public static double [] [] invert (double [] [] m1){
        int r = m1.length;
        int c = m1 [0].length;
        double [] [] ans = new double [r] [c];
        double det = (m1 [0] [0] * m1 [1] [1]) - (m1 [0] [1] * m1 [1] [0]);
        ans [1] [1] = m1 [0] [0] / det;
        ans [0] [0] = m1 [1] [1] / det;
        ans [1] [0] = -1 * m1 [1] [0] / det;
        ans [0] [1] = -1 * m1 [0] [1] / det;
        return ans;
    }
}
