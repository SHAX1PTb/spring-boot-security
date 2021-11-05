package io.javabrains.springbootsecurity;

public class HammingWeight {

    public static void main(String[] args) {
        int c = -223;

        int count = 0;

        for (int i = 0; i < 32; i++) {

            if (((c >>> i) & 1) == 1) {
                count++;
            }


        }
        System.out.println(count);

    }
}
