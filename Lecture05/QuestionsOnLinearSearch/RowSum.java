package com.DSAWithJava.Lecture05.QuestionsOnLinearSearch;

public class RowSum {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        int ans  = maximumWealth(accounts);
        System.out.print("the Wealth of richest person is : " + ans);

    }

    static int maximumWealth(int[][] account) {
        int maxWealth = Integer.MIN_VALUE;

        for(int i = 0 ;i<account.length ; i ++){
            int temWealh = 0;
            for(int j  = 0 ; j<account[i].length ; j++){
                temWealh = temWealh + account[i][j];
                if(maxWealth < temWealh){
                    maxWealth = temWealh;
                }
            }
        }
        return maxWealth;
    }
}
