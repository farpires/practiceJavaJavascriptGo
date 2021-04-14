    //ejercico de anagram : encontrar todos los anagramas 

let Pstring1 = 'Hola'
let Pstring2 = 'aloH'
let ArrayString = ['more','rome','emor','cryptos','crypto'];

let genAnagrams = (P1, P2 )=>{
let characteP2 = P2.split("")
let AuxP2;
for (let i = 0; i < P1.length; i++) {
    AuxP2 = characteP2.filter(e=>e!==P1[i]);
    characteP2=AuxP2
}
if (AuxP2==0) {
    return "es Anagrams"
} else{
    return "no es Anagrams"
}
};

//primera funcion
// console.log(genAnagrams(Pstring1, Pstring2));

let compareTwoElementsArray = (P1,P2)=>{
    if (P1.length != P2.length ) {
        return false
    } 
    let characteP2 = P2.split("")
    let AuxP2;
    for (let i = 0; i < P1.length; i++) {
        AuxP2 = characteP2.filter(e=>e!==P1[i]);
        characteP2=AuxP2
    }
    if (AuxP2==0) {
        return true
    } else{
        return false
    }
};

let compareAddTheLastItem= (P1,P2)=>{
    let flag = false;
    let PArrayBig=[];
    let PArraySmall=[];
    if((P1.length-1 == P2.length)||(P2.length-1 == P1.length)){
        flag = true
        if (P1.length > P2.length) {
            PArrayBig = P1;
            PArraySmall = P2;
        } else {
            PArrayBig = P2;
            PArraySmall = P1;
        }
    }
    if (flag) {
        for (let i = 0; i < PArrayBig.length; i++) {
            if(PArrayBig[i] != PArraySmall[i] ){
                if(typeof PArraySmall != 'undefined'){
                    return true
                }
            }
        }
    } else{
        return flag;
    }
}


let anagramsArray=(PArray)=>{
    let ArrayStringAux = [];
    for (let i = 0; i < PArray.length-1; i++) {
        if(compareTwoElementsArray(PArray[i],PArray[i+1])){ 
            if((ArrayStringAux.indexOf(PArray[i])) == -1){
                ArrayStringAux.push(PArray[i]);
            }
            PArray[i+1] = PArray[i];
        } else {
            if(compareAddTheLastItem(PArray[i],PArray[i+1])){
                ArrayStringAux.push(PArray[i+1]);
            } else {
                ArrayStringAux.push(PArray[i+1]);
            }
        }
    }
    return ArrayStringAux
}


//segnuda funcion conbinada
console.log(anagramsArray(ArrayString));