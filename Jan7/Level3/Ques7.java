package Jan7.Level3;

public class Ques7 {
    static int generateOTP() {
        return (int)(Math.random()*900000)+100000;
    }
    static boolean areOTPsUnique(int[] otps){
        for(int i=0;i<otps.length;i++){
            for(int j=i+1;j<otps.length;j++){
                if(otps[i]==otps[j]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] otpArray=new int[10];
        for (int i=0;i<otpArray.length;i++){
            otpArray[i]=generateOTP();
        }
        System.out.println("Generated OTPs:");
        for(int otp:otpArray){
            System.out.println(otp);
        }
        boolean result=areOTPsUnique(otpArray);
        System.out.println("\nAre all OTPs unique? "+result);
    }
}
