/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zvibock
 */
public class Palindrome {
    public static boolean isPallindrome(String aWord){
     String theWord ="";
    for(int i = 0; i < aWord.length();i++){
  if(aWord.charAt(i) != ' '){
        theWord += aWord.charAt(i);
    }
    }
  for( int i = 0; i < theWord.length() ;i++){
    if(theWord.charAt(i) != theWord.charAt(theWord.length() -i -1 )){
        return false;
  
        
        
        
        }
  }return true;
}
  
    
    
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       if(args.length == 0){
           System.err.println("expecting string argument");
           System.exit(1);
           }
       for(int i = 0; i < args.length;i++){
     String theWord = args[i];
     if(isPallindrome(theWord.toLowerCase())){
      System.out.println(theWord + "is palindrome");
     }else{
         System.out.println(theWord + "is not palindrome");
         
     }
        
    }
}
}