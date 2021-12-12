public class TopperStudent {
    String name;
    double percent;
    TopperStudent(String name,double percent)
    {
        this.name=name;
        this.percent=percent;
    }
    public String toString()
    {
        return "Student name "+name+"  "+"percentage "+percent;
    }
}
class Test
{
    public static void main(String[] args) {
        TopperStudent s=new TopperStudent("Raghav",80.019);
        TopperStudent s1=new TopperStudent("sudeep",91.019);
        TopperStudent s2=new TopperStudent("Rishabh",90.019);
        if(s.percent > s1.percent && s.percent > s2.percent )
        {
            System.out.println(s);
        }
        else if(s1.percent > s.percent && s1.percent > s2.percent )
        {
            System.out.println(s1);
        }
        else if(s2.percent > s.percent && s2.percent > s1.percent )
        {
            System.out.println(s2);
        }
    }
}
