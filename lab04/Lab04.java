import org.antlr.v4.runtime.*;
import laboratorios.lab04.scanner.Lab04Scanner;
import laboratorios.lab04.parser.Lab04Parser;

public class Lab04 {
  public static void main(String[] args) throws Exception {
    try {	    
	(new Lab04Parser(new CommonTokenStream(new Lab04Scanner(new ANTLRFileStream(args[0]))))).start();
    } catch (ArrayIndexOutOfBoundsException aiobe) {
      System.err.println("usage: java Main <file>\nwhere file is the path to the filename with the tokens");
      System.exit(1);
    } catch (Exception e) {
      System.err.println("usage: jaca Main <file>\nwhere file is the path to the filename with the tokens");
      System.exit(1);
    } 
  }
}