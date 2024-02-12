class Conversion
{
    public static void main(String a[])
    {
        //converting byte into integer
        byte b = 127;
        int c = b;//implicit conversion

        //converting int into byte
        int d = 258;
        byte x = (byte)d;//casting

        int i = 13;
        byte k = (byte)i;//casting(explicit conversion)

    //converting float into int
    float f = 3.2f;
    int g = (int)f;

    //type promotion: byte can be promoted into int
    byte s = 3;
    byte t = 100;

    int result = s*t;//byte is promoted into int allowing the result of a value over range

    byte z = 3;
    byte y = 2;

    int result1 = z*y;

System.out.print(result1);
        System.out.println(c);
        System.out.println(x);
        System.out.println(k);
        System.out.println(g);//converting float into int you lose decimals
        System.out.println(result);
}
}