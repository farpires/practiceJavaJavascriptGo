const resultstringTxt= async(stringTxt)=>{
    const arrayCharacter =  stringTxt.split("");
    arrayCharacter.pop()
    const longTxt = arrayCharacter.length
    const firstCharacter = arrayCharacter[0]
    const latestCharacter = arrayCharacter[arrayCharacter.length-1] 
    // 1
    process.stdout.write(`\n 1_ the length of the string is ${longTxt}  \n`);
    // 2
    process.stdout.write(`\n 2_ the first character of the string is ${firstCharacter}  \n`);
    // 3
    process.stdout.write(`\n 3_ the latest character of the string is ${latestCharacter}  \n`);
    // 4
    process.stdout.write(`\n 4_ print each character in the string -------------------- \n`);
    for (let i = 0; i < arrayCharacter.length; i++) {
        process.stdout.write(`character in position ${i} is = ${arrayCharacter[i]}\n`);
    }
    process.stdout.write(`\n ----------------------------------------------------\n`);
    //5
    process.stdout.write(`\n 5_determine how many times letters A and E are repeated \n`);
    let contCharacterA=0;
    let contCharacterE=0;
    for (let i = 0; i < arrayCharacter.length; i++) {
        if(arrayCharacter[i] == 'A' || arrayCharacter[i] == 'a'){
          contCharacterA++;
        }
        if(arrayCharacter[i] == 'E' || arrayCharacter[i] == 'e'){
            contCharacterE++;
          }
    }
    if(contCharacterA > contCharacterE){
        process.stdout.write(`the letter A appears more than the letter E\n`);
    } else {
        if (contCharacterA < contCharacterE) {
            process.stdout.write(`the letter E appears more than the letter A\n`);     
        }else if(contCharacterA == contCharacterE){
            process.stdout.write(`the letter A and the letter B appear in the equal amount\n`);  
        }

    }
    // 6
    let reverseString=[]
    for (let j = 0; j < arrayCharacter.length; j++) {
        reverseString[arrayCharacter.length - (j+1)] = arrayCharacter[j];
    }
    process.stdout.write(`6_ print string txt reverse\n`);
    console.log(reverseString); 
    
    // 7
    let flag = false;
    let contFound = 0;

    for (let k = 0; k < arrayCharacter.length; k++) {
        if(arrayCharacter[k] == 'o' || arrayCharacter[k] == 'O'){
            contFound++;
            if(contFound == 2){    
            flag=true;
            break;
            }
        }
    }
    if (flag) {
        process.stdout.write(`\n I found the second letter O and I'm going to stop \n`);
        // process.exit();
    }
    // 8
    let allVowelsm = ["a","e","i","o","u"];
    let allVowelsM = ["A","E","I","O","U"];
    let contVowells =0;
    for (var l = 0; l < arrayCharacter.length; l++) {
        for (var m = 0; m < allVowelsm.length; m++) {
            if (arrayCharacter[l] == allVowelsm[m] || arrayCharacter[l] == allVowelsM[m] ) {
                contVowells++;
            }
        }
    }

    if(contVowells == allVowelsm.length){
        process.stdout.write(`\n this phrase has all five vowels present\n`);
    }

    // 9
    let contB = 0;
    let contC = 0;
    let contA = 0;
    let acumB = 0; 
    let acumA = 0;
    let acumC = 0;
    let acumTotal = 0;
    for (let n = 0; n < arrayCharacter.length; n++) {
        if (arrayCharacter[n] == 'A' || arrayCharacter[n] == 'a') {
           contA++;
           acumA = 10 + acumA;
           acumTotal= 10 + acumTotal;
        }
        if (arrayCharacter[n] == 'C' || arrayCharacter[n] == 'c') {
            contC++;
            acumC = 15 + acumC;
            acumTotal= 15 + acumTotal; 
        }
        if (arrayCharacter[n] == 'B' || arrayCharacter[n] == 'b') {
            contB++
            acumB = 20 + acumB;
            acumTotal= 20 + acumTotal;
        }
    }
    process.stdout.write(`\n The scores for times found by letter is: \n`);
    process.stdout.write(`\n A = ${acumA} , the times it appeared were: ${contA}\n`);
    process.stdout.write(`\n C = ${acumC} , the times it appeared were: ${contC} \n`);
    process.stdout.write(`\n B = ${acumB} , the times it appeared were: ${contB} \n`);
    process.stdout.write(`\n the total score is = ${acumTotal}\n`);

    let flagG = false;
    let flagO = false;
    let flagL = false;
    
    // 10

    const foundString = (character, charFound)=>{
        console.log(character);
        console.log(charFound);
        if (character == charFound.toUpperCase() || character == charFound.toLowerCase()) {
            return true;
        } else return false;
    }

    for (let o = 0; o < arrayCharacter.length; o++) {
        if(flagG && !flagL){
            if(flagO){
                if (!flagL) {
                    if (foundString(arrayCharacter[o], 'L')) {
                                flagL = true;
                                break;
                    } else {
                        if(foundString(arrayCharacter[o], 'G' == false)){
                        flagO = false
                        }
                    } 
                }
            }else{
                flagO = foundString(arrayCharacter[o], 'O');
                if (!flagO) {
                    if (foundString(arrayCharacter[o], 'G') == false) {
                        flagG = false;
                    }
                }
            }
        } else {
            flagG = foundString(arrayCharacter[o], 'G')
        }
    }
    if(flagG && flagO && flagL){
        process.stdout.write(`\n If found, the word \n`);
    }

    // 11
    flagStringC = false;
    flagStringD = false;
    flagStringF = false;

    let characterToFound = ["C","D","F"];
    for (let p = 0; p < arrayCharacter.length; p++) {
        for (let q = 0; q < characterToFound.length; q++) {
            if((arrayCharacter[p] == characterToFound[0]) && !flagStringC ){
                flagStringC = true
            }
            if ((arrayCharacter[p] == characterToFound[1]) && flagStringC) {
                flagStringD = true;
            } 
            if ((arrayCharacter[p] == characterToFound[2]) && flagStringD) {
                flagStringF = true;
            }
        }
    }

    if(flagStringC && flagStringD && flagStringF){
        process.stdout.write(`\n If found, the characters C D F \n`);
    }    
}


process.stdout.write("please enter the text string  = ");
process.stdin.on('data',async function(data1) {
  const stringTxt = data1.toString();
  resultstringTxt(stringTxt);
});


