def likes(names):
    String reply = ""
    
    if(len(names) == 0):
        reply = "no one likes this":
    elif(len(names) == 1):
        reply = reply + names[0] + " likes this"
    else:
        for count in range(len(names)):
            if(count < len(names) - 1):
                reply = reply + names[count] + ", "
            
            if(count == (len(names) - 1)):
                reply = reply + "and " + names[count]
            
        
        
        reply = reply + " likes this";
    
    
    return reply
