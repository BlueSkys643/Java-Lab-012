public class SolarSimulation {
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        Star sol = new Star("Sol", 100, 10, 0, 0);
        ss.addStar(sol);

        Planet p1 = new Planet("Aeora", 5, 2, 20, 0, sol, 0, 5);
        ss.addPlanet(p1);
        Planet p2 = new Planet("Borital", 15, 3, 40, 0, sol, 0, 5);
        ss.addPlanet(p2);

        ss.showPlanets();

        int timePeriod = 10;
        for(int i=0;i<timePeriod; i++) {
            ss.movePlanets();
            ss.showPlanets();
        }
        //here is where the math I am missing belongs

        System.out.println(p1.toString());

    }
}
