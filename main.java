class student{
    String name;
    String location;
    String hobbies;
    int age;
public void display(){
        System.out.println("name of the student: "+name+" , location: "+location+" and hobbies:"+hobbies+" ");}}
        public class main{
    public static void main (String[] args) {
        student s1= new student();
        s1.name= "sathvika";
        s1.location="hanmakonda";
        s1.hobbies="dancing,listening music";
        s1.display();

        student s2= new student();
        s2.name= "Medhansh Anirudh";
        s2.location= "sathupally";
        s2.hobbies="playing games";
        s2.display();
        
        student s3= new student();
        s3.name= "Vedhansh";
        s3.location= "Hyderabad";
        s3.hobbies="dancing,playing games";
        s3.display();

        student s4= new student();
        s4.name= "Koushik Vardhan";
        s4.location= "Hyderabad";
        s4.hobbies="playing football, e-gaming";
        s4.display();
        
    }
    }
    
    

