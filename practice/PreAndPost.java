import java.util.*;
public class PreAndPost{
public static void main(String[] args){

/*for (int i=0;;i++){


System.out.print("Printing");
}

}*/
Demo demo = new Demo("Akshinder Singh Sondhi");
Demo.printing(demo);
}
}

class Demo{
private String name;
public Demo(String name){
this.name = name;
}
public static void printing(Demo demo){
System.out.println(demo.name);
}

}
