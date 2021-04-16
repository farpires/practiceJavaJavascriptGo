package main

import (
	"fmt"
)

func main() {
	var pesoArg float32
	fmt.Print("Please enter the value in pesos that you want to convert = ")
	fmt.Scanln(&pesoArg)
	resultChangeCurrency(pesoArg)
}

func resultChangeCurrency(pesoArg float32) {
	var dolar float32 = 140
	var euro float32 = 120
	var real float32 = 12
	var valueDolar float32 = pesoArg / dolar
	var valueEuro float32 = pesoArg / euro
	var valueReal float32 = pesoArg / real

	fmt.Print("THE VALUE OF ", pesoArg, " PEOS ITS CORRESPONDING VALUE IN \n")
	fmt.Print("DOLAR = ", valueDolar, "\n")
	fmt.Print("EURO = ", valueEuro, "\n")
	fmt.Print("REAL = ", valueReal, "\n")
}
