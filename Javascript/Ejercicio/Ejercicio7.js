
    const squareSurface=(base,height)=>{
        const superface = base * height / 2;
          process.stdout.write(`\n THE SURFACE OF SQUARE IS = ${superface}\n`);
    }

    let b2;
    
    process.stdout.write("please enter the base of the triangle \n");
    process.stdin.on('data',async function(data1) {
      const base = await parseFloat(data1.toString());
      if(typeof b2 == 'undefined' ){
        console.log("please enter the height of the triangle")
        b2 =1;
      };
      process.stdin.on('data',async function(data2) {
      const height = await parseFloat(data2.toString());
      squareSurface(base,height);
      });
  });
  
  
  