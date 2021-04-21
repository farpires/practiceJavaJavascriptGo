package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	var textString string
	// fmt.Print("please enter the text string  =  ")
	// fmt.Scanln(&textString)
	reader := bufio.NewReader(os.Stdin)
	fmt.Println("please enter the text string  =  ")
	textString, err := reader.ReadString('\n')
	if err == nil {
		fmt.Println(err)
	} else {
		fmt.Println("hola = ", textString)
	}

	exercise9_1(textString)
	exercise9_2(textString)
	exercise9_3(textString)
	exercise9_4(textString)
	exercise9_5(textString)
	exercise9_6(textString)
	exercise9_7(textString)
	exercise9_8(textString)
	exercise9_9(textString)
	exercise9_10(textString)
	exercise9_11(textString)
}

func exercise9_1(textString string) {
	var longTxt int = len(textString)
	fmt.Print("\n 1_ the length of the string is  ", longTxt, "\n")
}

func exercise9_2(textString string) {
	var firstCharacter string = string(textString[0])
	fmt.Print("\n  2_ the first character of the string is ", firstCharacter, "\n")
}

func exercise9_3(textString string) {
	var latestCharacter string = string(textString[len(textString)-1])
	fmt.Print("\n  3_ the latest character of the string is ", latestCharacter, "\n")
}

func exercise9_4(textString string) {
	fmt.Print("\n 4_ print each character in the string -------------------- \n")
	for i := 0; i < len(textString); i++ {
		fmt.Print("character in position ", i, " is = ", string(textString[i]), "\n")
	}
}

func exercise9_5(textString string) {

	fmt.Print("\n 5_determine how many times letters A and E are repeated \n")
	var contCharacterA int = 0
	var contCharacterE int = 0
	for i := 0; i < len(textString); i++ {
		if string(textString[i]) == "A" || string(textString[i]) == "a" {
			contCharacterA++
		}
		if string(textString[i]) == "E" || string(textString[i]) == "e" {
			contCharacterE++
		}
	}
	if contCharacterA > contCharacterE {
		fmt.Print("the letter A appears more than the letter E\n")
	} else {
		if contCharacterA < contCharacterE {
			fmt.Print("the letter E appears more than the letter A\n")
		} else if contCharacterA == contCharacterE {
			fmt.Print("the letter A and the letter B appear in the equal amount\n")
		}

	}
}

func exercise9_6(textString string) {
	reverseString := ""
	for i := 0; i < len(textString); i++ {
		reverseString += string(textString[(len(textString)-1)-i])
	}
	fmt.Print("6_ print string txt reverse = \n")
	fmt.Print(reverseString)
}

func exercise9_7(textString string) {
	flag := false
	contFound := 0
	for k := 0; k < len(textString); k++ {
		if string(textString[k]) == "o" || string(textString[k]) == "O" {
			contFound++
			if contFound == 2 {
				flag = true
				break
			}
		}
	}

	if flag {
		fmt.Print("\n I found the second letter O and I'm going to stop \n")
	}
}

func exercise9_8(textString string) {
	allVowelsm := [5]string{"a", "e", "i", "o", "u"}
	allVowelsM := [5]string{"A", "E", "I", "O", "U"}
	contVowells := 0

	for l := 0; l < len(textString); l++ {
		for m := 0; m < len(allVowelsm); m++ {
			if string(textString[l]) == allVowelsm[m] || string(textString[l]) == allVowelsM[m] {
				contVowells++
			}
		}
	}

	if contVowells == len(allVowelsM) {
		fmt.Print("\n this phrase has all five vowels present\n")
	}
}

func exercise9_9(textString string) {
	contB := 0
	contC := 0
	contA := 0
	acumB := 0
	acumA := 0
	acumC := 0
	acumTotal := 0

	for n := 0; n < len(textString); n++ {
		if string(textString[n]) == "A" || string(textString[n]) == "a" {
			contA++
			acumA = 10 + acumA
			acumTotal = 10 + acumTotal
		}
		if string(textString[n]) == "C" || string(textString[n]) == "c" {
			contC++
			acumC = 15 + acumC
			acumTotal = 15 + acumTotal
		}
		if string(textString[n]) == "B" || string(textString[n]) == "b" {
			contB++
			acumB = 20 + acumB
			acumTotal = 20 + acumTotal
		}
	}

	fmt.Print("\n The scores for times found by letter is: \n")
	fmt.Print("\n A = ", acumA, " , the times it appeared were: ", contA, " \n")
	fmt.Print("\n C = ", acumC, ", the times it appeared were: ", contC, " \n")
	fmt.Print("\n B = ", acumB, ", the times it appeared were: ", contB, " \n")
	fmt.Print("\n the total score is = ", acumTotal, " \n")
}

func foundString(character string, charFound string) bool {
	if (strings.EqualFold(charFound, strings.ToUpper(charFound))) || (strings.EqualFold(charFound, strings.ToLower(charFound))) {
		return true
	} else {
		return false
	}
}

func exercise9_10(textString string) {
	flagG := false
	flagO := false
	flagL := false
	for o := 0; o < len(textString); o++ {
		if (flagG == true) && (flagL == false) {
			if flagO == true {
				if flagL == false {
					if foundString(string(textString[o]), "L") {
						flagL = true
						break
					} else {
						if foundString(string(textString[o]), "G") == false {
							flagO = false
						}
					}
				}
			} else {
				flagO = foundString(string(textString[o]), "O")
				if flagO == false {
					if foundString(string(textString[o]), "G") == false {
						flagG = false
					}
				}
			}
		} else {
			fmt.Print(foundString(string(textString[o]), "G"))
			flagG = foundString(string(textString[o]), "G")
		}
	}

	if flagG && flagO && flagL {
		fmt.Print("\n If found, the word \n")
	}

}

func exercise9_11(textString string) {

	flagStringC := false
	flagStringD := false
	flagStringF := false

	characterToFound := [3]string{"C", "D", "F"}

	for p := 0; p < len(textString); p++ {
		for q := 0; q < len(characterToFound); q++ {

			if (string(textString[p]) == characterToFound[0]) && !flagStringC {
				flagStringC = true
			}
			if (string(textString[p]) == characterToFound[1]) && flagStringC {
				flagStringD = true
			}
			if (string(textString[p]) == characterToFound[2]) && flagStringD {
				flagStringF = true
			}
		}
	}

	if flagStringC && flagStringD && flagStringF {
		fmt.Print("\n If found, the characters C D F \n")
	}
}
