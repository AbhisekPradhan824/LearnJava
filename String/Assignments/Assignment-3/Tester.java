class Tester {
    public static String reverseEachWord(String str) {
        // Split the sentence into an array of words based on spaces
        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";

            // Reverse the current word
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }

            // Add the reversed word to our result string
            result += reversedWord;

            // Add a space only if it's not the last word
            if (i < words.length - 1) {
                result += " ";
            }
        }
        
        return result;
    }

    public static void main(String args[]) {
        String str = "all cows eat grass";
        System.out.println(reverseEachWord(str)); // Output: lla swoc tae ssarg
    }
}
