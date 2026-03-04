public class Arrays {

    public int[] nums;
    public Star[] stars;

    public static void main(String[] args) {
        System.out.println("Welcome to the Awesome world of Arrays!!!");
        new Arrays();
    }

    public Arrays(){

    nums = new int[10];
    stars = new Star[7];
    nums[0]= 35;
    stars[0] = new Star();
    Star s1 = new Star();
    s1.printInfo();
    stars[0].printInfo();

    //todo: change s1's color and points to be different
        //call printInfo again
        s1.color = "Red";
        s1.points = 7;
        s1.printInfo();

        stars[0].color = "Blue";
        stars[0].points = 11;
        stars[0].printInfo();


        //todo; fill all buckets in stars with stars


        for(int v = 0; v < stars.length; v++){
                stars[v] = new Star();
        //todo: give points a random num between 0 and 10 inclusive
            stars[v].points = (int)(Math.random()*11);
        }
        System.out.println("Buke 3; " + stars[3].color);




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
    displayStars();
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
    //todo mae a displayStars method that uses the printInfo from Star to print all the stars

    public void displayStars(){
        for(int v = 0; v < stars.length; v++){
            stars[v].printInfo();
        }

    }

    }
