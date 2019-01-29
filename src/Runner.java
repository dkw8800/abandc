public class Runner {

    public static void main(String[] args) {
        int[] scores = {1,6,4,8};
        int[] scores2 = {1,2,3,4};
        StudentRecord newStudent = new StudentRecord(scores);
        System.out.println(newStudent.finalAverage());
    }
}
