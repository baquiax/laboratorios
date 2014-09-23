make: scanner/ScannerCalc.java scanner/ScannerCalc.class parser/ParserCalc.java parser/ParserCalc.class ast/AstVisitor.class Lab07.class 

scanner/ScannerCalc.java: scanner/ScannerCalc.g
	java org.antlr.v4.Tool -o scanner scanner/ScannerCalc.g

scanner/ScannerCalc.class: scanner/ScannerCalc.java
	javac scanner/ScannerCalc.java

parser/ParserCalc.java: parser/ParserCalc.g
	java org.antlr.v4.Tool -o parser -lib scanner -visitor parser/ParserCalc.g

parser/ParserCalc.class: parser/ParserCalc.java
	javac parser/ParserCalc.java

ast/AstVisitor.class: ast/AstVisitor.java
	javac ast/*.java

Lab07.class: Lab07.java
	javac Lab07.java

clean:
	rm -rf *.class
	rm -rf *~
	rm -rf scanner/*.class scanner/*~ scanner/*.tokens
	rm -rf parser/*.class parser/*~ parser/*.tokens
	rm -rf ast/*.class ast/*~ 
	rm -rf semantic/*.class semantic/*~ 
	rm -rf scanner/ScannerCalc.java
	rm -rf parser/ParserCalc.java
	rm -rf parser/ParserCalcBaseListener.java                                                                           
	rm -rf parser/ParserCalcListener.java                                                                               
	rm -rf parser/ParserCalcBaseVisitor.java
	rm -rf parser/ParserCalcVisitor.java