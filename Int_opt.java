import java.util.*;
public class Int_opt{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int a = 5;
int b = 4;
int c = 2;

int m = a+b*c;
int n = a*b+c;
int p = c+a/b;
int q = a%b+c;

System.out.println(" a+b*c= "+m);
System.out.println(" a*b+c= "+n);
System.out.println(" c+a/b= "+p);
System.out.println("a%b+c= "+q);
}
}
