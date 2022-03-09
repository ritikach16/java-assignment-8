public class MainClass {
    public static void main(String[] args) {
        try{
            ThrowingException myStudent = new ThrowingException();
            myStudent.CheckDetails(60, "");
        }
        catch(StudentNotFoundException | SubjectNotFoundException | StudentStoreException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Method has been executed!!");
        }
    }
}