package main

import (
	"fmt"
)

func main() {
	var A int

	fmt.Print("please enter the value in A ")
	fmt.Scanln(&A)

	resultParOrOdd(A)

}

func resultParOrOdd(p1 int) {
	var number int = p1 % 2
	if number == 0 {
		fmt.Print(" the number ", p1, " is pair \n")
	} else {
		fmt.Print("the number ", p1, " is odd \n")
	}
}
