////////////////////////DEMOCLASS////////////////////////////////
import java.io.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class AccessArrayApp{

//** the array of object students**//
public static    Students[] info = new Students[500];

public static int opCount=0; 



//**read file and put into info**///////////;
public static void Read(){
//Students[] info = new Students[5000];
int counter=0;
try{
File myObj = new File("/home/lindani/Assignment1/data/file1.txt");
Scanner myReader = new Scanner(myObj);
 while (myReader.hasNextLine()) {
  String data = myReader.nextLine();
  String[] strArry =data.split(" ");
  info[counter] = new Students(strArry[1], strArry[0], strArry[2] );
 // System.out.println(info[counter].getStudentName()); 
  counter++;
}myReader.close();
} catch (FileNotFoundException e){
 System.out.println("An error occurred");
 e.printStackTrace();}


  }
////////////////////////method////////////////////////////////////                
//////Search by student ID and print infomation if found//////////
 public static void printStudent(String studentID){
  
  int x =0;
  boolean found = false;
  
  
  for (int i = 0; i<500; i++){
  opCount++;
   if ( info[i].getStudentID().equals(studentID)){
      found = true;
      x=i;
    
      break; 
      }
 
      }
  
     if (found== false){
      System.out.println("Access denied!");
     }else if (found== true) {System.out.println(info[x].getStudentName()+" " +info[x].getSurname());}
     
     
   } //////////////////////////////////////////////////////////////////
   
 ////////////////////////Print everything///////////////////////
public static void  printAllStudents(){
      for (int i=0;i<500;i++){
       System.out.println( info[i].toString());      
      }
      //return "non";     
      }
///////////////////////////////////////////////////////////////

public static void main( String [] args) {
 
Read();


if (args.length==0){
 printAllStudents();

}else{
 // for (int i =0; i<args.length;i++){
    printStudent(args[0]);
 }
System.out.println("Number of comparisons: "+opCount);


}

//////////////////////close AccessApp.java//////////////////////////////}
}
