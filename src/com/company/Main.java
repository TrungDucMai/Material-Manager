package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Material crispyFlour1 = new CrispyFlour("c01", "crispyflour.type1", 10, LocalDate.of(2020, Month.MARCH, 15), 20);
        Material crispyFlour2 = new CrispyFlour("c02", "crispyflour.type2", 20, LocalDate.of(2020, Month.MAY, 13), 20);
        Material crispyFlour3 = new CrispyFlour("c03", "crispyflour.type3", 25, LocalDate.of(2020, Month.JANUARY, 6), 40);
        Material crispyFlour4 = new CrispyFlour("c04", "crispyflour.type4", 65, LocalDate.of(2020, Month.JANUARY, 6), 50);
        Material meat1 = new Meat("Mo1", "Meat.type1", 40, LocalDate.of(2020, Month.OCTOBER, 20), 100 );
        Material meat2 = new Meat("Mo2", "Meat.type2", 45, LocalDate.of(2020, Month.MARCH, 30), 200 );
        Material meat3 = new Meat("Mo3", "Meat.type3", 60, LocalDate.of(2020, Month.FEBRUARY, 8), 115 );
        Material meat4 = new Meat("Mo4", "Meat.type4", 60, LocalDate.of(2020, Month.MAY, 8), 90 );

        Material[] materials = { crispyFlour1,crispyFlour2,crispyFlour3, meat1, meat2, meat3};
        MaterialManager trung = new MaterialManager();
        List<Material> materialList = new ArrayList<>();
        Collections.addAll(materialList, materials);
        trung.setMaterialList(materialList);
//        trung.showALl();
        trung.addElements(crispyFlour4);
//        trung.showALl();

        trung.removeELements(crispyFlour4);
//        trung.showALl();
        trung.editElements(meat4, 3);
        trung.showALl();





    }
}
