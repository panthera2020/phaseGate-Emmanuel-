public class QuestionOne {
    public static void main(String... args){
    
        String textOne = "Hello";
        String textTwo = "World";
        
        String newText = "";
        
        newText = newText + textOne.charAt(0) + textTwo.charAt(0) + textOne.charAt(1) + textTwo.charAt(1) + textTwo.charAt(2) + textOne.charAt(2) + textOne.charAt(3) + textTwo.charAt(3) + textTwo.charAt(4) + textOne.charAt(4);
        
        System.out.print(newText);
        System.out.println();
    }
}
