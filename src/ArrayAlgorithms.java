import java.util.Arrays;

public class ArrayAlgorithms {

    public static boolean checkForAllNegatives(int[] list) {
        for(int i = 0; i < list.length; i++){
            if(list[i] >= 0){
                return false;
            }
        }
        return true;
    }

    public static boolean hasDupes(int[] list) {
        int[] source = new int[list.length];
        for(int x = 0; x < list.length; x++){
            for(int y = 0; y < source.length; y++) if(list[x] == source[y]) return true;
            source[x] += list[x];
        }
        return false;
    }


    public static int[] leftShift(int[] nums, int shift) {
        int[] shifted = new int[nums.length + shift];
        for(int x = 0; x < nums.length; x++) shifted[x] = nums[x];
        for(int y = nums.length + 1; y < nums.length + shift; y++) shifted[y] = 0;
        //System.out.println(Arrays.toString(shifted));
        return shifted;
    }
}
