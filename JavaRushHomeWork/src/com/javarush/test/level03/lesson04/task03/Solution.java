package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg z1 = new Zerg();
        Zerg z2 = new Zerg();
        Zerg z3 = new Zerg();
        Zerg z4 = new Zerg();
        Zerg z5 = new Zerg();
        Zerg z6 = new Zerg();
        Zerg z7 = new Zerg();
        Zerg z8 = new Zerg();
        Zerg z9 = new Zerg();
        Zerg z10 = new Zerg();

        z1.name = "Zerg1";
        z2.name = "Zerg2";
        z3.name = "Zerg3";
        z4.name = "Zerg4";
        z5.name = "Zerg5";
        z6.name = "Zerg6";
        z7.name = "Zerg7";
        z8.name = "Zerg8";
        z9.name = "Zerg9";
        z10.name = "Zerg10";

        Protos pr1 = new Protos();
        Protos pr2 = new Protos();
        Protos pr3 = new Protos();
        Protos pr4 = new Protos();
        Protos pr5 = new Protos();

        pr1.name = "Protos1";
        pr2.name = "Protos2";
        pr3.name = "Protos3";
        pr4.name = "Protos4";
        pr5.name = "Protos5";

        Terran tr1 = new Terran();
        Terran tr2 = new Terran();
        Terran tr3 = new Terran();
        Terran tr4 = new Terran();
        Terran tr5 = new Terran();
        Terran tr6 = new Terran();
        Terran tr7 = new Terran();
        Terran tr8 = new Terran();
        Terran tr9 = new Terran();
        Terran tr10 = new Terran();
        Terran tr11 = new Terran();
        Terran tr12 = new Terran();

        tr1.name = "Terran1";
        tr2.name = "Terran2";
        tr3.name = "Terran3";
        tr4.name = "Terran4";
        tr5.name = "Terran5";
        tr6.name = "Terran6";
        tr7.name = "Terran7";
        tr8.name = "Terran8";
        tr9.name = "Terran9";
        tr10.name = "Terran10";
        tr11.name = "Terran11";
        tr12.name = "Terran12";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}