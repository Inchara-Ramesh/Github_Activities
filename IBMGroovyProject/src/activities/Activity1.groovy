package activities

class Activity1 {
		
			static void main(args) {
				
				def x //In Groovy
				int y //In Java
				
				//Array
				def arr = [1, 2.0, "Saahil", true, x, y]
				
				arr.each { println "Value is: " + it +". Data type is: " + it.getClass() }
			}
}
