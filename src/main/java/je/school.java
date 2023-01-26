package je;
import java.util.*;
class school2 {
    String studName;
    int grade;
    float GPA;
    school2(String studname,int grade,float GPA){
        this.studName = studname;
        this.grade = grade;
        this.GPA = GPA;
    }
    void updateGPA(){
        float newGPA;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new GPA");
        newGPA = sc.nextFloat();
        this.GPA = newGPA;
    }
    String displayDetails(){
        return this.studName+" has a "+this.GPA+" GPA";
    }
}
public class school{
    public static void main(String[] args) {
        String studName;
        int grade;
        float GPA;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Student details:");
        studName = obj.nextLine();
        grade = obj.nextInt();
        GPA = obj.nextFloat();
        school2 sh = new school2(studName,grade,GPA);
        System.out.println("Do you want to update GPA? (y/n)");
        char ch = obj.next().charAt(0);
        if(Character.toLowerCase(ch)=='y'){
            sh.updateGPA();
        }
        System.out.println(sh.displayDetails());


    }
}
