// public class test {
//     int a;
//     public static void main(String[] args) {
//         // int a = 1;
//         System.out.println(a+ "");
//     }
    
// }

public class test{
    int a ;   // non-static variable

    public static void main(String[] args) {
        test obj = new test();   // creating object
        System.out.println(obj.a);  // accessing variable using object
    }
}


// 
// 3 reserved literals  <- (total no. of reserved word 53) -> 50 keywords
//  reserved  literals are 1. true , 2. false , 3. NULL
//  out of 50 keywords  48 are in used 
//   2 keywords are not in used  1. const 2.goto
// variable that defined in the class but outside the method is called instance method .
