package io.javabrains.springbootsecurity;

public class perfectNumber {

    public static void main(String[] args) {
        Integer a = 1234;
        Integer sum = 0;

        for(int i =1;i<=a-1;i++){
            if(a%i ==0){
                sum = sum+i;
                System.out.println(sum);
            }
        }
        if(sum == a){
            System.out.println("pefect");
        }
    }
}
