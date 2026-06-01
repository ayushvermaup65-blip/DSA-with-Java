public class Methods {
    //declaration/definition
    static void print2KaTable(){
        for(int i=1; i<=10; i++){
            int ans = 2*i;
            System.out.println("2 * " + i + " = " + ans);
        }

    }

    static void main() {
        System.out.println("hi");
        print2KaTable(); //method call
        System.out.println("bye");
    }

}
