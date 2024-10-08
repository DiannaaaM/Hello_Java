public class Masive {
    public static void main(String[] args) {
//        Задача 1
        int [] nums = {1, 2, 3};
        double [] doubler = {1.57, 7.654, 9.986};
        short [] shorter = {30, 50, 14, 7, 15};
//        Задача 2
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[1] + ", ");
        }
        System.out.println();
        for (int i = 0; i < doubler.length; i++) {
            System.out.print(doubler[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < shorter.length; i++) {
            System.out.print(shorter[i] + ", ");
        }
        System.out.println();
//        Задача 3
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
        for (int i = doubler.length - 1; i >= 0; i--) {
            System.out.print(doubler[i] + ", ");
        }
        System.out.println();
        for (int i = shorter.length - 1; i >= 0; i--) {
            System.out.print(shorter[i] + ", ");
        }

//        Задача 4
        for (int i = 0; i<nums.length; i++){
            if (nums[i] % 2 == 1) {
                nums[i] += 1;
            }
        }
        System.out.print(nums[0] + ", " + nums[1] + ", " + nums[2]);
    }
}
