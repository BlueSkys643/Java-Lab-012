public class Planet extends CelestialBody{
    public Planet (String Name, double Mass, double Radius, double xPos, double yPos, Star star, double xSpeed, double ySpeed) {
        super(Name, Mass, Radius, xPos, yPos, xSpeed, ySpeed);
        double xStar = star.getxPosition();
        double yStar = star.getyPosition();
        double distance = (Math.sqrt((this.getxPosition()-xStar)*(this.getxPosition()-xStar) + (this.getyPosition()-yStar)*(this.getyPosition()-yStar)));
    }


    public void movePlanet() {
        //get a starting position
        //using speed and distance from star calculate the vector in which the planet travels
        //set its new position along that vector
    }
    public void moveTo (double newX, double newY) {
        this.setxPosition(newX);
        this.setyPosition(newY);
    }
}
