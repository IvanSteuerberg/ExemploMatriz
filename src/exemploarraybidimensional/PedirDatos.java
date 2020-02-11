package exemploarraybidimensional;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class PedirDatos {
        
public static int pedirInt(){
Scanner sc = new Scanner(System.in);    
int a;
System.out.println("Introduce un numero");
a = sc.nextInt();
return a;
}
public static int pedirInt(String mensaxe){
Scanner sc = new Scanner(System.in);    
int a;
System.out.println(mensaxe);
a = sc.nextInt();
return a;
}


public static float pedirFloat(){
Scanner sc = new Scanner(System.in);    
float b;
System.out.println("Introduce un numero");
b = sc.nextFloat();
return b;
} 
public static String pedirString(String mensaxe){
Scanner sc = new Scanner(System.in);    
String c;
System.out.println(mensaxe);
c = sc.next();
return c;
} 

}            
            
