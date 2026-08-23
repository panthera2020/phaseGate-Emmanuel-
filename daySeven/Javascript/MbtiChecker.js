const scanner = require("prompt-sync")();

let getFirstElementIn=(arrayOfStrings, index)=>{
    let firstElement = arrayOfStrings[index][0];
    return firstElement;
}

let getSecondElementIn=(arrayOfStrings, index)=>{
    secondElement = arrayOfStrings[index][1];
    return secondElement;
}

let getNumber=(letter)=>{
    number = 0;
    if(letter === "B"){
        number = 1;
    }
    
    return number;
}
let extrovertOrIntrovert=(selections)=>{
    let extrovertCounter = 0;
    let introvertCounter = 0;
    let isExtrovertOrIntrovert = "";
    
    for(let index = 0; index < selections.length; index += 4){
        let selectedChoice = selections[index];
        if(selectedChoice === "A"){
            extrovertCounter++;
        }
        else if(selectedChoice === "B"){
            introvertCounter++;
        }
    }
    
    if(extrovertCounter > introvertCounter){
        isExtrovertOrIntrovert = "E";
    }
    else if(extrovertCounter < introvertCounter){
        isExtrovertOrIntrovert = "I";
    }
    
    return isExtrovertOrIntrovert;
}

let extrovertOrIntrovertASelectionCountIn=(selections)=>{
    let aSelectionCounter = 0;

    
    for(let index = 0; index < selections.length; index += 4){
        let selectedChoice = selections[index];
        if(selectedChoice === "A"){
            aSelectionCounter++;
        }
    }
    
    return aSelectionCounter;
}

let extrovertOrIntrovertBSelectionCountIn=(selections)=>{
    let bSelectionCounter = 0;

    
    for(let index = 0; index < selections.length; index += 4){
        let selectedChoice = selections[index];
        if(selectedChoice === "B"){
            bSelectionCounter++;
        }
    }
    
    return bSelectionCounter;
}

let extrovertOrIntrovertSelection=(selections,questions)=>{
    let extrovertIntrovertSelection = []
    
    for(let index = 0; index < selections.length; index += 4){
        let selectedChoice = selections[index];
        if(selectedChoice === "A"){
            extrovertIntrovertSelection.push(getFirstElementIn(questions, index));
        }
        else if(selectedChoice === "B"){
            extrovertIntrovertSelection.push(getSecondElementIn(questions, index));
        }
    }
    
    return extrovertIntrovertSelection;
}

let sensingOrIntuitive=(selections)=>{
    let sensingCounter = 0;
    let intuitiveCounter = 0;
    let isSensingOrIntuitive = "";
    
    for(let index = 1; index < selections.length; index += 4){
        let selectedChoice = selections[index];
        if(selectedChoice === "A"){
            sensingCounter++;
        }
        else if(selectedChoice === "B"){
            intuitiveCounter++;
        }
    }
    
    if(sensingCounter > intuitiveCounter){
        isSensingOrIntuitive = "S";
    }
    else if(sensingCounter < intuitiveCounter){
        isSensingOrIntuitive = "N";
    }
    
    return isSensingOrIntuitive;
}

let sensingOrIntuitiveASelectionCountIn=(selections)=>{
    let aSelectionCounter = 0;

    
    for(let index = 1; index < selections.length; index += 4){
        let selectedChoice = selections[index];
        if(selectedChoice === "A"){
            aSelectionCounter++;
        }
    }
    
    return aSelectionCounter;
}

let sensingOrIntuitiveBSelectionCountIn=(selections)=>{
    let bSelectionCounter = 0;

    
    for(let index = 1; index < selections.length; index += 4){
        let selectedChoice = selections[index];
        if(selectedChoice === "B"){
            bSelectionCounter++;
        }
    }
    
    return bSelectionCounter;
}

let sensingOrIntuitiveSelection=(selections,questions)=>{
    sensingOrIntuitiveSelection = [];
    
    for(let index = 1; index < selections.length; index += 4){
        selectedChoice = selections[index];
        if(selectedChoice === "A"){
            sensingOrIntuitiveSelection.push(getFirstElementIn(questions, index));
        }
        else if(selectedChoice === "B"){
            sensingOrIntuitiveSelection.push(getSecondElementIn(questions, index));
        }
    }
    
    return sensingOrIntuitiveSelection;
}

