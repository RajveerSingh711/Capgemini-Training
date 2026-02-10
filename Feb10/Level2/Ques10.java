package Feb10.Level2;

/*Define a class-level annotation @RoleAllowed to restrict method access based on roles.
🔹 Requirements:
@RoleAllowed("ADMIN") should only allow ADMIN users to execute the method.
Simulate user roles and validate access before invoking the method.
If a non-admin tries to access it, print Access Denied!
*/

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed{
    String value();
}
class AdminService{
    @RoleAllowed("ADMIN")
    public void deleteUser(){
        System.out.println("User deleted successfully");
    }
    public void viewUser(){
        System.out.println("Viewing user details");
    }
}
class UserContext{
    public static String currentUserRole="USER";
}
public class Ques10 {
    public static void main(String[] args){
        AdminService service=new AdminService();
        Class<?> cls=service.getClass();
        try{
            Method method = cls.getDeclaredMethod("deleteUser");
            if(method.isAnnotationPresent(RoleAllowed.class)){
                RoleAllowed roleAllowed=method.getAnnotation(RoleAllowed.class);
                String requiredRole=roleAllowed.value();
                if(requiredRole.equals(UserContext.currentUserRole)) method.invoke(service);
                else System.out.println("Access Denied!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
