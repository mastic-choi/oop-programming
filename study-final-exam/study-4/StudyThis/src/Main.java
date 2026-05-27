public class Main{
  public static class Person{
    public String name;
    private int age;
    Person(){
      this("no name", 20);
    }
    Person(String name, int age){
      this.name = name;
      this.age = age;
    }
  }

  public static void main(String[] args){
    Person p = new Person(); // this() 호출
    Person p1 = new Person("p1", 30);
    System.out.println(p.name);
    System.out.println(p1.name);
  }//end of main
}