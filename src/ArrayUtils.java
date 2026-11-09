class ArrayUtils {

    //returns the total of all numbers (0 for an empty array).
    static int sum(int[] numbers) {


        int sum = 0;
        for(int num : numbers){
            sum += num;
        }

        return sum;
    }



    // returns the largest number. Throw an IllegalArgumentException if the array is empty.
    static int max(int[] numbers) {

        if(numbers.length == 0){
            throw new IllegalArgumentException("Array must not be empty");
        }

        int max = numbers[0];

        for (int n : numbers) {

            if (n > max) {
                max = n;
            }
        }

        return max;
    }



    //returns the average as a double (0.0 for an empty array).
    static double average(int[] numbers) {
        if(numbers.length == 0)
            return 0.0;
        int sum = 0;

        for (int num : numbers){
            sum += num;
        }

        return (double) sum / numbers.length;
    }

    //counts the vowels a, e, i, o and u, ignoring case. Return 0 if text is null.
    static int countVowels(String text) {

        String lowercaseText = text.toLowerCase();

        if(text==null){
            return 0;
        }

        String vowels = "aeiou";

        int count = 0;

        for(int i = 0; i<lowercaseText.length(); i++){
            int ch = lowercaseText.charAt(i);

            if(vowels.indexOf(ch) != -1){
                count ++;
            }

        }

        return count;
    }

}