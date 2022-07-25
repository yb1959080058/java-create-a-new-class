public class Cat{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(int age){
        this.age=age;
    }
   public void move(){
       System.out.println(name+age+"走路")
   }
     @Override
     public String toString(){
         return "Cat{"+"name'"+name+'\''+",age"+age+'}';
     }
}