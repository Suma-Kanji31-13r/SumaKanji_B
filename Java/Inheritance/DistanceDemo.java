package Inheritance;
class Distance {
    double distanceMiles;
    Distance(double distanceMiles) {
        this.distanceMiles = distanceMiles; }
    void travelTime() {
        double time = distanceMiles / 60; // Assuming speed is 60 miles per hour
        System.out.println("Time taken to cover the distance: " + time + " hours"); } }
class DistanceMKS extends Distance {
    DistanceMKS(double distanceMiles) {
        super(distanceMiles); } @Override
    void travelTime() {
        double distanceKilometers = distanceMiles * 1.60934; // Convert miles to kilometers
        double time = distanceKilometers / 100; // Assuming speed is 100 kilometers per hour
        System.out.println("Time taken to cover the distance (in MKS): " + time + " hours"); } }
public class DistanceDemo {
    public static void main(String[] args) {
        Distance distance = new Distance(100);
        System.out.println("Distance in miles:");
        distance.travelTime();
        DistanceMKS distanceMKS = new DistanceMKS(100);
        System.out.println("\nDistance in miles converted to kilometers (MKS):");
        distanceMKS.travelTime(); }
}
