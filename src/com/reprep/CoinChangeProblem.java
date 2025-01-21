package com.reprep;

import java.util.Arrays;

public class CoinChangeProblem {
  public static void main(String[] args) {
    int amount = 7;
    int[] coins = {
      1,
      3,
      4,
      5
    };

    int minCoin = coinChange(coins, amount);
    System.out.println("min coin is :: " + minCoin);
  }

  private static int coinChange(int[] coins, int amount) {
    int minCoin = 0;
    if (amount < coins[coins.length - 1]) {
        System.out.println("amount is less then max coin");
      return -1;
    }
    if (amount == coins[coins.length - 1]) {
        System.out.println("amount is equal max coin");
      return 1;
    }
    for (int i = coins.length - 1; i >= 0; i--) {
      int reminder = amount % coins[i];
      if (isReminderPresent(coins, amount, reminder) == 0) {
        minCoin = minCoin + (amount / coins[i]);
      }
      if(isReminderPresent(coins, amount, reminder) == -1){
        System.out.println("not possible");
        return -1;
      }
      
    }
    return minCoin;
  }

  private static int isReminderPresent(int[] coins, int amount, int reminder) {
    System.out.println("checking if reminder exist :: "+reminder);
    for (int j = 0; j <= coins.length - 1; j++) {
      if (reminder == coins[j]) {
        System.out.println("reminder exists");
        return coins[j];
      }
    }
    return -1;
  }

}