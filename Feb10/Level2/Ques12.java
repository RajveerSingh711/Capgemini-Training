package Feb10.Level2;

/*Define @CacheResult to store method return values and avoid repeated execution.
🔹 Requirements:
Apply @CacheResult to a computationally expensive method.
Implement a cache (HashMap) to store previously computed results.
If method is called with the same input, return cached result instead of re-computation.
*/

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {
}
class MathService{
    @CacheResult
    public int expensiveCalculation(int n){
        System.out.println("Computing result for "+n);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return n*n;
    }
}
class CacheExecutor{
    private static final Map<String,Object> cache=new HashMap<>();
    public static Object invoke(Object target, String methodName, Object... args){
        try{
            Class<?> cls=target.getClass();
            Class<?>[] paramTypes=Arrays.stream(args).map(Object::getClass).toArray(Class[]::new);
            Method method = cls.getDeclaredMethod(methodName,paramTypes);
            if(method.isAnnotationPresent(CacheResult.class)){
                String cacheKey=methodName+Arrays.toString(args);
                if(cache.containsKey(cacheKey)){
                    System.out.println("Returning cached result for "+cacheKey);
                    return cache.get(cacheKey);
                }
                Object result=method.invoke(target,args);
                cache.put(cacheKey,result);
                return result;
            }
            return method.invoke(target,args);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
public class Ques12 {
    public static void main(String[] args){
        MathService service=new MathService();
        System.out.println(CacheExecutor.invoke(service,"expensiveCalculation",5));
        System.out.println(CacheExecutor.invoke(service,"expensiveCalculation",5));
        System.out.println(CacheExecutor.invoke(service,"expensiveCalculation",10));
        System.out.println(CacheExecutor.invoke(service,"expensiveCalculation",10));
    }
}
