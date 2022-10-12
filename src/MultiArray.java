public class MultiArray {
    public static void main(String[] args){
        int arr[][]={{1,2,3},{2,3,4,},{3,5}};
        // for loop
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(" "+arr[i][j]);
            }
        }
        // for-each
        for(int[] iArray:arr){
            for(int jArray:iArray){
                System.out.print(" "+jArray);
            }
        }
    }
}
