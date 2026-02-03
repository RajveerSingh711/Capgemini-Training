package Feb2;

/*Write a Java program that converts an image file into a byte array and then writes it back to another image file.
Requirements:
Use ByteArrayInputStream and ByteArrayOutputStream.
Verify that the new file is identical to the original image.
Handle IOException.
*/

import java.util.*;
import java.io.*;

public class Ques5 {
    public static void main(String[] args){
        String sourceImage="original.jpg";
        String destinationImage="copy.jpg";
        byte[] imageBytes=null;
        try(
                FileInputStream fis=new FileInputStream(sourceImage);
                ByteArrayOutputStream baos=new ByteArrayOutputStream()
        ){
            byte[] buffer=new byte[4096];
            int bytesRead;
            while((bytesRead=fis.read(buffer))!=-1){
                baos.write(buffer,0,bytesRead);
            }
            imageBytes=baos.toByteArray();
            System.out.println("Image converted to byte array.");
        }catch(IOException e){
            System.out.println("Error reading image file.");
            e.printStackTrace();
            return;
        }
        try(
                ByteArrayInputStream bais=new ByteArrayInputStream(imageBytes);
                FileOutputStream fos=new FileOutputStream(destinationImage)
        ){
            byte[] buffer=new byte[4096];
            int bytesRead;
            while((bytesRead=bais.read(buffer))!=-1){
                fos.write(buffer,0,bytesRead);
            }
            System.out.println("Byte array written back to image file.");
        }catch(IOException e){
            System.out.println("Error writing image file.");
            e.printStackTrace();
            return;
        }
        if(verifyFiles(sourceImage,destinationImage)) System.out.println("Verification successful: Images are identical.");
        else System.out.println("Verification failed: Images are different.");
    }
    private static boolean verifyFiles(String file1,String file2){
        try(
                FileInputStream fis1=new FileInputStream(file1);
                FileInputStream fis2=new FileInputStream(file2)
        ){
            int b1,b2;
            while((b1=fis1.read())!=-1){
                b2=fis2.read();
                if(b1!=b2) return false;
            }
            return fis2.read()==-1;
        }catch(IOException e){
            e.printStackTrace();
            return false;
        }
    }
}
