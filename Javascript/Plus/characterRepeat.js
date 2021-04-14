

const repeatedLetter = ( cadena, caracter )=>{
    let cont=0;
    for (let i = 0; i < cadena.length; i++) {
        if (cadena[i] == caracter) {
            cont++;
        }
    }
    return cont;
}

const letterMajorRepetition=(cadena)=>{
    let cont=0;
    let mayor = 0;
    let index=0;
    for (let i = 0; i < cadena.length; i++) {
        let cantRepet = repeatedLetter(cadena,cadena[i]);
        if(cantRepet>mayor){
            mayor = cantRepet;
            index=i;
        }
    }
    return ' La letra con mayor repeticion es : '+cadena[index]+' se repeticio : '+mayor+' veces';
}

console.log(letterMajorRepetition('holaaaaaa mundo'));