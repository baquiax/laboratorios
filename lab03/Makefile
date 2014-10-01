make: scanner/Lab03Scanner.java scanner/Lab03Scanner.class Lab03.class

Lab03.class: Lab03.java
	javac Lab03.java

scanner/Lab03Scanner.class: scanner/Lab03Scanner.java
	javac scanner/Lab03Scanner.java

scanner/Lab03Scanner.java: scanner/Lab03Scanner.g
	java org.antlr.v4.Tool scanner/Lab03Scanner.g

clean:
	rm -rf *~ *.class 
	rm -rf scanner/*.java scanner/*.class scanner/*~ scanner/*.tokens
	

