def father_age_difference(fatherAge,sonAge):
    years_ago = (fatherAge - (2 * sonAge))
    if(years_ago < 0):
        years_ago *= -1
    
    return years_ago
    
