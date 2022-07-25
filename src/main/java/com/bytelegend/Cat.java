public class Cat{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge(int age) {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void move() {
        System.out.println(name + "在动" + age);
    }
    @Override
    public String toString() {
        return "Cat{" + "name'" + name + '\'' + ",age" + age + '}';
    }
}
    