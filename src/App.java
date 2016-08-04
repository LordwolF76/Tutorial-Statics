/**
 * Created by LordwolF on 8/3/2016.
 */
class Thing {
    public final static int LUCKY_NUMBER = 7;
    public String name;
    public static String description;

    public static int count = 0;

    public int id;

    //this would increment count when a new object is created
    public Thing(){

        id = count;
        count++;
    }

    public void  showName() {
        System.out.println("Object ID; " + id + ", " + description + ": " + name);
    }
}




public class App {

    public static void main(String[] args) {

        Thing.description = "I am a thing";
        System.out.println(Thing.description);

        System.out.println("Before creating objects count is: " + Thing.count);


        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "bob";
        thing2.name = "sue";
        //System.out.println(thing1.name);
        //System.out.println(thing2.name);

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);

        System.out.println(Thing.LUCKY_NUMBER);

        System.out.println("After creating objects count is: " + Thing.count);


    }
}
