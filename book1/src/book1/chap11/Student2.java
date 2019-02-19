package book1.chap11;

public class Student2 {
    private String studentNum;

    public Student2(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    @Override
    public int hashCode() {
        return studentNum.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student2) {
            Student2 student = (Student2) obj;
            if (studentNum.equals(student.getStudentNum())) {
                return true;
            }
        }
        return false;
    }
}
