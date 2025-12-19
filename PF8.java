interface MyFunc{
    MyClass func(String s);
}
class MyClass {
    private String str;
    MyClass(String s) {
        str = s;
    }
    MyClass() {
        str = "";
    }
    String getStr() {
        return str;
    }
}
MyFunc myClassCons = MyClass::new;
MyClass mc = myClassCons.func("строка");
mc.getStr()
interface MyFunc2{
    MyClass func();
}
MyFunc2 myClassCons2 = MyClass::new;
MyClass mc2 = myClassCons2.func();
mc2.getStr()
interface MyClassArrayCreator {
    MyClass[] func(int n);
}
MyClassArrayCreator mcArrayCons = MyClass[]::new;
MyClass[] a = mcArrayCons.func(3);
uO.apply(3)
UnaryOperator<String> uO = (s) -> s + " " + s;
uO.apply("строка-текст")
bO.apply(15, 3)
bO.apply(4, 3)
bO.apply(4.0, 3.6)
BinaryOperator<String> bO = (s1, s2) -> s1+s2;
bO.apply("Строка1", "Строка2")
cons.accept(5)
Consumer<Integer> cons = (n) -> {
    System.out.println("Принял парметр"  + n);
    n = n+5;
    System.out.println("Измененное значение праметра" + n);
};
cons.accept(5)
static double test(int n, int m){
    return (double) n/m;
}
Supplier<Double> suppl = () -> test(10, 3);
suppl.get()
Function<String, Integer> func = (str) -> str.length();
func.apply("Строка-тест")
Predicate<Integer> pred = (n) -> n<5;
pred.test(10)
pred.test(4)
