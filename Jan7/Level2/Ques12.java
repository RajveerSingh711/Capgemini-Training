package Jan7.Level2;

/*Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
Hint =>
Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature
public int[] generate4DigitRandomArray(int size)
Write a method to find average, min and max value of an array
public double[] findAverageMinMax(int[] numbers)
*/

public class Ques12 {
    public static int[] generate4DigitRandomArray(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=(int)(Math.random()*9000)+1000;
        }
        return arr;
    }
    public static double[] findAverageMinMax(int[] arr){
        int min=arr[0];
        int max=arr[0];
        int sum=0;
        for(int num:arr){
            sum+=num;
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        double avg=(double)sum/arr.length;
        return new double[]{avg,min,max};
    }
    public static void main(String[] args){
        int arr[]=generate4DigitRandomArray(5);
        for(int num:arr) System.out.println(num+" ");
        double[] result=findAverageMinMax(arr);
        System.out.println("Average: "+result[0]);
        System.out.println("Minimum: "+result[1]);
        System.out.println("Maximum: "+result[2]);
    }
}
