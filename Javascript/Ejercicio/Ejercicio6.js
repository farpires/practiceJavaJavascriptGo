    
      process.stdout.write("Please enter the value in pesos that you want to convert");
      process.stdin.on('data',async function(data1) {
        const pesoArg = await parseFloat(data1.toString());
        const dolar = 140;
        const euro = 120;
        const real = 12;
        const valueDolar = pesoArg / dolar;
        const valueEuro = pesoArg / euro;
        const valueReal = pesoArg / real;
        process.stdout.write(`THE VALUE OF ${pesoArg} PEOS ITS CORRESPONDING VALUE IN`);
        process.stdout.write(`DOLAR = ${valueDolar} \n`);
        process.stdout.write(`EURO = ${valueEuro} \n`);
        process.stdout.write(`REAL = ${valueReal} \n`);
        process.exit();
    });
    