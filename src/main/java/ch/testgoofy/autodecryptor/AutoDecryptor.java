//  MIT License
//
//  Copyright (c) 2020 testgoofy
//
//  Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files (the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions:
//
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//  SOFTWARE.

package ch.testgoofy.autodecryptor;

public class AutoDecryptor {

  private static final Settings SETTINGS = new Settings("0.1.0");
  private static CLI cli = new CLI(SETTINGS);

  public static void interpretParameter(String param){
    switch (param){
      case "-v" -> cli.printVersion();
      default -> cli.printError("ERROR 1: Unknown parameter '" + param + "'.");
    }
  }

  public static void main(String[] args) {
    cli.printHeader();

    if (args.length == 0){
      cli.printError("ERROR 0: More than zero parameters expected.");
      System.exit(-1);
    }

    for (String arg: args) {
      if (arg.startsWith("-")){
        interpretParameter(arg);
      }
    }

  }
}
