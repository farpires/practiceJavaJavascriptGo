package main

import (
	"fmt"
)

func main() {
	var base float32
	var height float32

	fmt.Print("please enter the base of the triangle = ")
	fmt.Scanln(&base)

	fmt.Print("please enter the height of the triangle = ")
	fmt.Scanln(&height)

	squareSurface(base, height)

}

func squareSurface(base float32, height float32) {
	var superface float32 = base * height / 2
	fmt.Print("\n THE SURFACE OF SQUARE IS = ", superface, "\n")
}
