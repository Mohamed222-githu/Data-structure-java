public class Course {
    public class Course {
        private String courseName;
        private String[] students;
        private int numberOfStudents;

        // Constructor
        public Course(String courseName) {

            this.courseName = courseName;
            this.students = new String[10];
            this.numberOfStudents = 0;
        }

        // Get course name
        public String getCourseName() {
            return courseName;
        }

        // Add student
        public void addStudent(String student) {

            // Check if array is full
            if (numberOfStudents >= students.length) {

                String[] newStudents =
                        new String[students.length * 2];

                // Copy old students
                for (int i = 0;
                     i < students.length;
                     i++) {

                    newStudents[i] = students[i];
                }

                students = newStudents;
            }

            students[numberOfStudents] = student;
            numberOfStudents++;
        }

        // Drop student
        public void dropStudent(String student) {

            for (int i = 0;
                 i < numberOfStudents;
                 i++) {

                if (students[i].equals(student)) {

                    // Move students to the left
                    for (int j = i;
                         j < numberOfStudents - 1;
                         j++) {

                        students[j] = students[j + 1];
                    }

                    students[numberOfStudents - 1] = null;

                    numberOfStudents--;

                    return;
                }
            }
        }

        // Get students
        public String[] getStudents() {
            return students;
        }

        // Get number of students
        public int getNumberOfStudents() {
            return numberOfStudents;
        }

        // Main method
        public static void main(String[] args) {

            Course course =
                    new Course("Java Programming");

            // Add students
            course.addStudent("Ahmed");
            course.addStudent("Mohamed");
            course.addStudent("Ali");
            course.addStudent("Hassan");

            System.out.println("Course Information");
            System.out.println("----------------------");

            System.out.println("Course Name: "
                    + course.getCourseName());

            System.out.println("Number of Students: "
                    + course.getNumberOfStudents());

            System.out.println("\nStudents:");

            String[] students =
                    course.getStudents();

            for (int i = 0;
                 i < course.getNumberOfStudents();
                 i++) {

                System.out.println(
                        (i + 1) + ". " + students[i]);
            }

            // Drop Ali
            course.dropStudent("Ali");

            System.out.println("\nAfter dropping Ali:");

            System.out.println("Number of Students: "
                    + course.getNumberOfStudents());

            students = course.getStudents();

            for (int i = 0;
                 i < course.getNumberOfStudents();
                 i++) {

                System.out.println(
                        (i + 1) + ". " + students[i]);
            }
        }
    }

    {

}


}
