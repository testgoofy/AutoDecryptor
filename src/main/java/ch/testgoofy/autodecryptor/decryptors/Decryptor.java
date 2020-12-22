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

package ch.testgoofy.autodecryptor.decryptors;

import ch.testgoofy.autodecryptor.DecryptorState;

public abstract class Decryptor implements Runnable{

  private Thread thread;
  protected String encryptedMessage;
  protected DecryptorState state = DecryptorState.NEW;
  protected String decryptorName;
  protected String decryptedMessage;

  public String getDecryptedMessage() {
    return decryptedMessage;
  }

  public String getName() {
    return decryptorName;
  }

  public DecryptorState getState() {
    return state;
  }

  public void decrypt(String encryptedMessage){
    this.encryptedMessage = encryptedMessage;

    if (thread == null){
      thread = new Thread(this);
      thread.start();
    }
  }

  @Override
  public abstract void run();
}
