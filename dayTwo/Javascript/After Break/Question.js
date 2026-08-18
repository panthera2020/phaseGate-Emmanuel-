let fatherAgeTimeDifference=(fatherAge,sonAge)=>{
    let yearsAgo = Math.abs(fatherAge - (2 *sonAge));
    return yearsAgo;
    }
    
let ageDifference = fatherAgeTimeDifference(30,10);

console.log(ageDifference);
