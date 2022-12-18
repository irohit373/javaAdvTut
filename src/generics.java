public class generics {
    public static void main(String[] args) {
        
        singleGenericHolder<Integer> iObj = new singleGenericHolder<Integer>(10);
        System.out.println(iObj.getObject());

        singleGenericHolder<String> sObj = new singleGenericHolder<String>("helio G80-T");
        System.out.println(sObj.getObject());

        DualGenericHolder<Integer, String> obj = new DualGenericHolder<Integer, String>(8, " SD888+");
        obj.display();
    }
}

class singleGenericHolder <T>{
    T obj;

    singleGenericHolder(T obj){
        this.obj = obj;
    }

    public T getObject(){
        return this.obj;
    }
}

class DualGenericHolder<T, U>{
    T obj1;
    U obj2;

    DualGenericHolder(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void display(){
        System.out.print(obj1);
        System.out.println(obj2);
    }


}