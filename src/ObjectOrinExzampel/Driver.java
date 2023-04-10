package ObjectOrinExzampel;

public class Driver extends Person {
    public Driver(int year, String name){
        int birthYear = year;
        String fulName = name;
    }

    public void setDBGrade(String nameCourse , int grade){
        System.out.println("set DB with paramters " +nameCourse+"with grade  " + grade);

    }
    //פונקציה שמחזירה תשובה //
    public int getLicence(){
        System.out.println("into get license");
        int licenseLevel = 5;
        return licenseLevel;
    }
}

