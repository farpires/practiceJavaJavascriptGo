
    const searchResult=(a,b,c)=>{
        let sum = 0;
        sum = a + b;
        if (sum == c) {
          process.stdout.write(`\n THE SUM OF ${a} AND ${b} EQUALS ${c} \n`);
        } else
          process.stdout.write(`\nTHE SUM OF ${a} AND ${b} IS NOT EQUALS ${c} \n`);
    }

    let b2;
    let c2;
    
    process.stdout.write("please enter the value in A = \n");
    process.stdin.on('data',async function(data1) {
      const a = await parseFloat(data1.toString());
      if(typeof b2 == 'undefined' ){
        console.log("please enter the value in B = ")
        b2 =1;
      };
      process.stdin.on('data',async function(data2) {
      const b = await parseFloat(data2.toString());
      if(typeof c2 == 'undefined'){
        console.log("please enter the value in C = ")
        c2=1;
      } 
      process.stdin.on('data',async function(data3) {
      const c = await parseFloat(data3.toString());
      searchResult(a,b,c);
      process.exit();
      });
      });
  });
  
  
  
  
  