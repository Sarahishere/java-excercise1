
package assignment3;
import java.io.*;
import java.util.*;

public class TestSubjectForEnrollProgram {
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in);
        String keepGoing;
        ArrayList<SubjectsForEnroll> arr = new ArrayList<>();
        String fileName = "Subjects.txt";
        // read the files and store the data into ArrayList
        arr = readFile(fileName);
        
        do{ 
            System.out.println("\nEnter the Subject Code(eg. ITC532)");
            String subCode = scan.nextLine();
            System.out.println("\nEnter the Subject Name");
            String subName = scan.nextLine();
            addRecord(subCode,subName,arr);
            System.out.println("Do you want to add another subject record? (Y / N)");
            keepGoing = scan.nextLine();
            
        }while(keepGoing.equalsIgnoreCase("Y"));
        
        writeFile(fileName,arr);
       
        
        
    } 
     
    static void writeFile(String fileName,ArrayList<SubjectsForEnroll> arr ){
        try{
            FileWriter writer = new FileWriter(fileName);
            for(int i = 0; i < arr.size(); i++){
                String code = arr.get(i).getSubCode();
                String name = arr.get(i).getSubName();
                writer.write(code + "," + name +"\n");
            }
            writer.close();
        }catch(Exception e){
            System.out.println("Something went wrong while writing the file");
            e.getStackTrace();
        }
        System.out.println("Thanks for using the system!"); 
    }
    
    
     static void addRecord(String subCode,String subName, ArrayList<SubjectsForEnroll> arr){ 
         SubjectsForEnroll subject = new SubjectsForEnroll(subCode,subName);
         if(subject.isValid(subCode)){
             if(!subject.isExisted(arr, subCode)){
                 arr.add(subject);
                 System.out.println("\nThe new Subject record has been added");
                 
             }else{
                 System.out.println("\nThe Subject Code already existed in your enroll list");
             }
             
         }else{
             System.out.println("\nThe Subject Code is not valid");
         }
        
     }
     
     
     
     static ArrayList<SubjectsForEnroll> readFile(String fileName){ 
        File file = new File(fileName);
        String line;
        String[] tempArr;
        ArrayList<SubjectsForEnroll> arr = new ArrayList<>();
        try{
            Scanner scan = new Scanner(file);
            while(scan.hasNext()){
                line = scan.nextLine();
                tempArr = line.split(",");
                   
           // create SubjectsForEnroll object and store this object into arr
                arr.add(new SubjectsForEnroll(tempArr[0],tempArr[1]));
                
            } 
            scan.close();
        }catch(Exception e){
            System.out.println("Something went wrong while reading the file");
            e.printStackTrace();
        }
        
        return arr;
    }
}
