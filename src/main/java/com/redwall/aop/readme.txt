spring 切面
 1. 使用    @Pointcut("execution(* com.redwall.aop.CustomAopBean.testMethod(..))") 的方式对方法进行切点注解
 2. 使用     @Pointcut("@annotation(com.redwall.aop.RedAnno))") 的方式对方法用切点注解  @RedAnno为自定义