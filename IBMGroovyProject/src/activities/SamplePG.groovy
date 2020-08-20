package activities

class SamplePG {

static main(args) {
    def birds = ["Parrot", "Cockatiel", "Pigeon"]
    def birdsWithoutParrot = birds - "Parrot"
    def numbers = [32, 44, 12, 9, 100, 180]
    
    def list = ["Lars", "Ben", "Jack"]
    
    //prints 0 to 4
    5.times {println "Times + $it "}
    //prints 1 to 3
    1.upto(3) {println "Up + $it "}
    //prints 4 to 1
    4.downto(1) {println "Down + $it "}
	
	def endpoint = 'https://ap16.salesforce.com/services/Soap/c/49.0/00D2w000007uXQY'
	def x = endpoint.size()
	println(x)
	println(endpoint.substring(0, x-16))

    
    //Sum of 100 numbers
    def sum = 0
    1.upto(100) {sum += it}
    println "Sum = " + sum

def name = "John"
def s1 = "Hello $name" // $name will be replaced
def s2 = 'Hello $name' // $name will not be replaced
println s1
println s2

//print type of variable
println s1.getClass()
println s2.getClass()

// demonstrates object references and method calls
def date = new Date()
println "We met at $date"

def rint = 1..10

        //contains()
        println(rint.contains(2)) //true
        println(rint.contains(11)) //false

        //get()
        println(rint.get(4)) //5
        println(rint.get(9)) //10

        //getFrom and getTo()
        println(rint.getFrom()) //1
        println(rint.getTo()) //10

        //size()
        println(rint.size()) //10

//using a variable assignment
list.each{firstName->
    println firstName
}
//using the it variable
list.each{println it}
    
    println numbers.max() // 180
    println numbers.min() // 9
    
    
    println birds.max { it.size() } // Cockatiel
    println birds.min { it.size() } // Parrot
    println birds.getAt(1)
    println birds[-1]
    
    println birds // [Parrot, Cockatiel, Pigeon]
    println birdsWithoutParrot // [Cockatiel, Pigeon]
}

}