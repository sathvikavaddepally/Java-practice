import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class queue {
    public static void main(String[] args) {
        Queue<String> students = new LinkedList<>();
        Random rand = new Random();
        students.add("chinni");
        students.add("keerthi");
        students.add("sathvika");
        students.add("ammu");
        students.add("siddhu");
        students.add("sathu");
        students.add("akshaya");
        students.add("sirii");
        students.add("shruthi");
        students.add("Mahi");
        System.out.println("Viva process begins...\n");
        while (!students.isEmpty()) {
            String student = students.poll(); 
            int marks = rand.nextInt(51) + 50; 
            System.out.println(student + " attended viva and  got " + marks + " marks.");
        }
        System.out.println("All students have completed their viva.");
       }
       }