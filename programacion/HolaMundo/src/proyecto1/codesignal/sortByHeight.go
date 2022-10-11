package main

import "fmt"

func main() {

	heights := []int{-1, 150, 190, 170, -1, -1, 160, 180}

	Bubble(heights)

	fmt.Println(heights)

}

func BubbleWithCondition(arr []int) []int {
	swapped := true
	for i := 0, i < len(arr)-1; i++ {
		swapped = false

		
	}
}

func Bubble(arr []int) []int {
	swapped := true
	for swapped {
		swapped = false
		for i := 0; i < len(arr)-1; i++ {
			fmt.Println(arr[i])
			if arr[i+1] < arr[i] {
				arr[i+1], arr[i] = arr[i], arr[i+1]
				swapped = true
			}
		}
	}
	return arr
}
