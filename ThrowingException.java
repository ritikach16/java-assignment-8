public class ThrowingException extends Exception {
    public void CheckDetails(int stuId, String subId) throws StudentNotFoundException, SubjectNotFoundException, StudentStoreException {
        Student stu = new Student();
        stu.setDetails();
        if(!stu.findStu(stuId)){
            throw new StudentNotFoundException("No Student with this Id");
        }
        if(!stu.findSub(subId)){
            throw new SubjectNotFoundException("No Subject with this Id");
        }

        if(!stu.storeStudent(stuId, subId)){
            throw new StudentStoreException("Please provide valid details");
        }

    }
}