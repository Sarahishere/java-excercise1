
package assignment2;

import java.util.*;


public class Marks {
 private ArrayList<Integer> arr;  
 private final char[] grade = {'A','B','C','D','E','F'};
 private final int[] thresholds = {90,75,60,50,45};
 
 
 
 Marks(ArrayList<Integer> arr){
     this.arr = arr;
 }
 
 double getMax(){ 
     double max = arr.get(0);
     for(int i = 0; i < arr.size(); i++){
       if(max < arr.get(i)){
           max = arr.get(i);
       }  
     } 
     return max;
 }
 
 double getMin(){
     double min = arr.get(0);
     for(int i = 0; i < arr.size(); i++){
       if(min > arr.get(i)){
           min = arr.get(i);
       }  
     } 
     return min;
 }
  
 double getMean(){
     double sum = 0;
     for(int i = 0; i < arr.size(); i++){
         sum += arr.get(i);
     }
     return sum/arr.size();
 }
 
 double getRange(){
     return getMax() - getMin();
 } 
 
 // return the middle value or the  the average of the middle two value when there's even elements
 double getMedian(){ 
     Collections.sort(arr);// sort the arraylist in acending order
     if(arr.size() % 2 == 0){ // when there is even elements
         int index = arr.size()/2;
         return (arr.get(index) + arr.get(index + 1)) / 2;
         
     }else{ // when there's uneven elements
         int index = (int)arr.size()/2 + 1;  
         return arr.get(index);
     }
 } 

int[] getMarksAppearanceArray(){
    int[] marksArr = new int[100];
     int times = marksArr[0],mode = 0;
     for(int i = 0; i < arr.size(); i++){
         marksArr[arr.get(i)] += 1;
     } 
     return marksArr;
}
 
// any one of the most common values
 double getMode(){ 
    int[] marksArr = getMarksAppearanceArray();
    int mode = 0, times = 0;
    
     for(int i = 0; i < marksArr.length; i++){
         if(times < marksArr[i]){
             times = marksArr[i];
             mode = i;
         }
     }
     
     return mode;
 }
 
 char getGradeChar(int num){
     if(num >= thresholds[0]){
             return grade[0];
         }else if(num >= thresholds[1]){
             return grade[1];
         }else if(num >= thresholds[2]){
             return grade[2];
         }else if (num >= thresholds[3]){
             return grade[3];
         }else if (num >= thresholds[4]){
             return grade[4];
         }else{
             return grade[5];
         }
 }
         
 void displayGrade(){
     for(int i = 0; i < arr.size(); i++){ 
         int g = arr.get(i);
         System.out.print( i%15 == 0 ? "\n": ""); // display 15 grades each line
         System.out.print("\t"+getGradeChar(arr.get(i)));
           
     }
      
 }
 
 
 void displayDistribution(){
     HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
     for(int i = 0; i < arr.size(); i ++){ 
          char gradeChar = getGradeChar(arr.get(i));
         if(!hashMap.containsKey(gradeChar)){
             hashMap.put(gradeChar, 1);
         }else{ 
             int value = hashMap.get(gradeChar) + 1;
             
             hashMap.replace(gradeChar, value);
         }
     } 
     for(char i: hashMap.keySet()){
         System.out.println(i + ":" + hashMap.get(i));
     }
 } 
 
 
}
