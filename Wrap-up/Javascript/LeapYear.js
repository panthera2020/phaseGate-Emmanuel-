for(let years = 1900; years <= 2025; years++){
    if(years % 4 == 0 && years % 100 != 0 || years % 400 == 0){
        console.log(years + " ");
    }
}
