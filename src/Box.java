import java.util.Scanner;

public class Box {
    int width;
    int height;
    int depth;
    Box(int width,int height,int depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public int volume()
    {
        return width*height*depth;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int h=sc.nextInt();
        int c=sc.nextInt();
        Box b=new Box(a,h,c);
        System.out.println(b.volume());

    }
}
