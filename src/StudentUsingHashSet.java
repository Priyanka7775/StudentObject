import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentUsingHashSet {
    public static void main(String[] args) {
        StudentUsingHashSet studentUsingHashSet=new StudentUsingHashSet();
        Set<Students> students=studentUsingHashSet.createSet();
        studentUsingHashSet.display(students);
        boolean result= studentUsingHashSet.removeName(students);
        if (result){
            System.out.println("Student Deleted");
        }else {
            System.out.println("Student Not Found");
        }
        studentUsingHashSet.display(students);
    }

    public Set<Students> createSet(){
        Set<Students> students=new HashSet<>();
        students.add(new Students("Priyanka",7,10));
        students.add(new Students("Akshay",1,8));
        students.add(new Students("Julie",4,9));
        students.add(new Students("Ramesh",11,5));
        students.add(new Students("Suresh",3,6));

        return students;
    }

    public void display(Set<Students> students){
        Iterator<Students> iterator= students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }

    public boolean removeName(Set<Students>students){
        boolean responce=false;
        Iterator<Students> iterator= students.iterator();
        while (iterator.hasNext()){
            Students  temp=iterator.next();
            if(temp.getName().charAt(0)=='A' || temp.getName().charAt(0)=='J'){
                iterator.remove();

            }
        }
        return responce;
    }
}
