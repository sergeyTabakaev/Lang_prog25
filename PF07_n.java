isractor.test(10, 2)
interface SomeTest<T> {
    boolean test(T n, T m);
}
SomeTest <Integer> isractor = (n, d) -> (n%d)==0;
isractor.test(10, 2)
SomeTest <Double> isractorD = (n,d) -> (n%d) == 0;
interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOExeption;
}
interface MyTransrorm <T>{
    void transform(T[] a);
}
interface IntPrdicate {
    boolean test(int n);
}
class MyIntPredicates { 
    static boolean isPrime(int n) {
        if (n<2) return false;
        for (int i=2; i <= n/i; i++){
            if((n%i) == 0)
            return false;
        }
        return true;
    }
    static boolean isPositive(int n){
        return n>0;
    }
    static boolean isEven(int n){
        return (n%2) == 0;
    }
}
static boolean numTest(IntPredicates p, int v){
    return p.test(v);
}
static boolean numTest(IntPredicate p, int v){
    return p.test(v);
}
class MyIntNum{
    private int v;
    MyIntNum(int x) {v=x;}
    int getNum() {return v;}
    boolean isFactor (int n) {
        return (v%n) == 0;
    }
}
MyIntNum myNum = new MyIntNum(12);
MyIntNum myNum2 = new MyIntNum(16);
interface IntPredicate {
    boolean test(int n);
}
IntPredicate ip=myNum::isFactor;