let thinkingOrFeeling=(selections)=>{
    let thinkingCounter = 0;
    let feelingCounter = 0;
    let isThinkingOrFeeling= "";
    
    for(let index = 2; index < selections.length; index += 4){
        let selectedChoice = selections[index];
        if(selectedChoice === "A"){
            thinkingCounter++;
        }
        else if(selectedChoice === "B"){
            feelingCounter++;
        }
    }
    
    if(thinkingCounter > feelingCounter){
        isThinkingOrFeeling = "T";
    }
    else if(thinkingCounter < feelingCounter){
        isThinkingOrFeeling = "F";
    }
    
    return isThinkingOrFeeling;
}

let thinkingOrFeelingASelectionCountIn=(selections)=>{
    let aSelectionCounter = 0;

    
    for(let index = 2; index < selections.length; index += 4){
        let selectedChoice = selections[index];
        if(selectedChoice === "A"){
            aSelectionCounter++;
        }
    }
    
    return aSelectionCounter;
}   

let thinkingOrFeelingBSelectionCountIn=(selections)=>{
    let bSelectionCounter = 0;

    
    for(let index = 2; index < selections.length; index += 4){
        let selectedChoice = selections[index];
        if(selectedChoice === "B"){
            bSelectionCounter++;
        }
    }
    
    return bSelectionCounter;
}

let thinkingOrFeelingSelection=(selections,questions)=>{
    let thinkingOrFeelingSelection = [];
    
    for(let index = 2; index < selections.length; index += 4){
        let selectedChoice = selections[index];
        if(selectedChoice === "A"){
            thinkingOrFeelingSelection.push(getFirstElementIn(questions, index));
        }
        else if(selectedChoice === "B"){
            thinkingOrFeelingSelection.push(getSecondElementIn(questions, index));
        }
    }
    
    return thinkingOrFeelingSelection;
}

let judgingOrPerceptive=(selections)=>{
    let judgingCounter = 0;
    let perceptiveCounter = 0;
    let isJudgingOrPerceptive = "";
    
    for(let index = 3; index < selections.length; index += 4){
        let selectedChoice = selections[index];
        if(selectedChoice === "A"){
            judgingCounter++;
        }
        else if(selectedChoice === "B"){
            perceptiveCounter++;
        }
    }
    
    if(judgingCounter > perceptiveCounter){
        isJudgingOrPerceptive = "J";
    }
    else if(judgingCounter < perceptiveCounter){
        isJudgingOrPerceptive = "P";
    }
    
    return isJudgingOrPerceptive;
}

let judgingOrPerceptiveASelectionCountIn=(selections)=>{
    let aSelectionCounter = 0;

    
    for(let index = 3; index < selections.length; index += 4){
        let selectedChoice = selections[index];
        if(selectedChoice === "A"){
            aSelectionCounter++;
        }
    }
    
    return aSelectionCounter;
} 

let judgingOrPerceptiveBSelectionCountIn=(selections)=>{
    let bSelectionCounter = 0;

    
    for(let index = 3; index < selections.length; index += 4){
        let selectedChoice = selections[index];
        if(selectedChoice === "B"){
            bSelectionCounter++;
        }
    }
    
    return bSelectionCounter;
}  

let judgingOrPerceptiveSelection=(selections, questions)=>{
    let judgingOrPerceptiveSelection = []
    
    for(let index = 3; index < selections.length; index += 4){
        let selectedChoice = selections[index];
        if(selectedChoice === "A"){
            judgingOrPerceptiveSelection.push(getFirstElementIn(questions, index));
        }
        else if(selectedChoice === "B"){
            judgingOrPerceptiveSelection.push(getSecondElementIn(questions, index));
        }
    }
    
    return judgingOrPerceptiveSelection;
}

