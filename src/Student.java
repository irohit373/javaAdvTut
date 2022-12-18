import java.io.Serializable;

// Student object serization example
public class Student implements Serializable{
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    transient private String address; //used to not serialis this data   

    public Student(String name,int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(String name){
        this.name = name;
    }
    public void setAddress(String name){
        this.name = name;
    }

    //getter
    public String getName(){
        return name;
    }    
    public int getAge(){
        return age;
    }    
    public String getAddress(){
        return address ;
    }    

    //toString
    public String toString() {
        return ("Student name is [" + this.getName() + "], age is : [" + this.getAge() + "] and address is : " + this.getAddress());
    }

}
