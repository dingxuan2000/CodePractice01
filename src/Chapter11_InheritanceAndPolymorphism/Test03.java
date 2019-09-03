package Chapter11_InheritanceAndPolymorphism;

public class Test03 {
    public static void main(String[] args) {
        //new F();
        new G();

    }
}
class F{
    int i = 7;
    public F(){
        setI(20);
        System.out.println("i from F is " + i);
    }
    public void setI(int i){
        this.i = 2*i;
    }
}
class G extends F{
    public G(){
        System.out.println("i from G is " + i);
    }
    @Override
    public void setI(int i){
        this.i = 3*i;
    }
}
