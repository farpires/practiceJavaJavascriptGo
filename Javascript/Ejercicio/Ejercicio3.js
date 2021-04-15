    
      process.stdout.write("enter the amount of day ");
      process.stdin.on('data',async function(data1) {
        const amount = await parseFloat(data1.toString());
        let hours = amount * 24;
        let minutes = hours * 60;
        let second = minutes * 60;
        process.stdout.write(amount +" day has " + hours + " hour has " + minutes + " minutes with " + second + " second \n");
        process.exit();
    });
    
    
    