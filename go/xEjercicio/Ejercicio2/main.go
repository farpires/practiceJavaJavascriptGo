package main

import (
	"fmt"
)

func main() {

	var A float32
	var B float32

	fmt.Print("please enter the value in A ")
	fmt.Scanln(&A)

	fmt.Print("please enter the value in B ")
	fmt.Scanln(&B)

	var sum float32 = A + B
	var subtraction float32 = A - B
	var multiply float32 = A * B

	fmt.Print("THE SUM IS EQUAL TO = ", sum, "\n")
	fmt.Print("THE SUBTRACTION IS EQUAL TO = ", subtraction, "\n")
	fmt.Print("THE MULTIPLYCATION IS EQUAL TO = ", multiply, "\n")

	if B != 0 {
		var divide = A / B
		fmt.Print("THE DIVIDE IS EQUAL TO = ", divide, "\n")
	} else {
		fmt.Print("Division by zero is undefined \n")
	}

}
