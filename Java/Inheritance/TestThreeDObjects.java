import java.util.Scanner;

abstract class ThreeDObject_box_cube_cylinder_cone {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject_box_cube_cylinder_cone {
    double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject_box_cube_cylinder_cone {
    double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double wholeSurfaceArea() {
        return 6 * (side * side);
    }

    @Override
    double volume() {
        return Math.pow(side, 3);
    }
}

class Cylinder extends ThreeDObject_box_cube_cylinder_cone {
    double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject_box_cube_cylinder_cone {
    double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height / 3;
    }
}

 class TestThreeDObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions for a box (length width height):");
        Box box = new Box(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Enter side length for a cube:");
        Cube cube = new Cube(scanner.nextDouble());

        System.out.println("Enter dimensions for a cylinder (radius height):");
        Cylinder cylinder = new Cylinder(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Enter dimensions for a cone (radius height):");
        Cone cone = new Cone(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Box Surface Area: " + box.wholeSurfaceArea() + ", Volume: " + box.volume());
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea() + ", Volume: " + cube.volume());
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea() + ", Volume: " + cylinder.volume());
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea() + ", Volume: " + cone.volume());
    }
}
