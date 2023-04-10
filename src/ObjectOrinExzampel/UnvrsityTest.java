package ObjectOrinExzampel;

public class UnvrsityTest {
    public static void main(String[] args) {
        Stunent QA = new Stunent(34,"Elya","Daniel");
        Stunent english = new Stunent(2000,"Shai","Vazana");
        Driver driver1 = new Driver(2019,"roee");
        Driver driver2 = new Driver(2028,"Sagi");

        QA.setDBGrade("QA",87);
        english.setDBGrade("englis",95);
         driver1.setDBGrade("Alfa",2);
        int lisenseLevel = driver1.getLicence();
        driver2.getLicence();
        System.out.println("lisenceLevel "+lisenseLevel);
    }

}



