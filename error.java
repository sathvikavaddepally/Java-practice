public class error {
  public static void main(String[] args) {
        try {
            Class.forName("coreclass");
        } catch (ClassFormatError a) {
            System.out.println("Class format error occurred");
        } catch (ClassNotFoundException a) {
            System.out.println("Class not found");
        }
    }
}