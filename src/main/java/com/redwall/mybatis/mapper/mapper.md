## 使用mapper 接口不用谢接口实现类即可完成数据库的操作,使用非常简单，也是官方推荐的使用方法



使用**mapper**接口必须具备以下几个条件

1、**Mapper**的**namespace**必须和**mapper** 的接口路径完全一致

2、**Mapper**接口的方法名必须和**sql**定义的id完全一致

3、**Mapper**接口方法中的方法的入参类型必须和**sql**定义的**parameterType**一致

4、**Mapper**接口方法的回参类型必须和**sql**定义的**resultType**一致


###  关于sql的占位符  **#{}  和  ${}**

   1、#{},预编译的方式preparedstatement，使用占位符替换，防止sql注入，一个参数的时候，任意参数名可以接收
   2、${},普通的Statement，字符串直接拼接，不可以防止sql注入，一个参数的时候，必须使用${value}接收参数