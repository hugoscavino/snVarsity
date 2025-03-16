import java.util.ArrayList;

public class StudentID {

    private static ArrayList<String> studentDir = new ArrayList<>();

    private String name;
    private int[] roomAccess;

    public StudentID(String name) {
        roomAccess = new int[0];
        studentDir.add(name);
    }

    public int[] getRoomAccess() {
        return roomAccess;
    }

    public void setRoomAccess(int[] roomAccess) {
        this.roomAccess = roomAccess;
    }

    public static ArrayList<String> getStudentDir() {
        return studentDir;
    }

    public static boolean isStudentEnrolled(String studentName) {
        int index = studentDir.indexOf(studentName);
        return index != -1;
    }

    public static void main(String[] args) {
       StudentID s1 = new StudentID("Sumu");
       System.out.println(StudentID.isStudentEnrolled("Sumu"));
       StudentID s2 = new StudentID("Liam");
       System.out.println(getStudentDir());
       System.out.println(StudentID.isStudentEnrolled("Haley"));
    }
}
