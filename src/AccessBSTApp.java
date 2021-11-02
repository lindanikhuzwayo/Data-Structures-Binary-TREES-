///////////////DEMO CLASS\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
import java.io.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files




public class AccessBSTApp{

public static BinarySearchTree<Students> info = new BinarySearchTree<Students>();
//public static int opCount=0;

public static void printStudent(String StudentID){
Students temp= new Students("null",StudentID,"null");
BinaryTreeNode<Students> x = info.find(temp);
if (x== null){
    System.out.println("Access denied!");
    System.out.println("Number of comparisons: "+info.getopCount());

}else{

 System.out.println(x.data.getStudentName()+" "+x.data.getSurname());
 System.out.println("Number of comparisons: "+info.getopCount());

}


}
///////////////
public static void printAllStudents(){
info.postOrder();
}

public static void Read(){
int counter=0;
try{
File myObj = new File("/home/lindani/Assignment1/data/oklist.txt");
Scanner myReader = new Scanner(myObj);
 while (myReader.hasNextLine()) {
  String data = myReader.nextLine();
  String[] strArry =data.split(" ");
  info.insert( new Students(strArry[1],strArry[0], strArry[2] ) ); 
  counter++;
}myReader.close();
} catch (FileNotFoundException e){
 System.out.println("An error occurred");
 e.printStackTrace();}
  }


public static void main (String[] args){

Read(); 

if (args.length==0){
 printAllStudents();
 System.out.println("Number of comparisons:  "+info.getopCount());

}


if (args.length!=0){
printStudent(args[0]);
}







}////main\\\\\\
















 }
