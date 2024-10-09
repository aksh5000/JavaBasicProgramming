import java.util.*;
public class SpringSeason{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Date: ");
int Date = sc.nextInt();
System.out.println("Enter month: ");
int month = sc.nextInt();
if(Date>=12 && Date<=28 && month ==2 ||Date>=1 && Date<=31 && month ==3 || Date>=1 && Date<=11 && month ==4 && month>=1 && month<=12){
System.out.println("True");
}else{
System.out.println("False");
}
}
}
