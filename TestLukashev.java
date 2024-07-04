package TestExercise;
import java.util.Scanner;
public class TestLukashev {
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Введите значение числа а");
		 int a =in.nextInt();
		 System.out.println("Введите значение числа в");
		 int b = in.nextInt();
  printMore(a,b);
	      System.out.println("введите первую строку");
		  String length1=in.next();
		  System.out.println("введите вторую строку");
		  String length2=in.next();
  printLength(length1,length2);
  in.close();
  printArg();
	    }
	 public static void printMore(int a,int b) {
		 if (a>b) {
			 System.out.println("a>b");
		 }
		 if (a<b) {
			 System.out.println("a<b");
		 }
		 if (a==b) {
			 System.out.println("a=b");
		 }
	 }

	 public static void printLength(String length1,String length2) {
		
      if(length1.equals(length2)) {
    	  System.out.println("Строки идентичны");
      }
      else
    	  System.out.println("Строки неидентичны"); 
	 }
	 
	 public static void printArg() {
		 int[] num=  {1,2,3,4,5,6,7,8,9,10};
		 int[] newnum = new int[num.length];
		 //подсчет четных
		 int a=0;
		 for (int i=num.length;i>0;i--) {
			 int numfin=num[i-1];
              //условия если число четное то добавляем в новый массив, проверка на четность числа (деление без остатка)
			 if (numfin%2==0) { 
				 newnum[a]=num[i-1]; 
				 a++;
			 }
		 }
		 //новый массив нужной длины 
		 int []  newnum1=new int [a] ;
         // заполняем и выводим новый массив
		 System.out.print("Четные числа"+" ");
		 while (a>0) {			  
			   newnum1[a-1]=newnum[a-1]; 
			    System.out.print(newnum1[a-1]);
			   if (a>1) {
				   System.out.print(",");   
			   }
			   a--;    
			}
	 }
	
}
