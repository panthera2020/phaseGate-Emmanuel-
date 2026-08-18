let likes=(names)=>{
    let reply = "";
    
    if(names.length == 0){
        reply = "no one likes this";
    }else if(names.length == 1){
        reply = reply + names[0] + " likes this";
    }else if (names.length > 1 && names.length <= 3){
        for(let count = 0; count < names.length; count++){
            if(count < names.length - 1){
                reply = reply + names[count] + ", ";
            }
            if(count == (names.length - 1)){
                reply = reply + "and " + names[count];
            }
        }
        
        reply = reply + " likes this";
    }else{
        reply = reply + names[0] + ", " + names[1] + " and " + names.length - 2 +" others likes this";
    }
    
return reply;
}



friends = ["Jacob", "Joseph"]

console.log(likes(friends))
