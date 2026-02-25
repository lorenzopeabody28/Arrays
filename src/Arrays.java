public class Arrays {

    public int[] nums;

    public static void main(String[] args) {
        System.out.println("Welcome to the Awesome world of Arrays!!!");
        new Arrays();
    }

    public Arrays(){
    nums = new int[10];
    //todo; fill the array with random numbs (1-100)
        for(int y = 0; y < nums.length; y++){
            nums[y] = (int)(Math.random()*100)+1;
        }
    displayArray();
        sumArray();

    }

    public void displayArray(){
        //todo; make a displayArray method that prints everything in the array nums
        for (int x = 0; x < nums.length; x++){
            System.out.println(x + ": " + nums[x]);
        }
    }
    //todo; make a method called sumArray that adds all the numbers in nums together
    public void sumArray() {
        int sum = 0;
        for (int q = 0; q < nums.length; q++) {
            sum += nums[q];
        }
        System.out.println(sum);
    }
}
