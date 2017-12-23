/**
 * Created by Julie on 12/23/2017.
 */
public class Dog {
        String name;
        public static void main (String[] args) {
            //make a dog object and access it
            Dog dog1 = new Dog();
            dog1.bark();
            dog1.name = "Bart";

            //now make a dog array
            Dog[] myDogs = new Dog[3];
            //put some dogs in it
            myDogs[0] = new Dog();
            myDogs[1] = new Dog();
            myDogs[2] = dog1 ;
            //access the dogs using the array reference
            myDogs[0].name = "Fred";
            myDogs[1].name = "Marge";

            System.out.print("Last dog's name is ");
            System.out.println(myDogs[2].name);
            //loop through the array and tell all dogs to bark
            int x = 0;
            while(x < myDogs.length){
                myDogs[x].bark();
                x = x + 1;
        }
    }

public void bark() {
    System.out.println(name + " says Ruff!");
}
public void eat(){
}

public void chaseCat(){}

}