let getPersonalityDescription=(personalityTypes, personalityType)=>{
    let description = "";
    
    switch (personalityType){
        case "ISTJ": 
            description = personalityTypes[0];
            break;
        case "ISFJ":
            description = personalityTypes[1];
            break;
        case "INFJ":
            description = personalityTypes[2];
            break;
        case "INTJ":
            description = personalityTypes[3];
            break;
        case "ISTP":
            description = personalityTypes[4];
            break;
        case "ISFP":
            description = personalityTypes[5];
            break;
        case "INFP":
            description = personalityTypes[6];
            break;
        case "INTP":
            description = personalityTypes[7];
            break;
        case "ESTP":
            description = personalityTypes[8];
            break;
        case "ESFP":
            description = personalityTypes[9];
            break;
        case "ENFP":
            description = personalityTypes[10];
            break;
        case "ENTP":
            description = personalityTypes[11];
            break;
        case "ESTJ":
            description = personalityTypes[12];
            break;
        case "ESFJ":
            description = personalityTypes[13];
            break;
        case "ENFJ":
            description = personalityTypes[14];
            break;
        case "ENTJ":
            description = personalityTypes[15];
            break;
    }
    
    return description;
}


let one = ["A. expend energy, enjoy groups", "B. conserve energy, enjoy one-on-one"];
let two = ["A. Interpret literally", "B. look for meaning and possibilities"];
let three = ["A. logical, thinking, questioning", "B. empathetic, feeling, accommodating"];
let four = ["A. organized, orderly", "B. flexible, adaptable"];
let five = ["A. more outgoing, think out loud", "B. more reserved, think to yourself"];
let six = ["A. practical, realistic, experimental", "B. imaginative, innovative, theoretical"];
let seven = ["A. candid, straight forward, frank", "B. tactful, kind, encouraging"];
let eight = ["A. plan, schedule", "B. unplanned, spontaneous"];
let nine = ["A. seek many tasks, public activities, interaction with others", "B. seek private, solitary activities with quiet to concentrate"];
let ten = ["A. standard, usual, conventional", "B. different, novel, unique"];
let eleven = ["A. firm, tend to criticize, hold the line", "B. gentle, tend to appreciate, conciliate"];
let twelve = ["A. regulated, structured", "B. easy-going, live and let live"];
let thirteen = ["A. external, communicative, express yourself", "B. internal, reticent, keep to yourself"];
let fourteen = ["A. focus on here-and-now", "B. look to the future, global perspective, big picture"];
let fifteen = ["A. tough-minded, just", "B. tender-hearted, merciful"];
let sixteen = ["A. preparation, plan ahead", "B. go with the flow, adapt as you go"];
let seventeen = ["A. active, initiate", "B. reflective, deliberate"];
let eighteen = ["A. facts, things, what is", "B. ideas, dreams, what could be, philosophical"];
let nineteen = ["A. matter of fact, issue-oriented", "B. sensitive, people-oriented, compassionate"];
let twenty = ["A. control, govern", "B. latitude, freedom"];

let questions = [one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen,eighteen,nineteen,twenty];

let ISTJ = ` 
ISTJ
        The Inspector 
        Guardian temperament(MBTI)
        The Logistician (16Personalities)
        
The ISTJ Personality Type
    ISTJs are quiet, dependable, and thorough. They're practical and matter-of-fact, and they work steadily toward a goal without getting distracted. They take real satisfaction in keeping things — work, home, life organized and orderly, and they place a high value on tradition and loyalty.
    
What does ISTJ stand for? 
    ISTJs are energized by time alone (Introverted), focus on concrete facts and details rather than abstract possibilities (Sensing), make decisions through logical analysis (Thinking), and prefer structure and closure over staying open-ended (Judging).
    
        `;

let ISFJ = ` 
ISFJ
        The Protector 
        Guardian temperament(MBTI)
        The Defender (16Personalities)
        
The ISFJ Personality Type
    ISFJs are quiet, warm, and conscientious, showing up reliably for the people who depend on them. They're thorough and accurate in their work, and they pay close attention to the people who matter to them, noticing and remembering small but meaningful details. They work to keep their environment harmonious and orderly.
    
What does ISFJ stand for? 
    ISFJs are energized by time alone (Introverted), focus on concrete facts and details (Sensing), make decisions based on personal values and how choices affect people (Feeling), and prefer structure and planning (Judging).
    
        `;

