public class EnhancedForLoops {

    public static String printStandardFor(String[] arr){
        String output = "";
        for(int i = 0; i < arr.length; i++ ) output += (arr[i]) + " ";
        return output;
    }

    public static String printStandardFor(int[] arr){
        String output = "";
        for(int i = 0; i < arr.length; i++ ) output += (arr[i]) + " ";
        return output;
    }

    public static String printStandardFor(double[] arr) {
        String output = "";
        for(int i = 0; i < arr.length; i++ ) output += (arr[i]) + " ";
        return output;
    }

    public static String printEnhancedFor(String[] arr){
        String output = "";
        for (String s : arr) output += s + " ";
        return output;
    }

    public static String printEnhancedFor(int[] arr){
        String output = "";
        for (int s : arr) output += s + " ";
        return output;
    }

    public static String printEnhancedFor(double[] arr){
        String output = "";
        for (double s : arr) output += s + " ";
        return output;
    }

    public static String printStandardWhile(String[] arr) {
        String output = "";
        int i = 0;
        while(i < arr.length){
            output += arr[i] + " ";
            i++;
        }
        return output;
    }

    public static String printStandardWhile(int[] arr) {
        String output = "";
        int i = 0;
        while(i < arr.length){
            output += arr[i] + " ";
            i++;
        }
        return output;
    }

    public static String printStandardWhile(double[] arr) {
        String output = "";
        int i = 0;
        while(i < arr.length){
            output += arr[i] + " ";
            i++;
        }
        return output;
    }
}
