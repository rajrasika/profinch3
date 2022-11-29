public class Box
{
    public double width;
    public  double height;
    public double depth;

    public Box(double width, double height)
    {
        System.out.println("parametrasied constructor with overloading");
        this.width = width;
        this.height = height;
        depth=2;
    }
    Box(Box s)
    {
        System.out.println("copy constructor");
        width=s.width;
        height=s.height;
        depth=s.depth;

    }
    Box(){
        System.out.println("Defaut constructor");
        width=10;
        height=10;
        depth=10;
    }
    public double volume(){
        return (width*height*depth);
    }

    public Box(double width, double height, double depth)
    {
        System.out.println("parametrasied constructor");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
