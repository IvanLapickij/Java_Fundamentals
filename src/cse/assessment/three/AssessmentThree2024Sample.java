package cse.assessment.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Student {
    private String name;
    private String studentID;
    private String email;
    private String password;
    private int loginAttempts;
    private boolean isLocked;

    public Student(String name, String studentID, String email, String password) {
        this.name = name;
        this.studentID = studentID;
        this.email = studentID;
        this.password = password;
        this.loginAttempts = 0;
        this.isLocked = false;
    }   
    
    
    //Getters and Setters
    
    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void incrementLoginAttempts() {
        loginAttempts++;
        if (loginAttempts >= 3) {
            isLocked = true;
        }
    }

    public void resetLoginAttempts() {
        loginAttempts = 0;
        isLocked = false;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", studentID=" + studentID + ", email=" + email + 
               ", loginAttempts=" + loginAttempts + ", isLocked=" + isLocked + "]";
    }
}

public class AssessmentThree2024Sample {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int REGISTER = 1, LOGIN = 2, RESET_PASSWORD = 3, DELETE = 4, RESET_SYSTEM = 5, 
                  DISPLAY = 6, CONVERT_TO_ARRAY = 7, EXIT = 8;
        ArrayList<Student> students = new ArrayList<>();
        String userContinue = "y";

        while (userContinue.equalsIgnoreCase("y")) {
            switch (userChoice()) {
                case REGISTER:
                    registerStudent(students);
                    break;
                case LOGIN:
                    loginStudent(students);
                    break;
                case RESET_PASSWORD:
                    resetPassword(students);
                    break;
                case DELETE:
                    deleteStudent(students);
                    break;
                case RESET_SYSTEM:
                    resetSystem(students);
                    break;
                case DISPLAY:
                    displayStudents(students);
                    break;
                case CONVERT_TO_ARRAY:
                    Student[] studentArray = convertListToArray(students);
                    System.out.println("Student array created with " + studentArray.length + " students.");
                    break;
                case EXIT:
                    userContinue = "n";
                    break;
                default:
                    System.out.println("Unknown entry: ");
                    break;
            }
        }
    }

    public static int userChoice() {
        System.out.println("What do you want to do?");
        System.out.println("1. Register a new Student");
        System.out.println("2. Login as a Student");
        System.out.println("3. Reset Password");
        System.out.println("4. Delete a Student");
        System.out.println("5. Reset System (Delete All Records)");
        System.out.println("6. Display All Students");
        System.out.println("7. Convert Student List to Array");
        System.out.println("8. Exit");
        return sc.nextInt();
    }

    public static void registerStudent(ArrayList<Student> students) {
        System.out.print("Enter student name: ");
        String name = sc.next();
        System.out.print("Enter student ID: ");
        String studentID = sc.next();
        System.out.print("Enter email: ");
        String email = sc.next();

        if (studentExists(email, students) >= 0 || studentExists(studentID, students) >= 0) {
            System.out.println("Student with this email or student ID already exists.");
        } else {
        	String password = "";
            String confirmPassword = "";
            boolean passwordsMatch = false;

            while (!passwordsMatch) {
                System.out.print("Enter password: ");
                password = sc.next();
                System.out.print("Confirm password: ");
                confirmPassword = sc.next();

                if (password.equals(confirmPassword)) {
                    passwordsMatch = true;
                } else {
                    System.out.println("Passwords do not match. Please try again.");
                }
            }

            students.add(new Student(name, studentID, email, password));
            System.out.println("Student registered successfully.");
            displayStudents(students);
        }
    }

    public static int studentExists(String identifier, ArrayList<Student> students) {
        for (Student student : students) {
            if (student.getEmail().equals(identifier) || student.getStudentID().equals(identifier)) {
                return students.indexOf(student);
            }
        }
        return -1;
    }

    public static void loginStudent(ArrayList<Student> students) {
    	displayStudents(students);
        System.out.print("Enter email or ID: ");
        String email = sc.next();
        int index = studentExists(email, students);

        if (index >= 0) {
            Student student = students.get(index);

            if (student.isLocked()) {
                System.out.println("Account is locked due to multiple failed login attempts.");
            } else {
                System.out.print("Enter password: ");
                String password = sc.next();
                if (student.getPassword().equals(password)) {
                    student.resetLoginAttempts();
                    System.out.println("Login successful.");
                } else {
                    student.incrementLoginAttempts();
                    System.out.println("Incorrect password. Try again.");
                    System.out.println("Attempts remaining: " + (3-student.getLoginAttempts()));
                    if (student.isLocked()) {
                        System.out.println("Account locked due to multiple failed login attempts.");
                    }
                }
            }
        } else {
            System.out.println("Student with this email does not exist.");
        }
    }

    public static void resetPassword(ArrayList<Student> students) {
    	displayStudents(students);
        System.out.print("Enter email: ");
        String email = sc.next();
        int index = studentExists(email, students);

        if (index >= 0) {
            Student student = students.get(index);
            System.out.print("Enter current password: ");
            String currentPassword = sc.next();

            if (student.getPassword().equals(currentPassword)) {
                System.out.print("Enter new password: ");
                String newPassword = sc.next();
                student.setPassword(newPassword);
                System.out.println("Password reset successfully.");
                student.resetLoginAttempts();
            } else {
                System.out.println("Current password is incorrect.");
            }
        } else {
            System.out.println("Student with this email or ID does not exist.");
        }
    }

    public static void deleteStudent(ArrayList<Student> students) {
    	displayStudents(students);
        System.out.print("Enter email or ID of the student to delete: ");
        String email = sc.next();
        int index = studentExists(email, students);

        if (index >= 0) {
            students.remove(index);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student with this email does not exist.");
        }
    }

    public static void resetSystem(ArrayList<Student> students) {
        students.clear();
        System.out.println("All student records have been deleted. System reset complete.");
    }

    public static Student[] convertListToArray(ArrayList<Student> students) {
    	Student[] studArr = students.toArray(new Student[students.size()]);
		for(int i=0; i<studArr.length; i++){
			System.out.println("Student Array ["+i+"] is "+studArr[i]);
		}

    	
    	return studArr;
    }

    public static void displayStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}