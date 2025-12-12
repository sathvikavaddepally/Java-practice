public class testing {
  
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Throws if MySQL JAR missing from classpath
            System.out.println("Driver loaded");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}

    
