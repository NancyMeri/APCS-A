
//Nancy
import java.util.*;
public class ArraysStarter
{
    public static void main (String [] args){
        //question 1
        Scanner s = new Scanner (System.in);
        System.out.println("Please enter the number of rows");
        int q = s.nextInt();
        System.out.println("Please enter the number of columns");
        int w = s.nextInt();
        int [] [] mxn = new int [q] [w];
        for (int i = 0; i < mxn.length; i++){
            for(int j = 0; j < mxn[i].length; j++){
                mxn [i] [j] = (int) (Math.random() * 100) + 1;
            }
        }
        //question 2
        for (int [] r : mxn){
            System.out.println();
                for (int c : r){
                    System.out.print(c + " ");
                }
        }
        //question 3
        boolean fiftySeven = false;
        int indexCol = -1;
        int indexRow = -1;
        int u = 0;
        int v = 0;
        while (!fiftySeven && u < mxn.length){
            while (!fiftySeven && v < mxn[u].length){
                if (mxn [u] [v] == 57){
                    indexRow = u;
                    indexCol = v;
                    fiftySeven = true;
                    v++;
                }
                else { v++;}
            }
            if (mxn [u] [v-1] == 57){
                    indexRow = u;
                    indexCol = v-1;
                    fiftySeven = true;
                    u++;
                }
                else { u++;}
        }
        if (fiftySeven){
            System.out.println("There is a 57 at position " + indexRow
            + ", " + indexCol);
        }
        else{System.out.println("There is no 57 in this array");}
        //question 4
        int sum = 0;
        int num = 0;
        for (int [] p : mxn){
            for (int o : p){
                num ++;
                sum += o;
            }
        }
        System.out.println("The sum of all elements is " + sum);
        System.out.println("The average of all elements is " + 
        (double) (sum) / num);
        int min = mxn [0] [0];
        for (int [] e : mxn){
            for (int f : e){
                if (min > f){ min = f;}
            }
        }
        System.out.println("The minimum is " + min);
        int twentyFivePlus = 0;
        for (int [] g : mxn){
            for (int h : g){
                if (25 < h){ twentyFivePlus++;}
            }
        }
        System.out.println("There are " + twentyFivePlus + " numbers " +
        "greater than 25.");
        //question 5
        int [] [] bR ={{150, 250, 150, 100, 150}, 
        {300, 400, 300, 200, 250}, {250, 400, 250, 200, 200}};
        int janSum = 0;
        for (int [] c : bR){
            janSum += c [0];
        }
        System.out.println("There were " + janSum + " in January 2001");
        int aprSum = 0;
        for (int [] d : bR){
            aprSum += d [1];
        }
        System.out.println("There were " + aprSum + " in April");
        int julSum = 0;
        for (int [] b : bR){
            julSum += b [2];
        }
        System.out.println("There were " + julSum + " in July");
        int octSum = 0;
        for (int [] l : bR){
            octSum += l [1];
        }
        System.out.println("There were " + octSum + " in October");
        int jan2Sum = 0;
        for (int [] m : bR){
            jan2Sum += m [0];
        }
        System.out.println("There were " + jan2Sum + " in January 2002");
        int manSum = 0;
        for (int c : bR [0]){
            manSum += c;
        }
        System.out.println("There were " + manSum + " in Manhattan");
        int broSum = 0;
        for (int c : bR [1]){
            broSum += c;
        }
        System.out.println("There were " + broSum + " in Brooklyn");
        int newSum = 0;
        for (int c : bR [2]){
            newSum += c;
        }
        System.out.println("There were " + newSum + " in Newark");
        int biggest = 0;
        int monthBiggest = 0;
        for (int j = 0; j < 5; j++){
            if (bR [1] [j] - bR [2] [j] > biggest) {
                biggest = bR [1] [j] - bR [2] [j];
                monthBiggest = j;
            }
        }
        System.out.println("The difference was biggest in month " + monthBiggest);
        int big = 0;
        int placeBig = 0;
        for (int k = 0; k < 3; k++){
            if (bR [k] [1] - bR [k] [0] > big) {
                big = bR [k] [1] - bR [k] [0];
                placeBig = k;
            }
        }
        System.out.println("The difference was biggest in region " + placeBig);
        //question 6
        int [] [] square = {{4, 7, 2}, {3, 8, 9}, {1, 6, 5}};
        int stop = 2;
        while (stop != 0){
            System.out.println("This is the current array: ");
            for (int a [] : square){
                for (int b : a){
                    System.out.print(b + " ");
                }
                System.out.println();
            }
            System.out.println("Enter the row index of what you want to change.");
            int rchange = s.nextInt();
            System.out.println("Enter the column index of what you want to change.");
            int cchange = s.nextInt();
            System.out.println("Enter the number you would like to change it to.");
            int numchange = s.nextInt();
            square [rchange] [cchange] = numchange;
            System.out.println("If you are finished editing the array, " +
            "press 0. Otherwise, press any other number.");
            stop = s.nextInt();
        }
        boolean vertical = false;
        boolean horizontal = false;
        boolean diagonal = false;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int a [] : square){
            sum1 += a[0];
            sum2 += a[1];
            sum3 += a[2];
        }
        if (sum1 == sum2 && sum1 == sum3){ vertical = true;}
        for (int a : square [0]){
            sum1 += a;
        }
        for (int a : square [1]){
            sum2 += a;
        }
        for (int a : square [2]){
            sum3 += a;
        }
        if (sum1 == sum2 && sum1 == sum3){ horizontal = true;}
        for (int i = 0; i < 3; i++){
            for (int k = 0; k < 3; k++){
                if (k == i){sum1 += square [i] [k];}
                if (k + i == 2){sum2 += square [i] [k];}
            }
        }
        if (sum1 == sum2){ diagonal = true;}
        if (vertical && horizontal && diagonal){
            System.out.println("Success! Your square works.");
        }
        else{System.out.println("Fail");}
    }
}
