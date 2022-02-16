package generics.interfaces;

public class Interfaces {

    /*
     * generic interfaces work as the generic classes
     * we use it to define at compile time the types
     * we are using
    */
    public static void main(String[] args) {

        GenericInterfaceImpl<String> genericInterfaceImpl = new GenericInterfaceImpl<>("generic interface impl");
        System.out.println(genericInterfaceImpl.getData());

    }
}

interface GenericInterface<T> {

    public abstract T getData();

    public abstract void setData(T data);

}

class GenericInterfaceImpl<T> implements GenericInterface<T> {

    private T data;

    public GenericInterfaceImpl(T data) {
        this.data = data;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }
}
