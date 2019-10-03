package examples;
/**
*
*@ author Chris McNeill
*
*/
class Challenge {
  /**
  *Method to count number of brace pairs in a given string
  *@param string of brace
  *@return Integer of pair numbers
  */
  public static Integer numberOfBracePairs( String braces ) {
    //variable declarations
    int bracePairs = 0;
    String braceInput = braces.trim();
    String check;
    int age = 0;
    System.out.println(age);
    //check string length to assess if its 0
    //if true set result to 0 & return
    //else continue
    
    if(braceInput.length() == 0){
      bracePairs = 0;
    }
    //check that string is odd
    //if true set result to -1 and return
    //else continue
    else if((braceInput.length() % 2) == 1){
      bracePairs = -1;
    }
    
    //loop through string to find (or[or{
    //if found then loop through remainder to find matching close
    //if match found add 1 to pair bracePairs
    //if false set bracePairs to -1 and return
    
    //start loop through whole string
    else{
      for(int index = 0; index < braceInput.length(); index++){
        check = braceInput.charAt(index) + "";
        System.out.println(bracePairs);
      while(bracePairs != -1) {
      //check if {
      if(check.equals("{")){
        //loop through remainder of string to find }
        for(int innerIndex = index; innerIndex < braceInput.length(); innerIndex++){
          if((braceInput.charAt(innerIndex) + "").equals("}")){
            System.out.println("Pair found");
            bracePairs += 1;
            System.out.println(bracePairs);
            break;
          }
          else{
            System.out.println("Pair not found");
            //bracePairs = -1;
            //break;
          }
        }
        bracePairs = -1;
      }
      
      //check if [
      if(check.equals("[")){
        //loop through remainder of string to find ]
        for(int innerIndex = index; innerIndex < braceInput.length(); innerIndex++){
          if((braceInput.charAt(innerIndex) + "").equals("]")){
            System.out.println("Pair found 2");
            System.out.println(bracePairs);
            bracePairs += 1;
             System.out.println(bracePairs);
            break;
          }
          else{
            System.out.println("Pair not found");
            //bracePairs = -1;
           // break;
          }
        }
        bracePairs = -1;
      }
      
      //check if (
      if(check.equals("(")){
        //loop through remainder of string to find )
        for(int innerIndex = index; innerIndex < braceInput.length(); innerIndex++){
          if((braceInput.charAt(innerIndex) + "").equals(")")){
            System.out.println("Pair found");
            bracePairs += 1;
            System.out.println(bracePairs);
            break;
          }
          else{
            System.out.println("Pair not found");
            //bracePairs = -1;
            //break;
          }
        }
        bracePairs = -1;
      }
      }//place here
    }
   }
    return bracePairs;
  }
}