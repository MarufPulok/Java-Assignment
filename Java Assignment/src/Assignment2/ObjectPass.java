package Assignment2;

public class ObjectPass {

    int a = 5;

    void ChangeObjectValue(ObjectPass o) {
        o.a++;
    }

    public static void main(String args[]) {
        ObjectPass ob = new ObjectPass();
        System.out.println("a=" + ob.a);
        ob.ChangeObjectValue(ob);
        System.out.println("a=" + ob.a);

    }
}
