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
        averageNum();
    maxNum();
    minNum();
    maxIndex();
    greaterThan50();
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
        System.out.println("Sum " + sum);
    }
    public void averageNum(){
        double sum = 0;
        double avg = 0.0;
        for (int q = 0; q < nums.length; q++) {
            sum += nums[q];
        }
        avg = sum / nums.length;
        System.out.println("Avg: " + avg);
    }
    public void maxNum() {
        int max = nums[0];
        for (int q = 0; q < nums.length; q++) {
            max = Math.max(max, nums[q]);
        }
        System.out.println("Max: " + max);
    }

    public void minNum(){
        int min = 100;
        for (int q = 0; q < nums.length; q++) {
            min = Math.min(min,nums[q]);
        }
        System.out.println("Min: " + min);
    }
    //todo: make a method called maxIndex that finds the index aka buquet label that has the max numer
    public void maxIndex() {
        int max = nums[0];
        int index = 0;
        for (int q = 0; q < nums.length; q++) {
            //max = Math.max(max, nums[q]);
            if (nums[q] > max) {
                max = nums[q];
                index = q;
            }

        }
        System.out.println("Max Index: " + index);

    }
    public void greaterThan50(){
        int count = 0;
        for(int q = 0; q < nums.length; q++){
            if(nums[q] >= 59){
                count++;
            }
        }
        System.out.println("Greater than or equal to 59: " + count);

    }
    }
