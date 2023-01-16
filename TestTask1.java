/**
 * 
 */
package com.cogent.test1;

import java.util.Scanner;

/**
 * @author: Joi
 * @date: Jan 16, 2023
 */
public class TestTask1 {
	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		Task tasks[] = null;
		do {
			System.out.println();
			System.out.println("***Menu***");
			System.out.println("1 - Add a new task");
			System.out.println("2 - Update a task");
			System.out.println("3 - Delete a task");
			System.out.println("4 - Search for a task");
			System.out.println("0 - Exit");
			System.out.println("Please enter your choice");
			choice = sc.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1:
				System.out.println("How many tasks do you want to create?");
				int size = sc.nextInt();
				tasks = new Task[size];
				TaskDAO.createTask(tasks, size);
				break;
			case 2:
				TaskDAO.updateTask(tasks);
				break;
			case 3:
				TaskDAO.deleteTask(tasks);
				break;
			case 4:
				TaskDAO.searchTask(tasks);
				break;
			}
		} while(choice != 0);
		
	}
}
