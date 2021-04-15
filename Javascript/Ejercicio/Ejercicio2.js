    
      process.stdout.write("please enter the value in A");
      process.stdin.on('data',async function(data1) {
        const a = await parseFloat(data1.toString());
        process.stdout.write("please enter the value in B");
        process.stdin.on('data', function(data2) {
        const b = parseFloat(data2.toString());
        let sum = 0;
        let subtraction = 0;
        let multiply = 0;
        let divide = 0;
        sum = a + b;
        subtraction = a - b;
        multiply = a * b;
        if (b != 0) {
            divide = a / b;
            process.stdout.write(`THE DIVIDE IS EQUAL TO = ${divide} \n`);
        } else
            process.stdout.write(`Division by zero is undefined`);
        
        process.stdout.write(`THE SUM IS EQUAL TO = ${sum} \n`);
        process.stdout.write(`THE SUBTRACTION IS EQUAL TO = ${subtraction} \n`);
        process.stdout.write(`THE MULTIPLYCATION IS EQUAL TO = ${multiply} \n`);
        process.exit();
        })
    });
    
    
    
    
    
    
    