
import java.util.*;

class Employee{
    int id;
    String name;
    float sal;
    Employee(int id,String name, float sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
    @Override
    public String toString(){
       return "Name :"+name+",id="+id+",Sal="+sal;
        
    }
}
class ListSortjava8{

public static void main(String args[]){
    List<Employee> empList= new ArrayList<Employee>();
     empList.add(new Employee(1,"Khusi",30000));
        
           empList.add(new Employee(1,"Subhasish",15000));
             empList.add(new Employee(1,"Durgasish",20000));
             empList.add(new Employee(1,"Debasish",10000));  
    
    System.out.println("List sort using Java 7");
    
    sortListJava7(empList);
    
    for(Employee e: empList){
        System.out.println(e);
    }
    
}
private static void sortListJava7(List empList){

Collections.sort(empList,new Comparator<Employee>(){
        @Override
        public int compare(Employee e1,Employee e2){
            return e1.name.compareTo(e2.name);
        }
});
}
}