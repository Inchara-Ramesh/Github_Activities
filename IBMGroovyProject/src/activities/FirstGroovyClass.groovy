package activities;

public class FirstGroovyClass {
	

	    static void main(def args){
	        def mylist= [1,2,"Lars","4"]
	       mylist.each{ println it }
		   
			def a = 0, b= 1, n = 10;
			print a
			n.times {
			  (a,b) = [b,a+b]
			  print "," + a
			}
			
			def name = "Raghav"
			println "Name is ${name}"
			
	
			
			def arr = [1, 2, 3]
			println arr - 2
			
			
			def num = 10
			println num.getClass().getName()
			
			def rint = 1..10
			println(rint.getTo())
			
			def text = "John Jimbo jingeled happily ever after."
			
			//Store the result in a variable
			def x = text =~ /\S+er\b/
				
			//find() returns true/false
			println x.find() //true
				
			//findAll returns a list of all matches
			println x.findAll() //[ever, after]
			
						
				
	    }


}
