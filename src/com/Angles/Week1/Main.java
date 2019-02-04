package com.Angles.Week1;

import java.util.Scanner;

public class Main {
            public Main() {
            }

            static String[] add(String[] tasks, String newTask) {
                String[] newtasks = new String[tasks.length + 1];

                for(int i = 0; i < tasks.length; ++i) {
                    newtasks[i] = tasks[i];
                }

                newtasks[newtasks.length - 1] = newTask;
                return newtasks;
            }

            static String[] remove(String[] tasks, int index) {
                if(index >= 0 && index < tasks.length) {
                    String[] newtasks = new String[tasks.length - 1];

                    for(int i = 0; i < tasks.length; ++i) {
                        if(i < index) {
                            newtasks[i] = tasks[i];
                        } else if(i != index) {
                            newtasks[i - 1] = tasks[i];
                        }
                    }

                    return newtasks;
                } else {
                    return tasks;
                }
            }

            static void update(String[] tasks, int index, String newTask) {
                if(index >= 0 && index < tasks.length) {
                    tasks[index] = newTask;
                }
            }

            static void list(String[] tasks) {
                for(int i = 0; i < tasks.length; ++i) {
                    System.out.println(i + ". " + tasks[i]);
                }

            }

            public static void main(String[] args) {
                String[] tasks = new String[0];
                Boolean continueLoop = Boolean.valueOf(true);
                Scanner scanner = new Scanner(System.in);

                while(continueLoop.booleanValue()) {
                    System.out.println("Please choose an option:");
                    System.out.println("(1) Add a task.");
                    System.out.println("(2) Remove a task.");
                    System.out.println("(3) Update a task.");
                    System.out.println("(4) List all tasks.");
                    System.out.println("(0) Exit.");
                    String input = scanner.nextLine();
                    byte var6 = -1;
                    switch(input.hashCode()) {
                        case 48:
                            if(input.equals("0")) {
                                var6 = 4;
                            }
                            break;
                        case 49:
                            if(input.equals("1")) {
                                var6 = 0;
                            }
                            break;
                        case 50:
                            if(input.equals("2")) {
                                var6 = 1;
                            }
                            break;
                        case 51:
                            if(input.equals("3")) {
                                var6 = 2;
                            }
                            break;
                        case 52:
                            if(input.equals("4")) {
                                var6 = 3;
                            }
                    }

                    int index;
                    switch(var6) {
                        case 0:
                            System.out.println("Enter a description of the new task.");
                            String newTask = scanner.nextLine();
                            tasks = add(tasks, newTask);
                            break;
                        case 1:
                            System.out.println("Enter the index of the task to remove.");
                            index = Integer.parseInt(scanner.nextLine());
                            tasks = remove(tasks, index);
                            break;
                        case 2:
                            System.out.println("Enter the index of the task to update.");
                            index = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter the new description of the task.");
                            newTask = scanner.nextLine();
                            update(tasks, index, newTask);
                            break;
                        case 3:
                            list(tasks);
                            break;
                        case 4:
                            continueLoop = Boolean.valueOf(false);
                    }
                }

            }
        }



