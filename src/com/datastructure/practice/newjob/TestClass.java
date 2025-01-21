package com.datastructure.practice.newjob;

import java.io.*;
import java.util.*;

public class TestClass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int N = Integer.parseInt(br.readLine().trim());
		int[] A = new int[N];
		String[] arr_A = br.readLine().split(" ");
		for (int i_A = 0; i_A < N; i_A++) {
			A[i_A] = Integer.parseInt(arr_A[i_A]);
		}
		int out_ = Solve(N, A);
		System.out.println(out_);

		wr.close();
		br.close();
	}

	static int Solve(int N, int[] A) {
		// Write your code here
		Arrays.sort(A);
		int op = 0;
		for(int i = 0; i < A.length; i++) {
			if(A[0] == 0) {
			    op = A[0];
			    System.out.print(op);
			    break;   
			}else {
				op = A[N];
				System.out.print(op);
				break;
			}
		}
		return op;
	}

}
