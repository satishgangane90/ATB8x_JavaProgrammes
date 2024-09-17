package sept.task16092024;

/*

 1. Difference between = and  ==?

= This is a assignment operator it assigns a value for eg: int a =10 [This means a holds value 10].

== This is a relational operator and it compares 2 values for eg a==b [This means a is equal to b & it is true]

2. byte b = 10; long l = 10l; → How much Byte will be used.

byte: 1 byte
long: 8 bytes

Total 9 bytes.

3.  (b+c) 30

4. Data will come in int form.

5. Ans is 75 refer below code.

*/

public class optclass {

    public  static void main(String[] args) {

        short s = 10;
        char c = 'A'; // ASCII value of 'A' is 65
        int ss = s + c;
        System.out.println(ss);

        // Value is coming as 75

    }
}



