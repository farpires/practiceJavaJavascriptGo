
    const resultstringTxt= async(stringTxtOne,stringTxtTwo)=>{
        // 1 -
        const arrayStringOne =  stringTxtOne.split("");
        const arrayStringTwo =  stringTxtTwo.split("");
        arrayStringOne.pop();
        arrayStringTwo.pop();
        const allVowelsm = ["a","e","i","o","u"];
        const allVowelsM = ["A","E","I","O","U"];

        let contVowellsOne = 0;
        let contVowellsTwo = 0;
        
        for (let i = 0; i < arrayStringOne.length; i++) {
          for (let j = 0; j < allVowelsm.length; j++) {
            if (arrayStringOne[i] == allVowelsm[j] || arrayStringOne[i] == allVowelsM[j] ) {
              contVowellsOne++;
            }
          }
        }

        for (let k = 0; k < arrayStringTwo.length; k++) {
          for (let l = 0; l < allVowelsm.length; l++) {
          if (arrayStringTwo[k] == allVowelsm[l] || arrayStringTwo[k] == allVowelsM[l] ) {
            contVowellsTwo++;
          }  
          }
        }

        if (contVowellsOne > contVowellsTwo) {
          process.stdout.write("the first word contains more vowels than the second \n");
        }

        if (contVowellsOne < contVowellsOne) {
          process.stdout.write("the second word contains more vowels than the first \n");
        }

        // -2 
        let flagEqual= false
        for (let l = 0; l < arrayStringOne.length; l++) {
          // for (let m = 0; m < arrayStringTwo.length; m++) {
              if (arrayStringOne[l] != arrayStringTwo[l]) {
                flagEqual = true;
                break;
              }
          // }
        }
        console.log(flagEqual);
      if(!flagEqual){
        process.stdout.write("the text strings are the equals \n");  
      } else {
        process.stdout.write("the text strings are not the equals \n"); 
      }

      // -3
      let flagCapicua = false;
      for (let m = 0; m < arrayStringOne.length; m++) {
        if(arrayStringOne[m] != arrayStringTwo[(arrayStringOne.length-1)-m]){
              flagCapicua = true;
        }
      }
      if(flagCapicua){
        process.stdout.write("the text strings are not capicua \n"); 
      } else {
        process.stdout.write("the text strings are capicua \n");  
      }
  
    }

   
    let b2;
    process.stdout.write("please enter the value in A = \n");
    process.stdin.on('data',function(data1) {
      const stringTxtOne = data1.toString();
      if(typeof b2 == 'undefined' ){
        console.log("please enter the value in B = ")
        b2 =1;
      };
      process.stdin.on('data',async function(data2) {
      const stringTxtTwo = data2.toString();
      resultstringTxt(stringTxtOne, stringTxtTwo);
      });
  });
  