/*
 * subject class that represents subjects at a uni for enrollment
 */
package assignment3;

import java.util.ArrayList;


public class SubjectsForEnroll {
  private String subName;
  private String subCode;
  
  SubjectsForEnroll(String subCode,String subName){
      this.subCode = subCode;
      this.subName = subName;
  }
  
  // getters 
  String getSubName(){
      return subName;
  }
  String getSubCode(){
      return subCode;
  }  
  
 // check the subCode is valid "ITC321"
  boolean isValid(String subCode){
      if(subCode.length() != 6){
          return false;
      }else{
          for(int i = 0, j = 3 + i; i < 3; i++){ 
              
              if((subCode.charAt(j) < '0' || subCode.charAt(j) > '9') ||(subCode.charAt(i) < 'A' || subCode.charAt(i) > 'Z')){
                  return false;
              }    
          } 
           
      }
     
      return true;
      
  }
  
 // check the existence of subCode
  boolean isExisted(ArrayList<SubjectsForEnroll> arr,String subCode){
     for(int i = 0; i < arr.size(); i++){ 
         String codeExists = arr.get(i).getSubCode();
        if(codeExists.equals(subCode)){
           return true; 
        } 
     } 
     return false;
  }  
  
  
}
