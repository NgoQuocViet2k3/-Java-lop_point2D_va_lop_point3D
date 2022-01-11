package com.codegym;

public class Main {

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D=new Point2D(3,2);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D=new Point3D(3,2,5);
        System.out.println(point3D);

        Point2D p= new Point3D(2,3,4);
        System.out.println(((Point3D)p).getZ());
    }
}
