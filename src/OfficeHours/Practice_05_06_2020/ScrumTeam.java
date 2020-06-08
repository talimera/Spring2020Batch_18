package OfficeHours.Practice_05_06_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ScrumTeam {


        ArrayList<Tester> testers = new ArrayList<>();
        ArrayList<Developer> developers = new ArrayList<>();




    public void hireTester(Tester tester){
        testers.add(tester);
    }


    public void fireTester(long employeeId){
        testers.removeIf(p -> p.employeeId == employeeId);
    }

    public void hireDeveloper(Developer developer){
        developers.add(developer);
    }

    public void fireDeveloper(long employeeId){
        developers.removeIf(p -> p.employeeId == employeeId);
    }


}
