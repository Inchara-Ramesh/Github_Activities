package activities

class Activity5 {
		static void main(args) {
			
			def fullList = [11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
			
			//Strings List
			def strList = fullList.minus([11, 2, 19, 5])
			//Integers List
			def intList = fullList.minus(["Mango", "Apple", "Watermelon"])
			
			//Sort both lists and print them
			println "Sorted String list: ${strList.sort()}"
			println "Sorted Integer list: ${intList.sort()}"
		}

}
