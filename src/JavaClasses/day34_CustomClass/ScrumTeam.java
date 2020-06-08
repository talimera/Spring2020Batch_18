package JavaClasses.day34_CustomClass;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testersteam = new ArrayList<>();

    public void hireTester(Tester tester){
        testersteam.add(tester);
    }

    public void fireTester(long employeeID){
        testersteam.removeIf(p -> p.employeeID == employeeID);
    }





}
