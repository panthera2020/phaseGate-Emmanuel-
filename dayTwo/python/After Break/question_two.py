
def grade(first_score,second_score,third_score):
    
    if(first_score > -1 and second_score > -1 and third_score > -1):
        average = (first_score + second_score + third_score) / 3
        
        if(average >= 90 and average <= 100):
            return 'A'
        elif(average >= 80 and average < 90):
            return  'B'
        elif(average >= 70 and average < 80):
            return  'C'
        elif(average >= 60 and average < 70):
            return  'D'
        elif(average >= 0 and average < 60):
            return  'F'
    