let INFJ = ` 
INFJ
        The Counselor 
        Idealist temperament(MBTI)
        The Advocate (16Personalities)
        
The INFJ Personality Type
    INFJs search for deeper meaning and connection in ideas, relationships, and the world around them. They're naturally insightful about what drives people and genuinely committed to their own values. Once INFJs form a clear vision of how to serve the greater good, they pursue it in an organized, decisive way.
    
What does INFJ stand for? 
    INFJs are energized by time alone (Introverted), focus on patterns, meaning, and future possibilities (iNtuitive), make decisions based on values and empathy (Feeling), and prefer structure and closure (Judging).
    
        `;

let INTJ = ` 
INTJ
        The Architect 
        Rational temperament(MBTI)
        The Architect (16Personalities)
        
The INTJ Personality Type
    INTJs are original, independent thinkers with a strong drive to turn their ideas into reality. They naturally spot patterns in events and think in long-range, big-picture terms. Once committed to a plan, they organize it methodically and see it through holding themselves and others to high standards.
    
What does INTJ stand for? 
    INTJs are energized by time alone (Introverted), focus on patterns and future possibilities (iNtuitive), make decisions through logic and objective analysis (Thinking), and prefer structure and planning (Judging).
    
        `;

let ISTP = ` 
ISTP
        The Craftsman 
        Artisan temperament(MBTI)
        The Virtuoso (16Personalities)
        
The ISTP Personality Type
    ISTPs are calm, flexible observers — until a problem shows up, and then they act quickly and decisively to solve it. They're skilled at figuring out how things work, sorting through information efficiently to find what actually matters. Cause-and-effect thinking and hands-on efficiency come naturally to them.
    
What does ISTP stand for? 
    ISTPs are energized by time alone (Introverted), focus on concrete, hands-on facts (Sensing), make decisions through logical analysis (Thinking), and prefer to stay open and adaptable rather than locked into a plan (Perceiving).
    
        `;

let ISFP = ` 
ISFP
        The Composer 
        Artisan temperament(MBTI)
        The Adventurer (16Personalities)
        
The ISFP Personality Type
    ISFPs are gentle, sensitive, and quietly kind, most at home living fully in the present moment. They like having their own space and working at their own pace, staying loyal to the people and values that matter to them. They avoid conflict and generally don't try to push their views onto others.
    
What does ISFP stand for? 
    ISFPs are energized by time alone (Introverted), focus on concrete, present-moment experience (Sensing), make decisions based on personal values (Feeling), and prefer to stay flexible and spontaneous (Perceiving).
    
        `;

let INFP = ` 
INFP
        The Healer 
        Idealist temperament(MBTI)
        The Mediator (16Personalities)
        
The INFP Personality Type
    INFPs are imaginative idealists guided by their own deeply held values. They're sensitive, caring, and genuinely invested in the growth of both themselves and others. Individualistic and nonjudgmental, INFPs believe everyone should find their own path, and they enjoy exploring ideas creatively and expressing themselves in original ways.
    
What does INFP stand for? 
    INFPs are energized by time alone (Introverted), focus on ideas and future possibilities rather than concrete facts (iNtuitive), make decisions based on feelings and personal values (Feeling), and prefer to stay spontaneous and flexible rather than locked into a plan (Perceiving).
    
        `;

let INTP = ` 
INTP
        The Thinker 
        Rational temperament(MBTI)
        The Logician (16Personalities)
        
The INTP Personality Type
    INTPs are driven to build logical explanations for anything that captures their interest. They lean theoretical and abstract, often more engaged with ideas than with social interaction. Quiet and adaptable on the surface, they're capable of remarkable focus and depth when working through a problem in their area of interest.
    
What does INTP stand for? 
    INTPs are energized by time alone (Introverted), focus on abstract ideas and possibilities (iNtuitive), make decisions through logical analysis (Thinking), and prefer to stay open-ended and adaptable (Perceiving).
    
        `;

