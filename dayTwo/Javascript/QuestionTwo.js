let valueOfX = 2;
let valueOfY = 5;
let valueOfZ = 3;


let mean = Math.floor((valueOfX + valueOfY + valueOfZ) / 3);

console.log(mean);

if(mean == valueOfX){
    console.log("Mean = x");
}
if(mean == valueOfY){
    console.log("Mean = y");
}
if(mean == valueOfZ){
    console.log("Mean = z");
}
    
let median = 0;

if(valueOfX < valueOfY && valueOfX < valueOfZ){
    if(valueOfY < valueOfZ){
        median = valueOfY;
    }
    if(valueOfZ < valueOfY){
        median = valueOfZ;
    }
}

if(valueOfY < valueOfX && valueOfY < valueOfZ){
    if(valueOfX < valueOfZ){
        median = valueOfX;
    }
    if(valueOfZ < valueOfX)
        median = valueOfZ;
}

if(valueOfZ < valueOfX && valueOfZ < valueOfY){
    if(valueOfY < valueOfX){
        median = valueOfY;
    }
    if(valueOfX < valueOfY){
        median = valueOfX;
    }
}

console.log(median);
       
if(median == valueOfX){
    console.log("Median = x");
}
if(median == valueOfY){
    console.log("Median = y");
}
if(median == valueOfZ){
    console.log("Median = z");
}
