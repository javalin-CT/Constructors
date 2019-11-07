package com.example.ReviewProjects.Constructors;
    /*
Constructors
    1. constructors are executed when an object is created
    2. every class must have a constructor
        compiler can give a default no-arg constructor
    3. to create a new object:
        ClassName obj = new ExistingConstructor();
    4. declaration:
        access-modifier ClassName (args or no args){}
    5. can overload constructors
    6. constructor calls:
        only a constructor can call another constructor
        cannot be called by constructor name
            need to use "this()" to call constructor
    7. "this()" needs to be the first line in the constructor
     */


public class Syntax_And_Notes {
    //declaring constructors with and without args
    public Syntax_And_Notes(){
        //using this(); to call another constructor
        this(false);
        System.out.println("no args");
    }
    //overloading constructor
    public Syntax_And_Notes(int a){
        this();//using this(); to call another constructor
        System.out.println("int");
    }
    //overloading constructor
    public Syntax_And_Notes(boolean boo){
        System.out.println("boo");
    }


    public static void main(String[] args) {
        //creating obj with the different constructors
        Syntax_And_Notes obj = new Syntax_And_Notes(true);
        Syntax_And_Notes obj2 = new Syntax_And_Notes(1);
        Syntax_And_Notes obj3 = new Syntax_And_Notes();


    }
}

