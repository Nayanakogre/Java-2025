package in.xworkz.exception.ex;

public class AgeException extends Exception{
    int age=18;

    public AgeException(String message) {
    }

    public void ageValidation(int age) throws AgeException {
        if(age>18)
        {
            throw new AgeException("age is less");
        }
    }
    public void ageCheck(int age)throws AgeException
    {
        if(age<100)
        {
            throw new AgeException("No such age");
        }
    }
    public void admitAgeForSchool(int age)throws AgeException
    {
        if(age>=5)
        {
            throw new AgeException("Age is less to admit school");
        }
    }
}
