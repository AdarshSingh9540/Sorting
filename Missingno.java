public class Missingno {
    public static void main(String[] args) {
        int[] arr = {4, 0, 3, 1};
        System.out.println(missingnumber(arr));
    }
    static int missingnumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swapped(arr,i,correct);
            }else {
                i++;
            }
            }

            for(int index=0;index<arr.length;index++){
                if(arr[index]!=index){
                    return index;
                }

            }
            return arr.length;
        }

    static void swapped(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
