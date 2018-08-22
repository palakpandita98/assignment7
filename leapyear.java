import java.util.Scanner;
class leapyear{
public static void main (String args[])
{
int yr;
Scanner p= new Scanner(System.in);
System.out.print("enter the year");
yr=p.nextInt();
 if((yr%4 == 0)&&(yr%100!=0)){
 System.out.printf("This is a Leap Year");
 }
else if((yr%100 == 0) && (yr%400 == 0)){
System.out.printf("This is a Leap Year");
}
else if(yr%400 == 0){
System.out.printf("This is a Leap Year");
}
else{
System.out.printf("This is not a Leap Year");
}
}
}
