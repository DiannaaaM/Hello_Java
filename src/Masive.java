public class Masive {
    public static void main(String[] args) {
//        Задача 1
        int [] nums = {1, 2, 3};
        double [] doubler = {1.57, 7.654, 9.986};
        short [] shorter = {30, 50, 14, 7, 15};
//        Задача 2
        System.out.print(nums[0] + ", " + nums[1] + ", " + nums[2]);
        System.out.println();
        System.out.print(doubler[0] + ", " + doubler[1] + ", " + doubler[2]);
        System.out.println();
        System.out.print(shorter[0] + ", " + shorter[1] + ", " + shorter[2] + ", " + shorter[3] + ", " + shorter[4]);
        System.out.println();
        System.out.println();
//        Задача 3
        System.out.print(nums[2] + ", " + nums[1] + ", " + nums[0]);
        System.out.println();
        System.out.print(doubler[2] + ", " + doubler[1] + ", " + doubler[0]);
        System.out.println();
        System.out.print(shorter[4] + ", " + shorter[3] + ", " + shorter[2] + ", " + shorter[1] + ", " + shorter[0]);
        System.out.println();
        System.out.println();
//        Задача 4
        for (int i = 0; i<nums.length; i++){
            if (nums[i] % 2 == 1) {
                nums[i] += 1;
            }
        }
        System.out.print(nums[0] + ", " + nums[1] + ", " + nums[2]);
    }
}
