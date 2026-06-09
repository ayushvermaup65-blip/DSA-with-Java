package OOPs;

public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    //Default ctor // attribute -> garbage
    public Student(){
        System.out.println("Student Default ctor Called");
    }

    //Parameterized ctor
    public Student(int id, int age, String name, int nos){
        System.out.println("Student Parameterized ctor Called");
        this.id = id;
        this.age = age  ;
        this.name = name;
        this.nos = nos;

    }

    // Methods / Behaviours
    public void study(){
        System.out.println(name + " Studying");
    }

    public void sleep(){
        System.out.println(name + " sleeping");
    }

    public void bunk(){
        System.out.println(name + " bunking");
    }
}
