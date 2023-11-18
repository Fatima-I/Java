package Outputs;

public class Out2 {
    public static void main(String[] args) {
        int[][]nums=new int[3][];
        nums[0]=new int[1];
        nums[1]= new int []{1,2};
        nums[2]=new int[]{4,3,9};
        for(int r=1;r< nums.length;r++){
            for(int c=0;c<nums[1].length;c++){
                nums[0][0]+=nums[r][c];
                System.out.println(nums[r][c]);

            }
        }
        System.out.println("result="+nums[0][0]);
    }
}
