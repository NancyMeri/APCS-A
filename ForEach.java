//Nancy

public class ForEach
{
    public static void main (String [] args){
        String [] arr = {"dog", "cat", "horse", "cow", "pig"};
        for (int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (String n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
        for (int i = 4; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = (arr.length-1); i >= 0; i--){
            int k = (arr.length - 1) - i;
            String temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
        for (int i = 4; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        int [] nums = new int [10];
        for (int i = 0; i < 10; i++){
            nums[i] = (int) (Math.random() * 50) + 1;
        }
        System.out.println();
        for (int x : nums){
            System.out.print(x + " ");
        }
        System.out.println();
        int sum = 0;
        for (int y : nums){
            sum += y;
        }
        System.out.println ("Sum: " + sum);
        System.out.println ("Average: " + (double) sum / 10);
        int min = nums[0];
        for (int z : nums){
            if (z < min){ min = z;}
        }
        System.out.println ("Min: " + min);
        int count = 0;
        for (int a : nums){
            if (a > 25){ count++;}
        }
        System.out.println ("Over 25: " + count);
        boolean [] ft = new boolean [10];
        for (int i = 0; i < 10; i++){
            if (i % 2 != 0){ ft[i] = true;}
        }
        for (boolean b : ft){
            System.out.print(b + " ");
        }
    }
}
