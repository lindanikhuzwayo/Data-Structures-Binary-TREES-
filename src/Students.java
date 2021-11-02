
public class Students implements Comparable<Students> {
    //** name,ID and LastName of students**//
    String Name;
    String ID;
    String LastName;
    int opCount;
    //** get methods for vars, returns their value and toString for printing everything**//
    public Students (String StudentName, String StudentID, String StudentLastname){
        Name=StudentName;
        ID=StudentID;
        LastName=StudentLastname;
    }
    public int getopCount(){
    return opCount;
    }
    
    public String getStudentID(){
        return ID;
    
    }
    
    
    public String getStudentName(){
        return Name;
    }
    
    public String getSurname(){
        return LastName;
    }
    
    public String toString(){
        return "StudentID :"+ID+"  StudentName :"+Name+" "+LastName;
    }
     public int compareTo(Students other){
     
      return ID.compareTo(other.ID);
     }
         
        
    
     








}
