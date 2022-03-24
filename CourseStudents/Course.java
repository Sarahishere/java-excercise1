
package packageStage1;


public class Course {
private String courseName;
private String[] students;
private int numOfStudents;

Course(String courseName){
   this.courseName = courseName; 
   numOfStudents = 0;
   students = new String[numOfStudents];
}
String getCourseName(){
    return courseName;
}
 
int getNumOfStudents(){
    return numOfStudents;
} 

String[] getStudents(){
    return students;
}
void addStudent(String student){ 
    String[] newStudents = new String[numOfStudents+1];
    System.arraycopy(students, 0,newStudents ,0, students.length);
    students = newStudents;
    students[numOfStudents] = student;
    numOfStudents++;
    
    
}    
    
void dropStudent(String student){
    int index = findIndex(student);
    removeStudent(index);
    
}    
    
int findIndex(String student){ 
    int index = 0;
    for(int i = 0; i <students.length;i++){
        if(students[i].equals(student)){
           index = i;
        }
    } 
    return index;
} 

void removeStudent(int index){
    String[] newStudents = new String[numOfStudents - 1];
    for(int i = 0,j = 0; i < students.length; i++,j++){
       if( i == index){
           i++;
           newStudents[j] = students[i];
       }else{
           newStudents[j] = students[i];
       }
    } 
    students = newStudents;
    numOfStudents--;
}

void clear(){
    students = new String[0];
    numOfStudents = 0;
}


}
