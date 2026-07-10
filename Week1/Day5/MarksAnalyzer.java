package Week1.Day5;

public class MarksAnalyzer {
    public static void main(String[] args) {
        int[] marks = {90, 80, 34,65,22,78,45,89,56};
        int countA = 0, countB = 0, countC = 0, countD=0, countF=0;
        int Highest=0, Lowest=Integer.MAX_VALUE;
        int averageMarks = 0;
        int totalMarks = 0;
        for(int i=0; i<marks.length; i++){
            totalMarks += marks[i];
            if (marks[i]>Highest){
                Highest = marks[i];
            }
            if (marks[i]<Lowest){
                Lowest = marks[i];
            }

            if (marks[i]>=90){
                countA++;
            }else if (marks[i]>=75){
                countB++;
            }else if (marks[i]>=50){
                countC++;
            }else if (marks[i]>=33){
                countD++;
            }else{
                countF++;
            }
        }
        System.out.println("Grade A: " + countA);
        System.out.println("Grade B: " + countB);
        System.out.println("Grade C: " + countC);
        System.out.println("Grade D: " + countD);
        System.out.println("Grade F: " + countF);
        System.out.println("Highest Mark: " + Highest);
        System.out.println("Lowest Mark: " + Lowest);
        averageMarks = totalMarks / marks.length;
        System.out.println("Average Mark: " + averageMarks);
    }
}