let ESTP = ` 
ESTP
        The Promoter 
        Artisan temperament(MBTI)
        The Entrepreneur (16Personalities)
        
The ESTP Personality Type
    ESTPs are pragmatic and results-focused, more interested in taking action than sitting through theory. They live very much in the here and now, spontaneous and energized by being active with other people. They enjoy material comforts and tend to learn best simply by doing.
    
What does ESTP stand for? 
    ESTPs are energized by interaction with others (Extraverted), focus on concrete, present moment facts (Sensing), make decisions through logical analysis (Thinking), and prefer to stay flexible rather than locked into a plan (Perceiving).
    
        `;

let ESFP = ` 
ESFP
        The Performer 
        Artisan temperament(MBTI)
        The Entertainer (16Personalities)
        
The ESFP Personality Type
    ESFPs are outgoing, warm, and enthusiastic about life, people, and everyday pleasures. They love working alongside others to make things happen, bringing a practical, grounded energy that makes the work feel fun. Flexible and spontaneous, they adapt easily to new people and new situations.
    
What does ESFP stand for? 
    ESFPs are energized by interaction with others (Extraverted), focus on concrete, present-moment facts (Sensing), make decisions based on personal values (Feeling), and prefer to stay spontaneous (Perceiving).
    
        `;

let ENFP = ` 
ENFP
        The Champion 
        Idealist temperament(MBTI)
        The Campaigner (16Personalities)
        
The ENFP Personality Type
    ENFPs are warm, imaginative, and full of enthusiasm, seeing life as brimming with possibility. They connect ideas and information quickly, then confidently act on the patterns they notice. They thrive on encouragement, both giving it and receiving it and lean on spontaneity and quick thinking rather than rigid planning.
    
What does ENFP stand for? 
    ENFPs are energized by interaction with others (Extraverted), focus on patterns and future possibilities (iNtuitive), make decisions based on feelings and values (Feeling), and prefer to stay spontaneous and flexible (Perceiving).
    
        `;

let ENTP = ` 
ENTP
        The Inventor 
        Rational temperament(MBTI)
        The Debater (16Personalities)
        
The ENTP Personality Type
    ENTPs are quick-witted, resourceful, and always ready to challenge an idea. They're skilled at generating new possibilities and then picking them apart strategically, and they're often perceptive readers of other people. Routine bores them fast, they'd rather move on to the next interesting problem than repeat the last one.
    
What does ENTP stand for? 
    ENTPs are energized by interaction with others (Extraverted), focus on patterns and future possibilities (iNtuitive), make decisions through logical analysis (Thinking), and prefer to stay open-ended and adaptable (Perceiving).
    
        `;

let ESTJ = ` 
ESTJ
        The Supervisor 
        Guardian temperament(MBTI)
        The Executive (16Personalities)
        
The ESTJ Personality Type
    ESTJs are practical, decisive, and quick to act on their conclusions. They're skilled organizers of both people and projects, focused on efficient results and rarely letting the routine details slip. Holding a clear set of standards, they apply them consistently and expect the same discipline from others.
    
What does ESTJ stand for? 
    ESTJs are energized by interaction with others (Extraverted), focus on concrete facts and details (Sensing), make decisions through logical analysis (Thinking), and prefer structure and closure (Judging).
    
        `;

let ESFJ = ` 
ESFJ
        The Provider 
        Guardian temperament(MBTI)
        The Consul (16Personalities)
        
The ESFJ Personality Type
    ESFJs are warm, cooperative, and genuinely invested in keeping harmony around them. They like collaborating with others to get things done accurately and on schedule, and they're reliably loyal, following through even on small commitments. Attuned to what people around them need day to day, they want to be recognized for who they are.
    
What does ESFJ stand for? 
    ESFJs are energized by interaction with others (Extraverted), focus on concrete facts and details (Sensing), make decisions based on personal values (Feeling), and prefer structure and planning (Judging).
    
        `;

let ENFJ = ` 
ENFJ
        The Teacher 
        Idealist temperament(MBTI)
        The Protagonist (16Personalities)
        
The ENFJ Personality Type
    ENFJs are warm, empathetic, and deeply attuned to the emotions and motivations of the people around them. They tend to see potential in everyone and take real satisfaction in helping others grow into it, often acting as a catalyst for a whole group's development. Sociable and responsive, they bring an inspiring, people first style of leadership.
    
What does ENFJ stand for? 
    ENFJs are energized by interaction with others (Extraverted), focus on patterns and future possibilities (iNtuitive), make decisions based on feelings and values (Feeling), and prefer structure and closure (Judging).
    
        `;

