public class ArrayCreation {

    public static double getAverage(double[] numbers) {
        int sampleLength = numbers.length;
        if(sampleLength >= 3) {
            double average = 0.0;
            double firstNum = numbers[0],
                    midNum = numbers[(sampleLength / 2)],
                    lastNum = numbers[(sampleLength - 1)];
            return (double)((int)((firstNum + midNum + lastNum)/3 + 0.5));
        }
        else return 0.0;
    }

    public static String stringArray(String[] friends) {
        int sampleLength = friends.length;
        if(sampleLength == 5){
            return friends[0].length() + " " + friends[1].length() + " "
                    + friends[2].length() + " " + friends[3].length() + " " + friends[4].length();
        }
        else return "";
    }

    public static String countryData() {
        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana",
                "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};

        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra", "Nairobi",
        "Mexico City", "London", "Ouagadougou", "Washington D.C."};

        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi",
        "Swahili", "Spanish", "English", "French", "English"};
        int options = countries.length;
        int index = (int)(Math.random() * options);
        return "The capital of " + countries[index] + " is " + capitals[index] + " and the primary language is " + languages[index];
    }
}
