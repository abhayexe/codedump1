public class majorityElement{
    public static void main(String argsp[]){
  
      int[] nums = {2,2,1,1,1,2,2,2};
      System.out.print(majorityElementos(nums));
    }
    public static int majorityElementos(int[] nums) {
          int count=0;
          int candidate = 0;
  
          for(int i = 0; i<nums.length; i++){
              if(count==0){
                  candidate=nums[i];
              }
              if(candidate == nums[i]){
                  count++;
              }
              else{
                  count--;
              }
          }return candidate;
      }
  
  
  }
