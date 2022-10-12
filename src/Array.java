import java.util.Scanner;

public class Array {
    public static void main(String[] args){
//        int[] newArr=new int[5];
//        newArr[0]=1;
//        newArr[1]=2;
//        //declare, Allocate, initial;
//        int[] otherArr={1,2,3,4,5};
//        //Dynamic
//        int arr[] = new int[]{};
//        // for loop
//        for(int i=0; i< otherArr.length;i++){
//            System.out.print(" "+ otherArr[i]);
//        }
//        //for-each
//        for(int ar:newArr){
//            System.out.print(" "+ar);
//        }


        // find days of months
//        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
//        Scanner input = new Scanner(System.in);
//        System.out.print("pls input number of month:");
//        int month=input.nextInt();
//        System.out.print(days[month-1]+"\uD83D\uDE12");

        // find sum and Average of array
        Scanner input = new Scanner(System.in);
        System.out.print("pls input length of data:");
        int sum=0;float avg=0;
        int size=input.nextInt();
        int arr[]=new int[size];
        for (int i=0; i<arr.length;i++){
            System.out.print("array["+i+"]:");
            arr[i]=input.nextInt();
        }
        for (int a:arr){
            sum=sum+a;
        }
         avg=(float)sum/arr.length;

        // find max
        int max=arr[0];
        for(int a=1; a< arr.length; a++){
            if (max<arr[a]){
                max=arr[a];
            }
        }

        // search number from input
        System.out.print("Pls input number you wanna check:");
        int check=input.nextInt();
//        for(int i:arr){
//            if(check==i) System.out.print("your number is in array");
//        }
        for(int i=0;i<arr.length;i++){
            if(check==arr[i]) System.out.println("your number is in array: "+i);
        }
        int sumOdd=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0) sumOdd=sumOdd+arr[i];
        }
        System.out.println("Sum odd "+ sumOdd);
        System.out.println("max: "+max);
        System.out.println("Total: "+sum);
        System.out.print("Average: "+avg);

    }
}
