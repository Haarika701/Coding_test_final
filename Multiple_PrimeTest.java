//package com.birorad.codingtest;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//import org.junit.Test;

public class Multiple_PrimeTest {

	//@Test
	public void TestArray() {
		Random rn = new Random();
		int N = rn.nextInt(100);
		Multiple_Prime mn = new Multiple_Prime();
		ArrayList<Integer> al= mn.sendPrimeList(N);
		//assertNotEquals(0, al.size());
		if(al.isEmpty()) {
		//	fail("array is empty");
		}
		else {
			mn.printPrimes(N);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N = Integer.parseInt(s.nextLine());
		Multiple_Prime mn = new Multiple_Prime();
		mn.printPrimes(N);	
		
	}

}
