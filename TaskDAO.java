/**
 * 
 */
package com.cogent.test1;

import java.util.Scanner;

/**
 * @author: Joi
 * @date: Jan 16, 2023
 */
public class TaskDAO {
	public static void createTask(Task task[], int size) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < task.length; i++) {
			Task task1 = new Task();
			System.out.println("Please enter task ID");
			int taskId = sc.nextInt();
			System.out.println("Please enter task name");
			String taskName = sc.next();
			task1.setTaskId(taskId);
			task1.setTaskName(taskName);;
			task[i] = task1;
		}
		System.out.println("Task created successfully");
	}
	
	public static void updateTask(Task task[]) {
		if(task == null) {
			System.out.println("There are no tasks available");
		}
		Scanner sc = new Scanner(System.in);
		Task task1 = new Task();
		System.out.println("Please enter task ID");
		int num = sc.nextInt();
		task1.setTaskId(num);
		for(int i = 0; i < task.length; i++) {
			 if( task[i] != null && num == task[i].getTaskId()) {
				System.out.println("Please enter task name");
				String name = sc.next();
				task1.setTaskName(name);
				task[i] = task1;
			}
		}
	}
	
	public static void deleteTask(Task task[]) {
		if(task == null) {
			System.out.println("There are no tasks available");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the task's ID you want to delete");
		int number = sc.nextInt();
		for(int i = 0; i < task.length; i++) {
			if( task[i] != null && number == task[i].getTaskId()) {
				task[i].setTaskName(null);
			}
		}
	}
	
	public static void searchTask(Task task[]) {
		if(task == null) {
			System.out.println("There are no tasks available");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the task ID you are looking for");
		int num = sc.nextInt();
		for(int i = 0; i < task.length; i++) {
			if(task[i] != null && num == task[i].getTaskId()) {
				System.out.println("Task ID: " + task[i].getTaskId());
				System.out.println("Task Name: " + task[i].getTaskName());
				
			}		
		}
	}
}
