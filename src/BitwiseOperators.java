public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;  // In binary: 0101 -> 00102
        int b = 3;  // In binary: 0011
        //1's complement of a
        //0->1 1->0
        //0101 ->1010->-6
        // 2's complement of a
        //1010 + 1 =1011->5

        // Bitwise AND
       // System.out.println("Bitwise AND (a & b): " + (a & b)); // Output: 1 (0001)

        // Bitwise OR
//        System.out.println("Bitwise OR (a | b): " + (a | b));  // Output: 7 (0111)
//
        // Bitwise XOR
       // System.out.println("Bitwise XOR (a ^ b): " + (a ^ b)); // Output: 6 (0110)
//
//        // Bitwise NOT
       // System.out.println("Bitwise NOT (~a): " + (~a));       // Output: -6 (inverts bits)
//
//        // Left Shift
       // System.out.println("Left Shift (a << 1): " + (a << 1)); // Output: 10 (1010)
//
//        // Right Shift
       // System.out.println("Right Shift (a >> 1): " + (a >> 1)); // Output: 2 (0010)
//
//        // Unsigned Right Shift
        System.out.println("Unsigned Right Shift (a >>> 1): " + (a >>> 1)); // Output: 2 (0010)
    }
}
