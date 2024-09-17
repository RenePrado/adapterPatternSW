public class SchoolApp {

    public static void main(String[] args) {

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        SchoolManagementApp attendance = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
        SchoolManagementApp grading = new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        SchoolManagementApp library = new LibrarySystemAdapter(librarySystem);

        System.out.println("Attendance System: " + attendance.integrateSystem());
        System.out.println("Grading System: " + grading.integrateSystem());
        System.out.println("Library System: " + library.integrateSystem());
    }
}
