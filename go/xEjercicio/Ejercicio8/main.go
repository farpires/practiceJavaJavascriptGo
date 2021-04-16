package main

import (
	"fmt"
	"math"
)

func main() {

	var number float64

	fmt.Print("please enter the number = ")
	fmt.Scanln(&number)
	resultOperation(number)

}

func resultOperation(number float64) {

	square := math.Pow(number, 2)
	squareRoot := math.Sqrt(number)
	cubeRoot := math.Pow(number, 1.0/3.0)

	fmt.Print("\n tha oprationes of ", number, " are  \n")
	fmt.Print("\n SQUARE IS = ", square, "\n")
	fmt.Print("\n SQUARE ROOT IS = ", squareRoot, " \n ")
	fmt.Print("\n CUBE ROOT IS = ", cubeRoot, "\n")
}
