# BuilderDesignPattern

Builder Pattern
1. Imagine there is a class “User” and its constructor takes following parameters as follow

    public User(int id, string name, string phoneNumber , int age )
    {
    
    }

2. Now when the User creates the object then he may get confused with the order or sequence of parameters passed. There can be many permutations and combinations of these parameters.

3. If there are n arguments in function then there can be n! Possible ways. Hence never pass too many arguments in function call or function definition.

4. There can be many arguments like phone number and age which are optional in nature and depend on the user , hence for a user who doesn't need to share his phone number then he has to pass NULL for it . which is not a good user experience.

5. One bruteforce way to deal with it is to do constructor overloading , it is just like function overloading. Implement different constructor for different possible scenarios.

6. Another better way to do it is to implement setters for optional arguments.

7. Problems with setters is that we get rid of the final keyword.Hence immutability is also gone. In Big organizations which are working in a multithreaded environment it is important to sustain mutability.

8. Another idea to solve this problem is to use Inner class i.e. having an intermediate class which holds the arguments.

9. Inner class is the class contained inside a class. Example we can have a class “Builder” inside the class “User”.

10. We will make Inner class static so that we can use it without making the object of outer class.

12. Now we can implement the setter inside this builder inner static class, Hence we are compromising the immutability of this secondary insider class instead of our primary class.
