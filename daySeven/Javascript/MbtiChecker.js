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
