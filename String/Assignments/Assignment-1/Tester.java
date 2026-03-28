class Tester{
    
    public static String moveSpecialCharacters(String str){
		//Implement your code here and change the return value accordingly
		String str1="";
		String str2="";
		
		for(int i=0; i<str.length(); i++){
		    char ch=str.charAt(i);
		    
		    if(Character.isLetterOrDigit(ch)){
		        str1=str1+ch;
		    }else{
		        str2 = str2+ch;
		    }
		}
        return str1+str2;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
	
}
