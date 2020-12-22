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

public class CLI {
  private final Settings settings;
  private int nCharacters = 0;

  private String getSignature(FontColour colour){
    return getSignature(colour, false);
  }

  private String getSignature(FontColour colour, boolean withApplicationName){
    return colour.code + (withApplicationName ? "AutoDecryptor " : "") + "by testgoofy | Version " + settings.version;

  }

  public void printDecryptor(DecryptorState state, String decryptor){
    String line = FontColour.RESET.code + "[";
    line += switch (state){
      case NEW -> " ";
      case SUCCESSFUL -> FontColour.GREEN.code + "\uD83D\uDDF8";
      case RUNNING -> FontColour.YELLOW.code + "O";
      case FAILED -> FontColour.RED.code + "x";
    };
    line += FontColour.RESET.code + "] " + decryptor;
    nCharacters += line.length();
    System.out.println(line);
  }

  public void printError(String message){
    System.out.println();
    System.out.println(BackgroundColour.RED.code + "!!! " + message + " !!!");
  }

  public void printHeader(){
    System.out.println(FontColour.BRIGHT_BLUE.code);
    System.out.println("      @@                    @@             *@@@***@@m                                                     @@");
    System.out.println("     m@@m                   @@               @@    *@@                                                    @@");
    System.out.println("    m@  @!    *@@@  *@@@  @@@@@@   m@@*@@m   @@     *@@  mm@*@@   m@@*@@ *@@@m@@@ *@@*   *@@**@@@@@@@@m @@@@@@   m@@*@@m *@@@m@@@");
    System.out.println("   m@   @@      @@    @@    @@    @@*   *@@  @@     *@@ m@*   @@ @@*   @@  @@* **   @@   m@    @@   *@@   @@    @@*   *@@  @@* **");
    System.out.println("  !@@@!@!@@     !@    @@    @@    @@     @@  @!      @@ !@@@m@@* @!        @!        @@ m!     !@    @@   @@    @@     @@  @!");
    System.out.println("  !!*    @@     !@    @!    @!    @@     !@  @!     @!* !@       @!        @!         @@!      !@    !@   @!    @@     !@  @!");
    System.out.println("  !*      @!    !@    !!    !!    !@     !!  !!     !!! !!       !!        !!         @!!      !@!   !!   !!    !@     !!  !!");
    System.out.println(" !!*      !!    !!    !!    !!    !!!   !!!  !:    !!:* :!!      !:!   !!  !:         !!:      !@   !!!   !!    !!!   !!!  !:");
    System.out.println(":::       :::   :: !: :!:   ::: :  : : : : : : : : :      : : ::   : : : : :::        !!       :!: : :    ::: :  : : : : : :::");
    System.out.println("                                                                                   ::!         ::");
    System.out.println("                            " + getSignature(FontColour.BLUE) + FontColour.BRIGHT_BLUE.code + "                         :::         : : ::");
    System.out.println();
  }

  public void printVersion(){
    System.out.println(getSignature(FontColour.RESET,true));
  }

  public void resetDecryptorList(){
    for (int i = 0; i < nCharacters; i++) {
      System.out.print("\b");
    }
    nCharacters = 0;
  }

  public CLI(Settings settings){
    this.settings = settings;
  }
}
