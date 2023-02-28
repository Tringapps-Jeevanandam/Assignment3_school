package school;
import java.util.*;
import java.util.logging.Logger;
 class School{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        String studName;
        int grade;
        float gpa;
        Scanner obj = new Scanner(System.in);
        try{
        Log.info("Enter Student details:");
        Log.info("Student Name");
        studName = obj.nextLine();
        Log.info("Grade");
        grade = obj.nextInt();
        Log.info("GPA");
        gpa = obj.nextFloat();
        SchoolInfo sh = new SchoolInfo(studName,grade,gpa);
        Log.info("Do you want to update GPA? (y/n)");
        char ch = obj.next().charAt(0);
        if(Character.toLowerCase(ch)=='y'){
            sh.updategpa();
        }
        String displaydetails = sh.displayDetails();
        Log.info(displaydetails);
        obj.close();
    }
    catch(Exception e){
        String exp = "Exception:"+e;
        Log.info(exp);
    }
    }
}
