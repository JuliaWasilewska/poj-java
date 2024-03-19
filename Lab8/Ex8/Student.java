package Lab8.Ex8;

public class Student implements Comparable<Student>{
    String name;
    String surname;
    String index;

    public Student(String name, String surname, String index) {
        this.name = name;
        this.surname = surname;
        this.index = index;
    }
    @Override
    public int compareTo(Student student) {
        int temp = Integer.parseInt(this.index.substring(1));
        int temp2 = Integer.parseInt(student.index.substring(1));
        if(temp == temp2){
            return 0;
        }
        if(temp > temp2){
            return 1;
        }
        else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + index;
    }
}
