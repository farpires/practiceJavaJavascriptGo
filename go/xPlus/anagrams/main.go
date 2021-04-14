package main

import (
	"fmt"
	"strings"
)

func main() {
	var pString1 string = "Hola"
	var pString2 string = "aloH"
	fmt.Println(genAnagrams(pString1, pString2))
}

func genAnagrams(p1 string, p2 string) string {
	var pAux1 string
	var pAux2 string
	if len(p1) != len(p2) {
		return "no es anagrams"
	}

	for j := 0; j < len(p2); j++ {
		if strings.Count(p2, string(p1[j])) > 1 {
			pAux1 = strings.Replace(p2, string(p1[j]), "", 1)
		}
		if strings.Count(p1, string(p2[j])) > 1 {
			pAux2 = strings.Replace(p1, string(p2[j]), "", 1)
		}
	}

	if len(pAux1) != len(pAux2) {
		return "no es anagrams"
	}

	for i := 0; i < len(pAux1); i++ {
		if !strings.Contains(pAux2, string(pAux1[i])) {
			return "no es Anagrams"
		}
	}
	return "si es anagrams"
}
