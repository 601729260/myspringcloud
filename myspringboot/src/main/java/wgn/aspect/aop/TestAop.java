package wgn.aspect.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import wgn.aspect.annotation.MyInfoAnnotation;

//描述切面类
@Aspect
@Configuration
public class TestAop {

    /*
     * 定义一个切入点
     */
//    @Pointcut("@annotation(wgn.aspect.annotation.MyInfoAnnotation)")
//    public void myInfoAnnotation() {
//    }
//
//
//    // 用@Pointcut来注解一个切入方法
//    @Pointcut("execution( public * *(..))")
//    public void excudeController() {
//    }

    /*
     * 通过连接点切入
     */
    //    @Before("execution(* findById*(..)) &&" + "args(id,..)")
    //    public void twiceAsOld1(Long id) {
    //        System.out.println("切面before执行了。。。。id==" + id);
    //
    //    }

    @Around(value = "execution(public * *(..)) && @annotation(ts)")
    public Object twiceAsOld(ProceedingJoinPoint thisJoinPoint, MyInfoAnnotation ts) throws Throwable{
        System.out.println ("切面执行了。。。。");
        String thing=null;
        try {
            thing = (String) thisJoinPoint.proceed ();
            thing=thing+" aop "+ts.value();

        } catch (Throwable e) {
            throw e;
        }
        return thing;
    }
/*    //@annotation 这个你应当知道指的是匹配注解
    //括号中的 annotation 并不是指所有自定标签，而是指在你的注释实现类中 *Aspect 中对应注解对象的别名，所以别被俩 annotation  所迷惑。
    @Around(value = "myInfoAnnotation()&&@annotation(annotation)")
    public Object twiceAsOld(ProceedingJoinPoint thisJoinPoint,
                             MyInfoAnnotation annotation
    ) {
        System.out.println(annotation.value());
        try {
            thisJoinPoint.proceed();//环绕通知必须执行，否则不进入注解的方法
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {

        }


        return null;
    }*/
}
