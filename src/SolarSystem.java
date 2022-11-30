import java.util.ArrayList;

public class SolarSystem {
    //create star
    private Star sol;
    private ArrayList<Planet> planets;

    public SolarSystem() {
        planets = new ArrayList<>();
    }

    //add planet method
    public void addPlanet(Planet p) {
        planets.add(p);
    }

    //add star method
    public void addStar(Star s) {
        this.sol = s;
    }
    //move planets method
    public void movePlanets() {
        double G = 0.1;
        double dt = 0.01;

        for (Planet p : this.planets) {
            p.moveTo(
                    p.getxPosition() + dt * p.getxSpeed(),
                    p.getyPosition() + dt * p.getySpeed()
            );

            double rx = this.sol.getxPosition() - p.getxPosition();
            double ry = this.sol.getyPosition() - p.getyPosition();

        }
    }

    public void showPlanets() {
        for(Planet p : this.planets) {
            System.out.println(p);
        }
    }

}
