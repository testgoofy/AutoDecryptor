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
 * Holds the font colour values for the ANSI escape sequences
 * @author testgoofy
 * @since 0.1.0
 * @version 0.1.0
 * @see <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">https://en.wikipedia.org/wiki/ANSI_escape_code</a>
 */
public enum FontColour {

  RESET(0),
  BLACK(30),
  WHITE(97),
  RED(31),
  GREEN(32),
  YELLOW(33),
  BLUE(34),
  MAGENTA(35),
  CYAN(36),
  GREY(90),
  BRIGHT_RED(91),
  BRIGHT_GREEN(92),
  BRIGHT_YELLOW(93),
  BRIGHT_BLUE(94),
  BRIGHT_MAGENTA(95),
  BRIGHT_CYAN(96),
  BRIGHT_GREY(37);


  public final String code;

  private FontColour(int code){
    this.code = "\u001B[" + code + "m";
  }
}
