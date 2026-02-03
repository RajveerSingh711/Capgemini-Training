package Feb2;

/*Implement a Java program where one thread writes data into a PipedOutputStream and another thread reads data from a PipedInputStream.
Requirements:
Use two threads for reading and writing.
Synchronize properly to prevent data loss.
Handle IOException.
*/

import java.util.*;
import java.io.*;

public class Ques8 {
    public static void main(String[] args){
        try{
            PipedOutputStream pos=new PipedOutputStream();
            PipedInputStream pis=new PipedInputStream(pos);
            Thread writerThread=new Thread(new Writer(pos));
            Thread readerThread=new Thread(new Reader(pis));
            writerThread.start();
            readerThread.start();
        }catch(IOException e){
            System.out.println("Error connecting piped streams.");
            e.printStackTrace();
        }
    }
    static class Writer implements Runnable{
        private PipedOutputStream pos;
        Writer(PipedOutputStream pos){
            this.pos=pos;
        }
        @Override
        public void run(){
            try{
                String message="Hello from Writer Thread!";
                pos.write(message.getBytes());
                pos.close();
            }catch(IOException e){
                System.out.println("Writer error.");
                e.printStackTrace();
            }
        }
    }
    static class Reader implements Runnable{
        private PipedInputStream pis;
        Reader(PipedInputStream pis){
            this.pis=pis;
        }
        @Override
        public void run(){
            try{
                int data;
                while((data=pis.read())!=-1) System.out.print((char)data);
                pis.close();
            }catch(IOException e){
                System.out.println("Reader error.");
                e.printStackTrace();
            }
        }
    }
}
