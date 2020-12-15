public class AddTwoAttrs {
    // each time an object is created from this class.
    // These attrs can be accessed via the dot notatoin.
    // i.e. NewObj = new AddTwoAttrs()
    // NewObj.attr_1, NewObj.attr_2
    int attr_1 = 10;
    int attr_2 = 20;

    // call the main method to add attr1 with attr2,
    // then return sum to console. Method call AddAttr1NAttr2
    public void AddAttr1NAttr2() {
        int sum = attr_1 + attr_2;
        System.out.println("Attr 1 = "+attr_1);
        System.out.println("Attr 2 = "+attr_2);
        System.out.println("Sum of Attribute 1 and 2  = " + sum);
    }

    // create main method to create object from class. Then print out the sum of both attrs
    public static void main(String args[]) {
        // create object to inherit the classes methods and attrs
        AddTwoAttrs Sum = new AddTwoAttrs();
        // call method AddAttr1NAttr2
        Sum.AddAttr1NAttr2();

    }
}
