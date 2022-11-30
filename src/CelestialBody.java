public abstract class CelestialBody {

    private String name;
    private double mass;
    private double radius;
    private double xPosition;
    private double yPosition;
    private double xSpeed;
    private double ySpeed;
    public CelestialBody (String Name, double Mass, double Radius, double xPos, double yPos, double xSpeed, double ySpeed) {
        this.name = Name;
        this.mass = Mass;
        this.radius = Radius;
        this.xPosition = xPos;
        this.yPosition = yPos;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return String.format("%s: x:%f, y:%f", this.name, this.xPosition, this.yPosition);
    }

    public double getxPosition() {
        return xPosition;
    }
    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }
    public void setyPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
}
