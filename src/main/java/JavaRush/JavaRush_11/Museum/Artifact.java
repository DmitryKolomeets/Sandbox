package JavaRush.JavaRush_11.Museum;

public class Artifact {

    int id;
    String culture;
    int age;

    public Artifact(int id) {
        this.id = id;
    }

    public Artifact(int id, String culture) {
        this.id = id;
        this.culture = culture;
    }

    public Artifact(int id, String  culture, int age) {
        this.id = id;
        this.culture=culture;
        this.age=age;
    }

    public static void main(String[] args) {

        Artifact artifact_1= new Artifact(23);
        Artifact artifact_2= new Artifact(83, "Indian");
        Artifact artifact_3= new Artifact(17, "Italian", 8);






    }

}
