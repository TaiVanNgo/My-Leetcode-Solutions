package problem_1672;
// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. 
//Return the wealth that the richest customer has.

// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

// Example 1:

// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6
// Both customers are considered the richest with a wealth of 6 each, so return 6.
// Example 2:

// Input: accounts = [[1,5],[7,3],[3,5]]
// Output: 10
// Explanation: 
// 1st customer has wealth = 6
// 2nd customer has wealth = 10 
// 3rd customer has wealth = 8
// The 2nd customer is the richest with a wealth of 10.
// Example 3:

// Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
// Output: 17

class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int result[] = new int[accounts.length];
        int max = 0;// assume that the maximum value is 0
        // Input: accounts = [[1,2,3],[3,2,1]]
        /*
         * [1, 2, 3]
         * [3, 2, 1]
         */
        for (int i = 0; i < accounts.length; i++) {
            // go to each row ( in the example, there are 2 row)
            for (int j = 0; j < accounts[0].length; j++) {
                // from each row, go to each column
                result[i] += accounts[i][j]; // for example if i = 0, j = 1; ==> accounts[i][j] = 2
            }
            if (result[i] >= max) {// after calculate the row, we sum that row, and compare with the current max
                max = result[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println(maximumWealth(accounts));

    }
}