package Feb10.Level1;

/*Implement a Dynamic Proxy that intercepts method calls on an interface (e.g., Greeting.sayHello()) and logs the method name before executing it.
*/

import java.lang.reflect.*;

interface Greeting{
    void sayHello(String name);
}
class GreetingImpl implements Greeting{
    @Override
    public void sayHello(String name){
        System.out.println("Hello, "+name+"!");
    }
}
class LoggingInvocationHandler implements InvocationHandler{
    private Object target;
    public LoggingInvocationHandler(Object target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable{
        System.out.println("Calling method: "+method.getName());
        return method.invoke(target,args);
    }
}
public class Ques10 {
    public static void main(String[] args){
        Greeting realObject=new GreetingImpl();
        Greeting proxyObject=(Greeting) Proxy.newProxyInstance(Greeting.class.getClassLoader(),new Class[]{Greeting.class},new LoggingInvocationHandler(realObject));
        proxyObject.sayHello("Rajveer");
    }
}
