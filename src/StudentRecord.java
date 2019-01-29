public class StudentRecord {
    private static int[] scores;

    public StudentRecord(int[] array)
    {
        scores = array;
    }
    private static double average(int start, int end) {
        int avg = 0;
        for (int i = start; i < end; i++)
        {
            avg = avg + scores[i];
        }
        int divi = end - start;
        avg = avg / divi;
        return avg;
    }

    private static boolean hasImproved() {
        boolean improvement = true;
        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i] > scores[i+1])
            {
                improvement = false;
            }
        }
        return improvement;
    }

    public static double finalAverage()
    {
        if(hasImproved())
        {
            return average(scores.length-1/2, scores.length-1);
        }
        else
        {
            return average(0,scores.length-1);
        }
    }
}
