make: scanner/JSONLexer.java scanner/JSONLexer.class parser/JSONParser.java parser/JSONParser.class Lab06.class

scanner/JSONLexer.java: scanner/JSONLexer.g
	java org.antlr.v4.Tool scanner/JSONLexer.g

scanner/JSONLexer.class: scanner/JSONLexer.java
	javac scanner/JSONLexer.java

parser/JSONParser.java: parser/JSONParser.g
	java org.antlr.v4.Tool -lib scanner -visitor parser/JSONParser.g

parser/JSONParser.class: parser/JSONParser.java
	javac parser/JSONParser.java

Lab06.class: Lab06.java
	javac Lab06.java

clean:
	rm -rf *~ *.class
	rm -rf scanner/*.java scanner/*.class scanner/*~ parser/*.class parser/*~ scanner/*.tokens
