import java.util.Scanner;

public class MbtiChecker {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        String [] one = {"A. expend energy, enjoy groups", "B. conserve energy, enjoy one-on-one"};
        String [] two = {"A. Interpret literally", "B. look for meaning and possibilities"};
        String [] three = {"A. logical, thinking, questioning", "B. empathetic, feeling, accommodating"};
        String [] four = {"A. organized, orderly", "B. flexible, adaptable"};
        String [] five = {"A. more outgoing, think out loud", "B. more reserved, think to yourself"};
        String [] six = {"A. practical, realistic, experimental", "B. imaginative, innovative, theoretical"};
        String [] seven = {"A. candid, straight forward, frank", "B. tactful, kind, encouraging"};
        String [] eight = {"A. plan, schedule", "B. unplanned, spontaneous"};
        String [] nine = {"A. seek many tasks, public activities, interaction with others", "B. seek private, solitary activities with quiet to concentrate"};
        String [] ten = {"A. standard, usual, conventional", "B. different, novel, unique"};
        String [] eleven = {"A. firm, tend to criticize, hold the line", "B. gentle, tend to appreciate, conciliate"};
        String [] twelve = {"A. regulated, structured", "B. easy-going, live and let live"};
        String [] thirteen = {"A. external, communicative, express yourself", "B. internal, reticent, keep to yourself"};
        String [] fourteen = {"A. focus on here-and-now", "B. look to the future, global perspective, big picture"};
        String [] fifteen = {"A. tough-minded, just", "B. tender-hearted, merciful"};
        String [] sixteen = {"A. preparation, plan ahead", "B. go with the flow, adapt as you go"};
        String [] seventeen = {"A. active, initiate", "B. reflective, deliberate"};
        String [] eighteen = {"A. facts, things, what is", "B. ideas, dreams, what could be, philosophical"};
        String [] nineteen = {"A. matter of fact, issue-oriented", "B. sensitive, people-oriented, compassionate"};
        String [] twenty = {"A. control, govern", "B. latitude, freedom"};
        
        String [][] questions = {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen,eighteen,nineteen,twenty};
        
        System.out.println("What is your name?");
        String userName = input.nextLine();
        
        System.out.println();
        
        System.out.println("Enter Options 'A' or 'B' ");
        String [] userSelection = new String[20];
        String choiceToString = "";
        
        
        System.out.println();
        
        for(int count = 0; count < 20; count++){
            choiceToString = "";
            while(true){
                System.out.println(MbitFunctions.getFirstElementIn(questions,count) + "     " + MbitFunctions.getSecondElementIn(questions,count));
                String userChoice = input.nextLine();
                char choice = userChoice.toUpperCase().charAt(0);
                if(choice == 'A'){
                    choiceToString += choice;  
                    userSelection[count] = choiceToString;
                    break;
                }
                else if(choice == 'B'){
                    choiceToString += choice;  
                    userSelection[count] = choiceToString;
                    break;
                }
                else{
                    System.out.println();
                    System.out.println("I know this is an error, Please retry again");
                    System.out.println();
                }
            }
        }
        
        System.out.println();
        
        System.out.println("Hello " + userName + "You Selected");
        System.out.println();
        
        String [] userExtrovertedIntrovertSelection = MbitFunctions.extrovertOrIntrovertSelection(userSelection, questions);
        for(int index = 0; index < userExtrovertedIntrovertSelection.length; index++){
            System.out.println(userExtrovertedIntrovertSelection[index]);
        }
        
        System.out.println("Number of A selected: " + MbitFunctions.extrovertOrIntrovertASelectionCountIn(userSelection));
        System.out.println("Number of B selected: " + MbitFunctions.extrovertOrIntrovertBSelectionCountIn(userSelection));
        
        System.out.println();
        
        String [] userSensingIntuitiveSelection = MbitFunctions.sensingOrIntuitiveSelection(userSelection, questions);
        for(int index = 0; index < userSensingIntuitiveSelection.length; index++){
            System.out.println(userSensingIntuitiveSelection[index]);
        }
        
        System.out.println("Number of A selected: " + MbitFunctions.sensingOrIntuitiveASelectionCountIn(userSelection));
        System.out.println("Number of B selected: " + MbitFunctions.sensingOrIntuitiveBSelectionCountIn(userSelection));
        
        System.out.println();
        
        String [] userThinkingFeelingSelection = MbitFunctions.thinkingOrFeelingSelection(userSelection, questions);
        for(int index = 0; index < userThinkingFeelingSelection.length; index++){
            System.out.println(userThinkingFeelingSelection[index]);
        }
        
        System.out.println("Number of A selected: " + MbitFunctions.thinkingOrFeelingASelectionCountIn(userSelection));
        System.out.println("Number of B selected: " + MbitFunctions.thinkingOrFeelingBSelectionCountIn(userSelection));
        
        System.out.println();
    }
}
