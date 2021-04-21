package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var stringTxtOne string
	var stringTxtTwo string
	reader := bufio.NewReader(os.Stdin)
	fmt.Println("please enter the text string  =  ")
	stringTxtOne, err := reader.ReadString('\n')
	if err == nil {
		fmt.Println(err)
	} else {
		fmt.Println("String One = ", string(stringTxtOne))
	}

	fmt.Println("please enter the text string  =  ")
	readerTwo := bufio.NewReader(os.Stdin)
	stringTxtTwo, e := readerTwo.ReadString('\n')
	if e == nil {
		fmt.Println(e)
	} else {
		fmt.Println("String Two = ", string(stringTxtTwo))
	}

	exercise10_1(stringTxtOne, stringTxtTwo)
	exercise10_2(stringTxtOne, stringTxtTwo)
	exercise10_3(stringTxtOne, stringTxtTwo)

}

func exercise10_1(stringTxtOne string, stringTxtTwo string) {
	allVowelsm := [5]string{"a", "e", "i", "o", "u"}
	allVowelsM := [5]string{"A", "E", "I", "O", "U"}

	contVowellsOne := 0
	contVowellsTwo := 0

	for i := 0; i < len(stringTxtOne); i++ {
		for j := 0; j < len(allVowelsm); j++ {
			if string(stringTxtOne[i]) == allVowelsm[j] || string(stringTxtOne[i]) == allVowelsM[j] {
				contVowellsOne++
			}
		}
	}
	for k := 0; k < len(stringTxtTwo); k++ {
		for l := 0; l < len(allVowelsm); l++ {
			if string(stringTxtTwo[k]) == allVowelsm[l] || string(stringTxtTwo[k]) == allVowelsM[l] {
				contVowellsTwo++
			}
		}
	}

	if contVowellsOne > contVowellsTwo {
		fmt.Print("the first word contains more vowels than the second \n")
	} else {
		fmt.Print("the second word contains more vowels than the first \n")
	}

}

func exercise10_2(stringTxtOne string, stringTxtTwo string) {
	flagEqual := false
	for l := 0; l < len(stringTxtOne); l++ {
		if string(stringTxtOne[l]) != string(stringTxtTwo[l]) {
			flagEqual = true
			break
		}
	}

	if !flagEqual {
		fmt.Print("the text strings are the equals \n")
	} else {
		fmt.Print("the text strings are not the equals \n")
	}
}

func exercise10_3(stringTxtOne string, stringTxtTwo string) {
	flagCapicua := false

	for m := 0; m < len(stringTxtOne); m++ {
		if string(stringTxtOne[m]) != string(stringTxtTwo[(len(stringTxtOne)-1)]-1) {
			flagCapicua = true
		}
	}

	if flagCapicua {
		fmt.Print("the text strings are not capicua \n")
	} else {
		fmt.Print("the text strings are capicua \n")
	}
}
