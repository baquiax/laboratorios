make: Lab02.java Lab02.class Main.class

Main.class: Main.java
	javac Main.java

Lab02.class: Lab02.java
	javac Lab02.java

Lab02.java: Lab02.g
	java org.antlr.v4.Tool Lab02.g

clean:
	rm -rf Lab02.java *~ *.class *.tokens

