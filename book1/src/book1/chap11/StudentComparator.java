package book1.chap11;

import java.util.Comparator;

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        // return Integer.compare(a.sno, b.sno) 로 대체가능.
        if(a.sno < b.sno) return -1;
        else if (a.sno == b.sno) return 0;
        else return 1;
    }
}
