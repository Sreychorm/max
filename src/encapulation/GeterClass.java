package encapulation;

class Student{
    private String name;
    private Float score;
    public Student(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}
public class GeterClass {
   public static void main(String[] args) {
       Student obj=new Student();
       obj.setName("sophea");
       obj.setScore(120.5f);
       System.out.println("Name: "+obj.getName());
       System.out.println("Score: "+obj.getScore());
   }
}