let ENTJ = ` 
ENTJ
        The Commander 
        Rational temperament(MBTI)
        The Commander (16Personalities)
        
The ENTJ Personality Type
    ENTJs are frank, decisive, and comfortable stepping into leadership. They're quick to spot inefficient systems and enjoy building better ones, thinking in terms of long-range plans and goals. Well-informed and always expanding their knowledge, they're direct and forceful when presenting their ideas to others.
    
What does ENTJ stand for? 
    ENTJs are energized by interaction with others (Extraverted), focus on patterns and future possibilities (iNtuitive), make decisions through logical analysis (Thinking), and prefer structure and closure (Judging).
    
        `;

let personalityTypes = [ISTJ,ISFJ,INFJ,INTJ,ISTP,ISFP,INFP,INTP,ESTP,ESFP,ENFP,ENTP,ESTJ,ESFJ,ENFJ,ENTJ];

console.log("What is your name?");
let userName = scanner();

console.log();

console.log("Enter Options 'A' or 'B' ");
let userSelection = [];
let choiceToString = "";


console.log();

for(let count = 0; count < 20; count++){
    choiceToString = "";
    while(true){
        console.log(getFirstElementIn(questions,count) + "     " + getSecondElementIn(questions,count));
        let userChoice = scanner();
        let choice = userChoice.toUpperCase().charAt(0);
        if(choice === 'A'){
            choiceToString += choice;  
            userSelection.push(choiceToString);
            break;
        }
        else if(choice === 'B'){
            choiceToString += choice;  
            userSelection.push(choiceToString);
            break;
        }
        else{
            console.log();
            console.log("I know this is an error, Please retry again");
            console.log();
        }
    }
}
console.log();

console.log("Hello " + userName + "You Selected");
console.log();

let userExtrovertedIntrovertSelection = extrovertOrIntrovertSelection(userSelection, questions);
for(let index = 0; index < userExtrovertedIntrovertSelection.length; index++){
    console.log(userExtrovertedIntrovertSelection[index]);
}

console.log("Number of A selected: " + extrovertOrIntrovertASelectionCountIn(userSelection));
console.log("Number of B selected: " + extrovertOrIntrovertBSelectionCountIn(userSelection));

console.log();

let userSensingIntuitiveSelection = sensingOrIntuitiveSelection(userSelection, questions);
for(let index = 0; index < userSensingIntuitiveSelection.length; index++){
    console.log(userSensingIntuitiveSelection[index]);
}

console.log("Number of A selected: " + sensingOrIntuitiveASelectionCountIn(userSelection));
console.log("Number of B selected: " + sensingOrIntuitiveBSelectionCountIn(userSelection));

console.log();

let userThinkingFeelingSelection = thinkingOrFeelingSelection(userSelection, questions);
for(let index = 0; index < userThinkingFeelingSelection.length; index++){
    console.log(userThinkingFeelingSelection[index]);
}

console.log("Number of A selected: " + thinkingOrFeelingASelectionCountIn(userSelection));
console.log("Number of B selected: " + thinkingOrFeelingBSelectionCountIn(userSelection));

console.log();

let userJudgingPerceptiveSelection = judgingOrPerceptiveSelection(userSelection, questions);
for(let index = 0; index < userJudgingPerceptiveSelection.length; index++){
    console.log(userJudgingPerceptiveSelection[index]);
}

console.log("Number of A selected: " + judgingOrPerceptiveASelectionCountIn(userSelection));
console.log("Number of B selected: " + judgingOrPerceptiveBSelectionCountIn(userSelection));

console.log();

let userPersonality = "" + extrovertOrIntrovert(userSelection) + sensingOrIntuitive(userSelection) + thinkingOrFeeling(userSelection) + judgingOrPerceptive(userSelection);

console.log(getPersonalityDescription(personalityTypes, userPersonality));






