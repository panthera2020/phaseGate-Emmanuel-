public class MbitFunctions {
    
    public static String getFirstElementIn(String [][] arrayOfStrings,int index){
        String firstElement = arrayOfStrings[index][0];
        return firstElement;
    }
    
    public static String getSecondElementIn(String [][] arrayOfStrings, int index){
        String secondElement = arrayOfStrings[index][1];
        return secondElement;
    }
    
    private static int getNumber(String letter){
        int number = 0;
        if(letter.equals("B")){
            number = 1;
        }
        
        return number;
    }
    
    public static String extrovertOrIntrovert(String [] selections){
        int extrovertCounter = 0;
        int introvertCounter = 0;
        String isExtrovertOrIntrovert = "";
        
        for(int index = 0; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("A")){
                extrovertCounter++;
            }
            else if(selectedChoice.equals("B")){
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
    
    public static int extrovertOrIntrovertASelectionCountIn(String [] selections){
        int aSelectionCounter = 0;

        
        for(int index = 0; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("A")){
                aSelectionCounter++;
            }
        }
        
        return aSelectionCounter;
    }
    
    public static int extrovertOrIntrovertBSelectionCountIn(String [] selections){
        int bSelectionCounter = 0;

        
        for(int index = 0; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("B")){
                bSelectionCounter++;
            }
        }
        
        return bSelectionCounter;
    }
    
    public static String [] extrovertOrIntrovertSelection(String [] selections, String [][] questions){
        String [] extrovertIntrovertSelection = new String[5];
        int counter = 0;
        
        for(int index = 0; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("A")){
                extrovertIntrovertSelection[counter] = getFirstElementIn(questions, index);
                counter++;
            }
            else if(selectedChoice.equals("B")){
                extrovertIntrovertSelection[counter] = getSecondElementIn(questions, index);
                counter++;
            }
        }
        
        return extrovertIntrovertSelection;
    }
    
    public static String sensingOrIntuitive(String [] selections){
        int sensingCounter = 0;
        int intuitiveCounter = 0;
        String isSensingOrIntuitive = "";
        
        for(int index = 1; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("A")){
                sensingCounter++;
            }
            else if(selectedChoice.equals("B")){
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

    public static int sensingOrIntuitiveASelectionCountIn(String [] selections){
        int aSelectionCounter = 0;

        
        for(int index = 1; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("A")){
                aSelectionCounter++;
            }
        }
        
        return aSelectionCounter;
    }

    public static int sensingOrIntuitiveBSelectionCountIn(String [] selections){
        int bSelectionCounter = 0;

        
        for(int index = 1; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("B")){
                bSelectionCounter++;
            }
        }
        
        return bSelectionCounter;
    }

    public static String [] sensingOrIntuitiveSelection(String [] selections, String [][] questions){
        String [] sensingOrIntuitiveSelection = new String[5];
        int counter = 0;
        
        for(int index = 1; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("A")){
                sensingOrIntuitiveSelection[counter] = getFirstElementIn(questions, index);
                counter++;
            }
            else if(selectedChoice.equals("B")){
                sensingOrIntuitiveSelection[counter] = getSecondElementIn(questions, index);
                counter++;
            }
        }
        
        return sensingOrIntuitiveSelection;
    }

    public static String thinkingOrFeeling(String [] selections){
        int thinkingCounter = 0;
        int feelingCounter = 0;
        String isThinkingOrFeeling= "";
        
        for(int index = 2; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("A")){
                thinkingCounter++;
            }
            else if(selectedChoice.equals("B")){
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
    
    public static int thinkingOrFeelingASelectionCountIn(String [] selections){
        int aSelectionCounter = 0;

        
        for(int index = 2; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("A")){
                aSelectionCounter++;
            }
        }
        
        return aSelectionCounter;
    }   
    
    public static int thinkingOrFeelingBSelectionCountIn(String [] selections){
        int bSelectionCounter = 0;

        
        for(int index = 2; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("B")){
                bSelectionCounter++;
            }
        }
        
        return bSelectionCounter;
    }
    
    public static String [] thinkingOrFeelingSelection(String [] selections, String [][] questions){
        String [] thinkingOrFeelingSelection = new String[5];
        int counter = 0;
        
        for(int index = 2; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("A")){
                thinkingOrFeelingSelection[counter] = getFirstElementIn(questions, index);
                counter++;
            }
            else if(selectedChoice.equals("B")){
                thinkingOrFeelingSelection[counter] = getSecondElementIn(questions, index);
                counter++;
            }
        }
        
        return thinkingOrFeelingSelection;
    }

    public static String judgingOrPerceptive(String [] selections){
        int judgingCounter = 0;
        int perceptiveCounter = 0;
        String isJudgingOrPerceptive = "";
        
        for(int index = 3; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("A")){
                judgingCounter++;
            }
            else if(selectedChoice.equals("B")){
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
    
    public static int judgingOrPerceptiveASelectionCountIn(String [] selections){
        int aSelectionCounter = 0;

        
        for(int index = 3; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("A")){
                aSelectionCounter++;
            }
        }
        
        return aSelectionCounter;
    } 
    
    public static int judgingOrPerceptiveBSelectionCountIn(String [] selections){
        int bSelectionCounter = 0;

        
        for(int index = 3; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("B")){
                bSelectionCounter++;
            }
        }
        
        return bSelectionCounter;
    }  
    
    public static String [] judgingOrPerceptiveSelection(String [] selections, String [][] questions){
        String [] judgingOrPerceptiveSelection = new String[5];
        int counter = 0;
        
        for(int index = 3; index < selections.length; index += 4){
            String selectedChoice = selections[index];
            if(selectedChoice.equals("A")){
                judgingOrPerceptiveSelection[counter] = getFirstElementIn(questions, index);
                counter++;
            }
            else if(selectedChoice.equals("B")){
                judgingOrPerceptiveSelection[counter] = getSecondElementIn(questions, index);
                counter++;
            }
        }
        
        return judgingOrPerceptiveSelection;
    }
    
    public static String getPersonalityDescription(String [] personalityTypes, String personalityType){
        String description = "";
        
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
}
























