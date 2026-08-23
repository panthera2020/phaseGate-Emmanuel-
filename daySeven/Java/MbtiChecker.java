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
        
        String ISTJ = """ 
        ISTJ
                The Inspector 
                Guardian temperament(MBTI)
                The Logistician (16Personalities)
                
        The ISTJ Personality Type
            ISTJs are quiet, dependable, and thorough. They're practical and matter-of-fact, and they work steadily toward a goal without getting distracted. They take real satisfaction in keeping things — work, home, life organized and orderly, and they place a high value on tradition and loyalty.
            
        What does ISTJ stand for? 
            ISTJs are energized by time alone (Introverted), focus on concrete facts and details rather than abstract possibilities (Sensing), make decisions through logical analysis (Thinking), and prefer structure and closure over staying open-ended (Judging).
            
                """;

        String ISFJ = """ 
        ISFJ
                The Protector 
                Guardian temperament(MBTI)
                The Defender (16Personalities)
                
        The ISFJ Personality Type
            ISFJs are quiet, warm, and conscientious, showing up reliably for the people who depend on them. They're thorough and accurate in their work, and they pay close attention to the people who matter to them, noticing and remembering small but meaningful details. They work to keep their environment harmonious and orderly.
            
        What does ISFJ stand for? 
            ISFJs are energized by time alone (Introverted), focus on concrete facts and details (Sensing), make decisions based on personal values and how choices affect people (Feeling), and prefer structure and planning (Judging).
            
                """;

        String INFJ = """ 
        INFJ
                The Counselor 
                Idealist temperament(MBTI)
                The Advocate (16Personalities)
                
        The INFJ Personality Type
            INFJs search for deeper meaning and connection in ideas, relationships, and the world around them. They're naturally insightful about what drives people and genuinely committed to their own values. Once INFJs form a clear vision of how to serve the greater good, they pursue it in an organized, decisive way.
            
        What does INFJ stand for? 
            INFJs are energized by time alone (Introverted), focus on patterns, meaning, and future possibilities (iNtuitive), make decisions based on values and empathy (Feeling), and prefer structure and closure (Judging).
            
                """;

        String INTJ = """ 
        INTJ
                The Architect 
                Rational temperament(MBTI)
                The Architect (16Personalities)
                
        The INTJ Personality Type
            INTJs are original, independent thinkers with a strong drive to turn their ideas into reality. They naturally spot patterns in events and think in long-range, big-picture terms. Once committed to a plan, they organize it methodically and see it through holding themselves and others to high standards.
            
        What does INTJ stand for? 
            INTJs are energized by time alone (Introverted), focus on patterns and future possibilities (iNtuitive), make decisions through logic and objective analysis (Thinking), and prefer structure and planning (Judging).
            
                """;

        String ISTP = """ 
        ISTP
                The Craftsman 
                Artisan temperament(MBTI)
                The Virtuoso (16Personalities)
                
        The ISTP Personality Type
            ISTPs are calm, flexible observers — until a problem shows up, and then they act quickly and decisively to solve it. They're skilled at figuring out how things work, sorting through information efficiently to find what actually matters. Cause-and-effect thinking and hands-on efficiency come naturally to them.
            
        What does ISTP stand for? 
            ISTPs are energized by time alone (Introverted), focus on concrete, hands-on facts (Sensing), make decisions through logical analysis (Thinking), and prefer to stay open and adaptable rather than locked into a plan (Perceiving).
            
                """;

        String ISFP = """ 
        ISFP
                The Composer 
                Artisan temperament(MBTI)
                The Adventurer (16Personalities)
                
        The ISFP Personality Type
            ISFPs are gentle, sensitive, and quietly kind, most at home living fully in the present moment. They like having their own space and working at their own pace, staying loyal to the people and values that matter to them. They avoid conflict and generally don't try to push their views onto others.
            
        What does ISFP stand for? 
            ISFPs are energized by time alone (Introverted), focus on concrete, present-moment experience (Sensing), make decisions based on personal values (Feeling), and prefer to stay flexible and spontaneous (Perceiving).
            
                """;

        String INFP = """ 
        INFP
                The Healer 
                Idealist temperament(MBTI)
                The Mediator (16Personalities)
                
        The INFP Personality Type
            INFPs are imaginative idealists guided by their own deeply held values. They're sensitive, caring, and genuinely invested in the growth of both themselves and others. Individualistic and nonjudgmental, INFPs believe everyone should find their own path, and they enjoy exploring ideas creatively and expressing themselves in original ways.
            
        What does INFP stand for? 
            INFPs are energized by time alone (Introverted), focus on ideas and future possibilities rather than concrete facts (iNtuitive), make decisions based on feelings and personal values (Feeling), and prefer to stay spontaneous and flexible rather than locked into a plan (Perceiving).
            
                """;

        String INTP = """ 
        INTP
                The Thinker 
                Rational temperament(MBTI)
                The Logician (16Personalities)
                
        The INTP Personality Type
            INTPs are driven to build logical explanations for anything that captures their interest. They lean theoretical and abstract, often more engaged with ideas than with social interaction. Quiet and adaptable on the surface, they're capable of remarkable focus and depth when working through a problem in their area of interest.
            
        What does INTP stand for? 
            INTPs are energized by time alone (Introverted), focus on abstract ideas and possibilities (iNtuitive), make decisions through logical analysis (Thinking), and prefer to stay open-ended and adaptable (Perceiving).
            
                """;

        String ESTP = """ 
        ESTP
                The Promoter 
                Artisan temperament(MBTI)
                The Entrepreneur (16Personalities)
                
        The ESTP Personality Type
            ESTPs are pragmatic and results-focused, more interested in taking action than sitting through theory. They live very much in the here and now, spontaneous and energized by being active with other people. They enjoy material comforts and tend to learn best simply by doing.
            
        What does ESTP stand for? 
            ESTPs are energized by interaction with others (Extraverted), focus on concrete, present moment facts (Sensing), make decisions through logical analysis (Thinking), and prefer to stay flexible rather than locked into a plan (Perceiving).
            
                """;

        String ESFP = """ 
        ESFP
                The Performer 
                Artisan temperament(MBTI)
                The Entertainer (16Personalities)
                
        The ESFP Personality Type
            ESFPs are outgoing, warm, and enthusiastic about life, people, and everyday pleasures. They love working alongside others to make things happen, bringing a practical, grounded energy that makes the work feel fun. Flexible and spontaneous, they adapt easily to new people and new situations.
            
        What does ESFP stand for? 
            ESFPs are energized by interaction with others (Extraverted), focus on concrete, present-moment facts (Sensing), make decisions based on personal values (Feeling), and prefer to stay spontaneous (Perceiving).
            
                """;

        String ENFP = """ 
        ENFP
                The Champion 
                Idealist temperament(MBTI)
                The Campaigner (16Personalities)
                
        The ENFP Personality Type
            ENFPs are warm, imaginative, and full of enthusiasm, seeing life as brimming with possibility. They connect ideas and information quickly, then confidently act on the patterns they notice. They thrive on encouragement, both giving it and receiving it and lean on spontaneity and quick thinking rather than rigid planning.
            
        What does ENFP stand for? 
            ENFPs are energized by interaction with others (Extraverted), focus on patterns and future possibilities (iNtuitive), make decisions based on feelings and values (Feeling), and prefer to stay spontaneous and flexible (Perceiving).
            
                """;

        String ENTP = """ 
        ENTP
                The Inventor 
                Rational temperament(MBTI)
                The Debater (16Personalities)
                
        The ENTP Personality Type
            ENTPs are quick-witted, resourceful, and always ready to challenge an idea. They're skilled at generating new possibilities and then picking them apart strategically, and they're often perceptive readers of other people. Routine bores them fast, they'd rather move on to the next interesting problem than repeat the last one.
            
        What does ENTP stand for? 
            ENTPs are energized by interaction with others (Extraverted), focus on patterns and future possibilities (iNtuitive), make decisions through logical analysis (Thinking), and prefer to stay open-ended and adaptable (Perceiving).
            
                """;

        String ESTJ = """ 
        ESTJ
                The Supervisor 
                Guardian temperament(MBTI)
                The Executive (16Personalities)
                
        The ESTJ Personality Type
            ESTJs are practical, decisive, and quick to act on their conclusions. They're skilled organizers of both people and projects, focused on efficient results and rarely letting the routine details slip. Holding a clear set of standards, they apply them consistently and expect the same discipline from others.
            
        What does ESTJ stand for? 
            ESTJs are energized by interaction with others (Extraverted), focus on concrete facts and details (Sensing), make decisions through logical analysis (Thinking), and prefer structure and closure (Judging).
            
                """;

        String ESFJ = """ 
        ESFJ
                The Provider 
                Guardian temperament(MBTI)
                The Consul (16Personalities)
                
        The ESFJ Personality Type
            ESFJs are warm, cooperative, and genuinely invested in keeping harmony around them. They like collaborating with others to get things done accurately and on schedule, and they're reliably loyal, following through even on small commitments. Attuned to what people around them need day to day, they want to be recognized for who they are.
            
        What does ESFJ stand for? 
            ESFJs are energized by interaction with others (Extraverted), focus on concrete facts and details (Sensing), make decisions based on personal values (Feeling), and prefer structure and planning (Judging).
            
                """;

        String ENFJ = """ 
        ENFJ
                The Teacher 
                Idealist temperament(MBTI)
                The Protagonist (16Personalities)
                
        The ENFJ Personality Type
            ENFJs are warm, empathetic, and deeply attuned to the emotions and motivations of the people around them. They tend to see potential in everyone and take real satisfaction in helping others grow into it, often acting as a catalyst for a whole group's development. Sociable and responsive, they bring an inspiring, people first style of leadership.
            
        What does ENFJ stand for? 
            ENFJs are energized by interaction with others (Extraverted), focus on patterns and future possibilities (iNtuitive), make decisions based on feelings and values (Feeling), and prefer structure and closure (Judging).
            
                """;

        String ENTJ = """ 
        ENTJ
                The Commander 
                Rational temperament(MBTI)
                The Commander (16Personalities)
                
        The ENTJ Personality Type
            ENTJs are frank, decisive, and comfortable stepping into leadership. They're quick to spot inefficient systems and enjoy building better ones, thinking in terms of long-range plans and goals. Well-informed and always expanding their knowledge, they're direct and forceful when presenting their ideas to others.
            
        What does ENTJ stand for? 
            ENTJs are energized by interaction with others (Extraverted), focus on patterns and future possibilities (iNtuitive), make decisions through logical analysis (Thinking), and prefer structure and closure (Judging).
            
                """;
        
        String[] personalityTypes = {ISTJ,ISFJ,INFJ,INTJ,ISTP,ISFP,INFP,INTP,ESTP,ESFP,ENFP,ENTP,ESTJ,ESFJ,ENFJ,ENTJ};
        
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
        
        String [] userJudgingPerceptiveSelection = MbitFunctions.judgingOrPerceptiveSelection(userSelection, questions);
        for(int index = 0; index < userJudgingPerceptiveSelection.length; index++){
            System.out.println(userJudgingPerceptiveSelection[index]);
        }
        
        System.out.println("Number of A selected: " + MbitFunctions.judgingOrPerceptiveASelectionCountIn(userSelection));
        System.out.println("Number of B selected: " + MbitFunctions.judgingOrPerceptiveBSelectionCountIn(userSelection));
        
        System.out.println();
        
        String userPersonality = "" + MbitFunctions.extrovertOrIntrovert(userSelection) + MbitFunctions.sensingOrIntuitive(userSelection) + MbitFunctions.thinkingOrFeeling(userSelection) + MbitFunctions.judgingOrPerceptive(userSelection);
        
        System.out.println(MbitFunctions.getPersonalityDescription(personalityTypes, userPersonality));
    }
}
