class Tester{
    public static boolean checkPalindrome(String str){
	    //Implement your code here and change the return value accordingly
	   String reversed = new StringBuilder(str).reverse().toString();
    return str.equals(reversed);
	}
	
	public static void main(String args[]){
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}
