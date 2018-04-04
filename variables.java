// comment denoted by double fw slash
/* or multiple line
comment. Comments just like in JS*/
// some examples taken from the Udacity course I am using to learn this content
// Oh, how I loathe thee semicolons. required in Java. Unlike the JS master race
// Let's look at number variables. int, long, double

int basicInt = 50; // this can be any whole number with exception below
int maxInt = 2147483647; // maximum value of an integer. Can not be larger than this
long largerInts = 2147483647 * 100000; // can store much longer integers, but slower to run
double fractions = 99.275; // double can store fractions (floats if it were Python)
// lets do something fun.
int stops = 2; // declared as 2
stops = 5; // changed to 5
stops = stops + 2; // now will show 7. 5 +2 = 7
// Weirdness to follow. 
double div = 5/2; // prints 2. WTF...even though double, argument must also include a double
double accurate = 5/2.0; // prints 2.5 because the 5/2.0 shows a double
int x = 10;
int y = 5;
int z = x*y; // prints 50. Can multiply variables
double paid = 10;
double change = 3.50;
double tip = (paid-change) *0.2; // remember PEMDAS. order of operations
// here we will talk about casting. 
int a = 5;
int b = 2;
double div2 = a/b;
System.out.println(div); // prints 2
double casting = (double)casting/casting2; //putting (double)
System.out.println(casting); // prints 2.5
// other variable types String, char, boolean

String nameFirst = "Bill";
int numberLetters = nameFirst.length // stores the integer of the number of letters in nameFirst (4)
String nameFirst = nameFirst.toUppercase // converts the nameFirst variable to "BILL"
String nameLast = "Williams";
String nameLast = nameLast.toLowerCase // converts nameLast variable to "williams"
// string concantenation
String fullName = nameFirst + " " + nameLast // BILL williams. 
char answer = 'b'; // char only stores a SINGLE DIGIT using a SINGLE QUOTE.
// Can also store numbers. 1-9, not 10+. 
boolean fact = true; // only true or false
