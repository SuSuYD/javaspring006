package com.cold.day03.a_proxy;

/**
 * 简单版的JDK动态代理（假设所有信息都知道的情况下固定写死的）
 * 1、得到一个java的文件
 * 2、改变文件，把要增强的代码写进去，得到一个代理类
 * 3、把它编译成class文件
 * 4、加载class文件到java虚拟机当中来，得到class对象
 * 5、通过反射，也就是通过类的类对象，我们可以去实例化出来一个对象，这就是我们的代理对象
 * 6、最后再返回代理对象
         * 7、调用生成的方法，使用生成的代理对象调用增强后的方法，完成代理模式
         */
public class ProxyUtil {
    //创建静态方法，可以根据类名调用

    /**
     *newLogProxyInstance  做日志增强用的
     * @param target  传入什么对象， 就完成这个对象的代理
     * @return
     */
    public static Object newLogProxyInstance(Object target){
        String content = "";
        String PackageContent = "package com.cold";
        //采用聚合模式，聚合模式要求代理对象和真实对象实现同一个对象接口，所以我们要获取目标对象（真实对象）的接口实现
        //假设实现对象都是单实现
        Class<?> anInterface = target.getClass().getInterfaces()[0];
        //得到简单命名
        String interfaceSimpleName = anInterface.getSimpleName();
        //导包   getName() 相当于获取到  com.cold.day03.a_proxy.UserService
        String importContent = "import" +anInterface.getName()+";";
        String classContent = "public class $Proxy implements" + interfaceSimpleName + "{";
        //定义属性
        String fieldCintent = "private" + interfaceSimpleName + "target";
        //构造方法
        String construterContent = "public $proxy("+ interfaceSimpleName +" target){"
                + "this.target = target;}";
        return null;
    }
}
