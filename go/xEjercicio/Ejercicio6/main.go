package main

import (
	"fmt"
)

func main() {
	var pesoArg int
	fmt.Print("Please enter the value in pesos that you want to convert = ")
	fmt.Scanln(&pesoArg)
	resultChangeCurrency(pesoArg)
}

func resultChangeCurrency(pesoArg int) {
	var dolar int = 140
	var euro int = 120
	var real int = 12
	var valueDolar int = pesoArg / dolar
	var valueEuro int = pesoArg / euro
	var valueReal int = pesoArg / real

	fmt.Print("THE VALUE OF ", pesoArg, " PEOS ITS CORRESPONDING VALUE IN \n")
	fmt.Print("DOLAR = ", valueDolar, "\n")
	fmt.Print("EURO = ", valueEuro, "\n")
	fmt.Print("REAL = ", valueReal, "\n")
}
