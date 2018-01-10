/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork_ada;

import java.util.Scanner;
 
public class OptimalParanthesizationUsingDP
{
    private int[][] m;
    private int[][] s;
    private int     n;
 
    public OptimalParanthesizationUsingDP(int[] p)
    {
        n = p.length - 1; // how many matrices are in the chain
        m = new int[n + 1][n + 1]; // overallocate m, so that we don't use index
                                   // 0
        s = new int[n + 1][n + 1]; // same for s
        matrixChainOrder(p); // run the dynamic-programming algorithm
    }
 
    private void matrixChainOrder(int[] p)
    {
        // Initial the cost for the empty subproblems.
        for (int i = 1; i <= n; i++)
            m[i][i] = 0;
        // Solve for chains of increasing length l.
        for (int l = 2; l <= n; l++)
        {
            for (int i = 1; i <= n - l + 1; i++)
            {
                int j = i + l - 1;
                m[i][j] = Integer.MAX_VALUE;
                // Check each possible split to see if it's better
                // than all seen so far.
                for (int k = i; k < j; k++)
                {
                    int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j])
                    {
                        // q is the best split for this subproblem so far.
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }
    }
 
    private String printOptimalParens(int i, int j)
    {
        if (i == j)
            return "A[" + i + "]";
        else
            return "(" + printOptimalParens(i, s[i][j])
                    + printOptimalParens(s[i][j] + 1, j) + ")";
    }
 
    public String toString()
    {
        return printOptimalParens(1, n);
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out
                .println("Enter the array p[], which represents the chain of matrices such that the ith matrix Ai is of dimension p[i-1] x p[i]");
        System.out.println("Enter the total length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the dimensions: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        OptimalParanthesizationUsingDP opudp = new OptimalParanthesizationUsingDP(
                arr);
        System.out.println("Matrices are of order: ");
        for (int i = 1; i < arr.length; i++)
        {
            System.out.println("A" + i + "-->" + arr[i - 1] + "x" + arr[i]);
        }
        System.out.println(opudp.toString());
        sc.close();
    }
}