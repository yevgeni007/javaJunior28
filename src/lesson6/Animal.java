package lesson6;

public class Animal {
    private String breed;
    private int age;
    private String voice;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
