interface Fruit{
    //生长
    public void grow();
    //收获
    public void harvest();
    //种植
    public void plant();
}
class Apple implements Fruit{
    public void grow(){
        System.out.println("Apple is  growing");
    }
    public void harvest(){
        System.out.println("Apple has been  harvested");
    }
    public void plant(){
        System.out.println("Apple has been  planted");
    }
}
class Orange implements Fruit{
    public void grow(){
        System.out.println("Orange is  growing");
    }
    public void harvest(){
        System.out.println("Orange has been  harvested");
    }
    public void plant(){
        System.out.println("Orange has been  planted");
    }
}
class FruitGardener{
    public static Fruit getFruit(String which) throws Exception{
        if(which.equalsIgnoreCase("apple")){
            return new Apple();
        }else if(which.equalsIgnoreCase("orange")){
            return new Orange();
        }else{
            throw new Exception("No this Fruit");
        }
    }
}
class test  {
	public static void main (String[] args) throws java.lang.Exception	{
	    Fruit fruit=FruitGardener.getFruit("apple");
	    fruit.plant();
	    fruit.grow();
	    fruit.harvest();
	    fruit=FruitGardener.getFruit("orange");
	    fruit.plant();
	    fruit.grow();
	    fruit.harvest();
	}
}