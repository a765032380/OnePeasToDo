package pub.gll.module.algorithm.k01;

public class Test {

    // Int Double 引用类型 =反编译后=  KT  int double
    // Double?  =反编译后=  Double

    public static void main() {

    }

    // method1 : () -> Unit
    public void method1()         {}

    // var method2 : (Int, Int) -> Unit
    public void method2(int a, int b)        {}

    // var method3 : (String, Double) -> Any
    public Object method3(String a, Double b)        { return null; }

    // var method4 : (Int, Double, Long, String) -> Boolean
    public Boolean method4(int a, Double b, Long c, String d)        { return true; }

    // var method5 : (Int, Int) -> Int
    public int method5(int a , int b)         {return 1;}

    // TODO  >>>>>>>>>>>>>>>>>>>>>>>>>>>>> 下面是声明+实现

    //  var method01 = { println("我是method01函数")}
    public void method01()         {
        System.out.println("我是method01函数");
    }

    // var method02 = { "我是method02函数" }
    public String method02()         {
        return "我是method02函数";
    }

    // var method03 = {str: String -> println("你传递进来的值是:$str")}
    public void method03(String str)         {
        System.out.println("你传递进来的值是:" + str);
    }

    // var method04 = {number1: Int, number2: Int -> number1.toString() + number2.toString()}
    public String method04(int number1, int number2)         {
       return String.valueOf(number1) + String.valueOf(number2) ;
    }

    // var method05 = {number1: Int, number2: Int -> number1 + number2}
    public int method05(int number1, int number2)         {
        return number1 + number2 ;
    }
}
