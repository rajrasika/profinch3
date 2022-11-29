public interface Printtable
{
    void print();
    default void msg()
    {
        System.out.println("default method");

    }
}
