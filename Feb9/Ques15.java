package Feb9;

/*
1️⃣5️⃣ Encrypt and Decrypt CSV Data
Encrypt sensitive fields (Email, Salary) while writing to CSV
Decrypt them when reading the CSV
*/

import java.io.*;
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.*;

class CryptoUtil{
    private static final String ALGORITHM="AES";
    private static final String SECRET_KEY="1234567890123456";
    private static SecretKeySpec getKey(){
        return new SecretKeySpec(SECRET_KEY.getBytes(),ALGORITHM);
    }
    public static String encrypt(String data){
        try{
            Cipher cipher=Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE,getKey());
            byte[] encrypted=cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
        }catch(Exception e){
            throw new RuntimeException("Encryption failed", e);
        }
    }
    public static String decrypt(String encryptedData){
        try{
            Cipher cipher=Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE,getKey());
            byte[] decoded=Base64.getDecoder().decode(encryptedData);
            return new String(cipher.doFinal(decoded));
        }catch(Exception e){
            throw new RuntimeException("Decryption failed", e);
        }
    }
}
class EncryptCsvWriter{
    public static void writeEncryptedCsv(String filePath) throws IOException{
        try(FileWriter writer=new FileWriter(filePath)){
            writer.write("ID,Name,Email,Salary\n");
            writer.write("101,Rahul,"+CryptoUtil.encrypt("rahul@gmail.com")+","+CryptoUtil.encrypt("55000")+"\n");
            writer.write("102,Priya,"+CryptoUtil.encrypt("priya@gmail.com")+","+CryptoUtil.encrypt("48000")+"\n");
        }
    }
}
class DecryptCsvReader{
    public static void readDecryptedCsv(String filePath) throws IOException{
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            br.readLine();
            String line;
            System.out.println("Decrypted Records:");
            System.out.println("------------------");
            while((line=br.readLine())!=null){
                String[] data=line.split("\\s*,\\s*");
                String id=data[0];
                String name=data[1];
                String email=CryptoUtil.decrypt(data[2]);
                String salary=CryptoUtil.decrypt(data[3]);
                System.out.println("ID: "+id+", Name: "+name+", Email: "+email+", Salary: "+salary);
            }
        }
    }
}
public class Ques15{
    public static void main(String[] args) throws Exception{
        String filePath = "employees_encrypted.csv";
        EncryptCsvWriter.writeEncryptedCsv(filePath);
        System.out.println("Encrypted CSV written successfully.\n");
        DecryptCsvReader.readDecryptedCsv(filePath);
    }
}
