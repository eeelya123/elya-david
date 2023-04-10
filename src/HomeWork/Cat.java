package HomeWork;

public class Cat extends Animal {

    public Cat(boolean isTail, String name){
        boolean catGender = isTail;
        String catName = name;
    }

    public void goToEat(){
        System.out.println("the catis runing eat");

    }

    public void makenoise(){
        System.out.println("miao");
    }

}

