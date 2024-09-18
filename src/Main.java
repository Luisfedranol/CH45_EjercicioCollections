public class Main{
    public static void main( String[] args ){
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String studentId = "120120";
        courseService.displayCourseInformation( courseId );
        courseService.displayStudentInformation( studentId);

        courseService.enrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
       System.out.println(courseService.totalCredits(studentId));

        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
    }//main
}//class Main