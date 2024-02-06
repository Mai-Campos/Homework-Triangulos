import java.util.Scanner;

public class Triangulo{
    public static void main(String args[]){

    Scanner in = new Scanner(System.in);   
   System.out.println("Ingrese la longitud del primer lado");
   int a = in.nextInt();
   System.out.println("Ingrese la longitud del segundo lado");
   int b = in.nextInt();
   System.out.println("Ingrese la longitud del tercer lado");
   int c = in.nextInt();

   if( a + b > c && a + c > b && b + c > a){
    System.out.println("Los lados dados pueden formar un triangulo");
   }else{
     System.out.println("LOs lados dados no pueden formar un triangulo");
   }
 }
}