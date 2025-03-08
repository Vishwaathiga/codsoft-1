import java.util.*;
public class Grade{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no of subjects:");
int n=sc.nextInt();
int total = 0;
for (int i = 1; i <= n; i++) {
System.out.print("Enter marks for subject " + i + ": ");
int marks= sc.nextInt();
total += marks;
}
double avg = total/n;
String grade;
if (avg >= 90) grade = "A+";
else if (avg >= 80) grade = "A";
else if (avg >= 70) grade = "B+";
else if (avg >= 60) grade = "B";
else if (avg >= 50) grade = "C";
else grade = "F";
System.out.println("\nTotal Marks: " + total);
System.out.printf("Average Percentage: %.2f%%\n", avg);
System.out.println("Grade: " + grade);
sc.close();
}
}