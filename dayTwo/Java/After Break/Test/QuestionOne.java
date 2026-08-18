public class QuestionOne {
    public static int fatherAgeDifference(int fatherAge, int sonAge){
        int yearsAgo = Math.abs(fatherAge - (2 *sonAge));
    return yearsAgo;
    }
    
    public static void main(String... args){
        System.out.print(fatherAgeDifference(30,10));
    }
}
