public class QuestionTwo {
    public static char grade(int firstScore, int secondScore, int thirdScore){
        int average = 0;
        char gradeFor = 'F';
        if(firstScore >-1 && secondScore > -1 && thirdScore > -1){
            average = (firstScore + secondScore + thirdScore) / 3;
            
            if(average >= 90 && average <= 100){
                gradeFor = 'A';
            }
            else if(average >= 80 && average < 90){
                gradeFor = 'B';
            }
            else if(average >= 70 && average < 80){
                gradeFor = 'C';
            }
            else if(average >= 60 && average < 70){
                gradeFor = 'D';
            }
            else if(average >= 0 && average < 60){
                gradeFor = 'F';
            }
        }
        
    return gradeFor;
    }
    
    public static void main(String...args){
    
    System.out.print(grade(90,90,90));
    }
}
