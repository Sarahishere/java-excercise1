
package packageStage1;


public class TestCourse { 
    public static void main(String[] args){
        Course itc666 = new Course("ITC666");
        
        //ADD STUDENTS
        itc666.addStudent("Lulu");
        itc666.addStudent("Helen");
        itc666.addStudent("Mary");
        itc666.addStudent("Bubu");
        itc666.addStudent("Juju");
        
        //drop student
        itc666.dropStudent("Helen");
        itc666.dropStudent("Helen");
        String[] students = itc666.getStudents();
        System.out.println("The students in the course"+itc666.getCourseName()+"are shown below:");
        for( int i = 0; i < itc666.getNumOfStudents(); i++){
            System.out.println(students[i]);
        }
        
        
    }
    
}
