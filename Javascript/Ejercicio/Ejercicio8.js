
    const resultOperation=(number)=>{

        const square = Math.pow(number,2);
        const squareRoot = Math.sqrt(number);
        const cubeRoot = Math.pow(number,1/3);

        process.stdout.write(`\n tha oprationes of ${number} are  \n`);
        process.stdout.write(`\n SQUARE IS = ${square}\n`);
        process.stdout.write(`\n SQUARE ROOT IS = ${squareRoot}\n`);
        process.stdout.write(`\n CUBE ROOT IS = ${cubeRoot}\n`);
    }


    process.stdout.write("please enter the number = ");
    process.stdin.on('data',async function(data1) {
      const number = await parseFloat(data1.toString());
      resultOperation(number)

  });
  
  
  