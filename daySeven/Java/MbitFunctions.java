public class MbitFunctions {
    public static String getFirstElementIn(String [] arrayOfStrings){
        String firstElement = arrayOfStrings[0];
        return firstElement;
    }
    
    public static String getSecondElementIn(String [] arrayOfStrings){
        String secondElement = arrayOfStrings[1];
        return secondElement;
    }
    
    public static String getFirstElementIn(String [][] arrayOfStrings,int index){
        String firstElement = arrayOfStrings[index][0];
        return firstElement;
    }
    
    public static String getSecondElementIn(String [][] arrayOfStrings, int index){
        String secondElement = arrayOfStrings[index][1];
        return secondElement;
    }
    
    private static String getNumber(String letter){
        int number = 0;
        if(letter.equals("B")){
            number = 1
        }
        
        return number;
    }
    
    
}
