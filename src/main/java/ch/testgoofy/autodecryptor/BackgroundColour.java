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

/**
 * Holds the background colour values for the ANSI escape sequences
 * @author testgoofy
 * @since 0.1.0
 * @version 0.1.0
 * @see <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">https://en.wikipedia.org/wiki/ANSI_escape_code</a>
 */
public enum BackgroundColour {

  RESET(0),
  BLACK(40),
  WHITE(107),
  RED(41),
  GREEN(42),
  YELLOW(43),
  BLUE(44),
  MAGENTA(45),
  CYAN(46),
  GREY(100),
  BRIGHT_RED(101),
  BRIGHT_GREEN(102),
  BRIGHT_YELLOW(103),
  BRIGHT_BLUE(104),
  BRIGHT_MAGENTA(105),
  BRIGHT_CYAN(106),
  BRIGHT_GREY(47);


  public final String code;

  private BackgroundColour(int code){
    this(code, true);
  }

  private BackgroundColour(int code, boolean whiteFont){
    this.code = "\u001B[" + (whiteFont ? 97 : 30 ) + ";" + code + "m";
  }
}
