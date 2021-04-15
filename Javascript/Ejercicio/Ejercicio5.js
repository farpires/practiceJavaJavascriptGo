    
      process.stdout.write("please enter the value in A ");
      process.stdin.on('data',async function(data1) {
        const n = await parseInt(data1.toString());
    
        let number = n % 2;
        
        if (number == 0) {
            console.log(`the number ${n} is pair`);
        } else {
            console.log(`the number ${n} is odd`);
        }
        process.exit();
    });
    
