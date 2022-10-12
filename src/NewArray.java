import java.util.Scanner;

public class NewArray {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int arr[] = new int[5];
        int revers[]=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("array["+i+"]:");
            arr[i]=input.nextInt();
        }
        int j=0;
        for (int i=revers.length-1;i>=0;i--){
            revers[i]=arr[j];
            j++;
        }
        for (int i=0; i<revers.length;i++){
            System.out.println("array["+i+"]:"+revers[i]);
        }

    }
}
