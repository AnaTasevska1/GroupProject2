package GroupProject2;

public abstract class Marks {
    int math;
    int calculus;
    int programming;
    Marks(int math,int calculus,int programming){
        this.math =math;
        this.calculus =calculus;
        this.programming =programming;
    }
    abstract double getPercentage();

}
class A extends Marks{
    A(int math,int calculus,int programming){
        super(math,calculus,programming);
    }
    @Override
    double getPercentage() {
        int sum = math + calculus + programming;
        double average = sum / 3.0;
        return average;
    }
}
class B extends Marks{
    int language;
    B(int math,int calculus,int programming,int language){
        super(math,calculus,programming);
        this.language=language;
    }
    @Override
    double getPercentage() {
        int sum= math + calculus + programming +language;
        double average=sum / 4.0;
        return average;
    }
}
class MarksTester {
    public static void main(String[] args) {
        Marks[] m1 = {new A(60, 80, 90), new B(85, 70, 75, 95)};
        for (Marks m2 : m1) {
            double result = m2.getPercentage();
            System.out.println(result);
        }
    }
}
/*
We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
 */
