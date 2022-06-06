public class BinaryConRecursive {
    public static void binarian (int given)
    {
        if (given>0)
        {
            binarian(given/2);
            System.out.println(given%2);
        }
    }

    public static void main(String[] args) {
        binarian(456);
    }
}
