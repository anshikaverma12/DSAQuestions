public class Maxvalue{
    public static void main(String args[]){
        int [] arr={5,6,8,9,10};
        System.out.println("The greatest number in arr is:"+findMax(arr,0,4));

    }
    static int findMax(int[]arr,int start,int end){
        int greatest=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>greatest){
                greatest=arr[i];
            }
        }
        return greatest;
    }
}
