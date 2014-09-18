make: scanner/Lab05Scanner.java scanner/Lab05Scanner.class Lab05.class

scanner/Lab05Scanner.java: scanner/Lab05Scanner.g
	java org.antlr.v4.Tool scanner/Lab05Scanner.g

scanner/Lab05Scanner.class: scanner/Lab05Scanner.java
	javac scanner/Lab05Scanner.java

Lab05.class: Lab05.java
	javac Lab05.java

clean:
	rm -rf *~ *.class
	rm -rf scanner/*.java scanner/*.class scanner/*~ scanner/*.tokens
