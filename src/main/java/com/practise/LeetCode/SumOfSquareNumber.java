package com.practise.LeetCode;

public class SumOfSquareNumber {

    public boolean judgeSquareSum(int c){

        for(int i=0; i*i<=c;i++){
            for(int j=0 ; j*j<=c;j++){
                if(i*i+j*j ==c){
                    return true;
                }
            }

        }

        return false;
    }
}
