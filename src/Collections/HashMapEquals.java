package Collections;

import java.util.HashMap;
import java.util.Objects;

public class HashMapEquals{
  public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        s1.setId(1);
        s2.setId(2);
        s3.setId(1);
        s4.setId(1);
        s1.setName("Rohan");
        s2.setName("Ritik");
        s3.setName("Rohan");
        s4.setName("Rohan");
        // System.out.println(s1.getId());
        HashMap<Student,Integer> hashMap = new HashMap<>();
        hashMap.put(s1, 85);        
        hashMap.put(s2, 65);        
        hashMap.put(s3, 95);
        hashMap.put(s4, 45);
        System.out.println(hashMap.get(s1));        
    }
}

 class Student{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,id);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Student other = (Student) obj;
        return id == other.getId() && Objects.equals(name,other.getName());

    }

    
}
