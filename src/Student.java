public class Student {
    String name;
    public String display(String name)
    {
        this.name=name;
        return name;
    }
    public String noname()
    {
        name="unknown";
        return name;
    }

    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student();
        Student s2=new Student();
        System.out.println(s.noname());
        System.out.println(s1.display("raghav"));
        System.out.println(s2.noname());


    }
}
