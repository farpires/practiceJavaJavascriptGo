
  function solutionEjercicio(S,T) {
    if(S.length !== T.length){
        return false
    }
    const newArr1=[];
    const newArr2=[];
    // 1_ colocamos en un array por caracteres
    for (var i = 0; i < S.length; i++) {
        newArr1[i] = S[i];
        newArr2[i] = T[i];
    }

    // 2_ se saca los caracteres repetido
    newArrStringS = [...new Set(newArr1)];
    newArrStringT = [...new Set(newArr2)];
    
    // 3_  verifica cuanto caracteres hay SI HAY DIFERENCIA significa que no estan iguales 
    // ya que no estan usando la misma cantidad de letra para formar entre si 
    if(newArrStringS.length !== newArrStringT.length){
        return false
    }

    // 4_ se verifica entre una palabra si se repite en los caracteres
    let contador=0;
    for (let i = 0; i < newArrStringS.length; i++) {
        const index = newArrStringT.indexOf(newArrStringS[i]);
        if (index > -1) {
            contador++; // cuenta caracteres se repiten
        } 
    }
    // 5 verifica si la palabra coinside con el tamano de caracteres encontrado
    if(contador === newArrStringS.length){
        return true;
    }
}

console.log(solutionEjercicio('alameda','alamede'));


