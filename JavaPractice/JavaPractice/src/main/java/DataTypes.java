public class DataTypes {
    public static void main (String[] args)
    {
        byte a = 127;// 1 Byte, 8-Bits, 2^8 = 256, Size is -128 to 127
        short b = -32768; // 2 Bytes, 16-Bits, 2^16 = 65,536, Size is -32,768 to 32,767
        int c = 2147483647;  // 4 Bytes, 32-Bits, 2^32 = 4,29,49,67,296, Size is -2,14,74,83,648 to 2,14,74,83,647
        long d = 9223372036854775807L; // 8 Bytes, 64-Bits, 2^64 = 1,84,46,74,40,73,70,95,51,616 Size is -92,23,37,20,36,85,47,75,808 to 92,23,37,20,36,85,47,75,807
        float e = 2.12345678788768977876F; // Always prefer F at the end.
        double f = 9.6357276718181983455678543357898643344567898D;
        boolean g = false; // Ether True or False
        char h = 'A';
        float expo = 34e4F;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(expo);
    }
}
