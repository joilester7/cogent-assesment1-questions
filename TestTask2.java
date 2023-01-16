/**
 * 
 */
package com.cogent.test1;

import java.util.Scanner;

/**
 * @author: Joi
 * @date: Jan 16, 2023
 */
public class TestTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = sc.next();
		System.out.println("Name: " + name);
		
		Task t1 = new Task();
		
		System.out.println("Please enter how many tasks you want to complete today");
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			if(num <= 2) {
				System.out.println("Please enter a number 3 or more");
				num = sc.nextInt();
			} else {
				System.out.println("Please enter task ID");
				t1.setTaskId(sc.nextInt());
				System.out.println("Please enter task name");
				t1.setTaskName(sc.next());
				System.out.println();
				System.out.println("Task ID: " + t1.getTaskId() + ", Task Name: " + t1.getTaskName());
				System.out.println();
			}
		}
	}
}
