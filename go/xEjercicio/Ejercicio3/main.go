package main

import (
	"fmt"
)

func main() {
	fmt.Println("hello word")

	var amount int

	fmt.Print("enter the amount of day")
	fmt.Scanln(&amount)

	var hours int = amount * 24
	var minutes int = hours * 60
	var second int = minutes * 60

	fmt.Println(amount, " day has ", hours, " hour has ", minutes, " minutes with ", second, " second ")

}
