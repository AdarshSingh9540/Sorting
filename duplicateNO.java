class duplicateNO {
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        System.out.println(Duplicate(nums));
    }
    public static int Duplicate(int[] nums) {
        int i=0;
        while(i<nums.length){

            if(nums[i]!=i+1){
                int correct = nums[i]-1;
                if(nums[i] != nums[correct]){
                    swapped(nums,i,correct);
                }else{
                    return nums[i];
                }
            }
            else{
                i++;
            }


        }
        return -1;
        
    }
    static void swapped(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}