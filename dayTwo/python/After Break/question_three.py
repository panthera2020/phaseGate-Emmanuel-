def likes(names):
    String reply = ""
    
    if(len(names) == 0):
        reply = "no one likes this":
    elif(len(names) == 1):
        reply = reply + names[0] + " likes this"
    elif (len(names) > 1 and len(names) <= 3):
        for count in range(len(names)):
            if(count < len(names) - 1):
                reply = reply + names[count] + ", "
            
            if(count == (len(names) - 1)):
                reply = reply + "and " + names[count]
            
        
        
        reply = reply + " likes this";
    else:
        reply = reply + names[0] + ", " + names[1] + " and " + names.length - 2 +" others likes this"
    
    
    return reply
    
    
friends = ["Alex", "Jacob"];
