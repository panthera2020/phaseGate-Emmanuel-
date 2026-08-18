public class QuestionThree {
    public static String likes(String... names){
        String [] arrayOfNames = new String[names.length];
        
        for(int count = 0; count < arrayOfNames.length; count++){
            arrayOfNames[count] = names[count];
        }
        String reply = "";
        
        if(arrayOfNames.length == 0){
            reply = "no one likes this";
        }else if(arrayOfNames.length == 1){
            reply = reply + arrayOfNames[0] + " likes this";
        }else if (arrayOfNames.length > 1 && arrayOfNames.length <= 3){
            for(int count = 0; count < arrayOfNames.length; count++){
                if(count < arrayOfNames.length - 1){
                    reply = reply + arrayOfNames[count] + ", ";
                }
                if(count == (arrayOfNames.length - 1)){
                    reply = reply + "and " + arrayOfNames[count];
                }
            }
            
            reply = reply + " likes this";
        }else{
            reply = reply + names[0] + ", " + names[1] + " and " + names.length - 2 +" others likes this";
        }
        
    return reply;
    }
    
    
    public static void main(String... args){
    
    System.out.print(likes("Peter"));
    }
}



