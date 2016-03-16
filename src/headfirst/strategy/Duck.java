package headfirst.strategy;

public abstract class Duck{
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  public Duck() {}
  public void setFlyBehavior(FlyBehavior fb){
    flyBehavior=fb;
  }
  public void setQuackBehavior(QuackBehaviorqb){
    quackBehavior=qb;
  }
  abstract void display();
  public void performFly(){
    flyBehavior.fly();
  }
  public void performQuack(){
    QuackBehavior.quack();
  }
  public void swim(){
    System.out.println("All ducks float, even decoys!");
  }
}