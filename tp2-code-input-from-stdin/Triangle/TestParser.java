/*
 * TestParser
 * -- Test the parser for Triangle.
 *
 * by Fernando Lobo, Mar/2015
 *     
 */

package Triangle;

import Triangle.AbstractSyntaxTrees.Program;
import Triangle.SyntacticAnalyzer.Parser;
import Triangle.SyntacticAnalyzer.Scanner;
import Triangle.SyntacticAnalyzer.SourceFile;

public class TestParser {

  public static void main(String[] args) {
  
/*
      if (args.length != 1) {
         System.out.println("Usage: main filename");
         System.exit(1);
      }
      String sourceName = args[0];
      SourceFile source = new SourceFile(sourceName);
      if (source == null) {
          System.out.println("Can't access source file " + sourceName);
          System.exit(1);
      }
*/
      SourceFile source = new SourceFile();   
  
      Scanner scanner = new Scanner(source);
      //scanner.enableDebugging();
      ErrorReporter reporter = new ErrorReporter();
      Parser parser = new Parser(scanner, reporter);
      Program theAST = parser.parseProgram();
 	  boolean successful = (reporter.numErrors == 0);
      if( successful )
         System.out.println("Parsing successful.");
      else 
         System.out.println("Parsing not successful.");
   } 
}

