package je;
import java.util.*;
class schools {
    String studName;
    int grade;
    float gpa;
    schools(String studname,int grade,float gpa){
        this.studName = studname;
        this.grade = grade;
        this.gpa = gpa;
    }
    void updategpa(){
        float newgpa;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new GPA");
        newgpa = sc.nextFloat();
        this.gpa = newgpa;
    }
    String displayDetails(){
        return this.studName+" has a "+this.gpa+" GPA";
    }
}
public class school{
    public static void main(String[] args) {
        String studName;
        int grade;
        float gpa;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Student details:");
        studName = obj.nextLine();
        grade = obj.nextInt();
        gpa = obj.nextFloat();
        schools sh = new schools(studName,grade,gpa);
        System.out.println("Do you want to update GPA? (y/n)");
        char ch = obj.next().charAt(0);
        if(Character.toLowerCase(ch)=='y'){
            sh.updategpa();
        }
        System.out.println(sh.displayDetails());
    }
}
