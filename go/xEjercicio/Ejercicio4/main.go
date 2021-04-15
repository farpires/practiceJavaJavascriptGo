package main

import (
	"fmt"
)

func main() {
	var A int
	var B int
	var C int

	fmt.Print("please enter the value in A ")
	fmt.Scanln(&A)

	fmt.Print("please enter the value in B ")
	fmt.Scanln(&B)

	fmt.Print("please enter the value in C ")
	fmt.Scanln(&C)

	resultCompare(A, B, C)

}

func resultCompare(p1 int, p2 int, p3 int) {
	var sum int = 0
	sum = p1 + p2
	if sum == p3 {
		fmt.Print("\n THE SUM OF ", p1, " AND ", p2, " EQUALS ", p3, " \n")
	} else {
		fmt.Print("\n THE SUM OF ", p1, " AND ", p2, " IS NOT EQUALS ", p3, " \n")
	}
}
