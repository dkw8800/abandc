public class Runner {
//Daniyah Wong
    //made the methods public to show that they work
    public static void main(String[] args) {
        int[] scores = {1,6,4,8,9,10};
        int[] scores2 = {7,8,9,10,12,14};
        StudentRecord newStudent = new StudentRecord(scores);
        System.out.println(newStudent.average(0,3));
        System.out.println(newStudent.hasImproved());
        System.out.println(newStudent.finalAverage());
        StudentRecord newStudent2 = new StudentRecord(scores2);
        System.out.println(newStudent2.average(0,3));
        System.out.println(newStudent2.hasImproved());
        System.out.println(newStudent2.finalAverage());
    }
}
