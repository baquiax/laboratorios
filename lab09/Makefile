make: scanner/ScannerCalc.java scanner/ScannerCalc.class parser/ParserCalc.java parser/ParserCalc.class ast/AstVisitor.class semantic/Semantic.class Lab09.class 

scanner/ScannerCalc.java: scanner/ScannerCalc.g
	java org.antlr.v4.Tool scanner/ScannerCalc.g

scanner/ScannerCalc.class: scanner/ScannerCalc.java
	javac scanner/ScannerCalc.java

parser/ParserCalc.java: parser/ParserCalc.g
	java org.antlr.v4.Tool -lib scanner -visitor parser/ParserCalc.g

parser/ParserCalc.class: parser/ParserCalc.java
	javac parser/ParserCalc.java

ast/AstVisitor.class: ast/AstVisitor.java
	javac ast/*.java

semantic/Semantic.class: semantic/Semantic.java
	javac semantic/*.java

Lab09.class: Lab09.java
	javac Lab09.java

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