public class ArgMethod {
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
        System.out.println("Attr 1 = " + attr_1);
        System.out.println("Attr 2 = " + attr_2);
        System.out.println("Sum of Attribute 1 and 2  = " + sum);
    }

    public void OverrideAttrsValues(int val1,int val2)
    {
        // overriding the values of attrs, showing that they are
        // mutable datatypes
        attr_1 = val1;
        attr_2 = val2;
        // Print out and the combine the sum
        AddAttr1NAttr2();

    }

    // create main method to create object from class. Then print out the sum of both attrs
    public static void main(String args[]) {
        // create object to inherit the classes methods and attrs
        ArgMethod Sum = new ArgMethod();
        Sum.AddAttr1NAttr2();
        System.out.println();
        // call method, which overwrites the init. values for attr 1 and attr 2
        Sum.OverrideAttrsValues(100,20);

    }
}