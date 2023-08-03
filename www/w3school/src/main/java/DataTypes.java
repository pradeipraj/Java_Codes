public class DataTypes {
    public static void main(String[] args) {

        byte a = 127; //Can store 1-Byte information i.e, 8-bits. Range: 256 i.e, -128 to 127
        short b = 32767; //Store 2-Bytes i.e, 16-bits. Range: -32,768 to 32,767
        int c = 2147483647; //Store 4-Bytes i.e, 32-bits. Range: -2,14,74,83,648 to 2,14,74,83,647
        long d = 1000;//Store 8-Bytes i.e, 64-bits. Range: -92,23,37,20,36,85,47,75,808 to 92,23,37,20,36,85,47,75,807
        float e = 1.1234567890f;//4-Bytes. Stores the fractional numbers. 6 to 7 digits after decimal place.
        double f = 23.12345678901234567890;//8-Byte. 15 digits after decimal place.
        boolean g = false;//1-bit. Either TRUE or FALSE.
        char h = 'A';//2-Bytes. Can refer ASCII table.
        char i = 127;

        //Scientific Number
        double j = 10e3;
        double k = 10.4e3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
