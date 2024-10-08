import java.util.*;
public class PrintFivePlaces{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the names of your favourite 5 places you want to visit: ");
System.out.print("Enter the names of 1st place: ");
String place1 = sc.nextLine();
System.out.print("Enter the names of 2st place: ");
String place2 = sc.nextLine();
System.out.print("Enter the names of 3st place: ");
String place3 = sc.nextLine();
System.out.print("Enter the names of 4st place: ");
String place4 = sc.nextLine();
System.out.print("Enter the names of 5st place: ");
String place5 = sc.nextLine();
System.out.print(place1+", "+place2+", "+place3+", "+place4+", "+place5);
}
}

