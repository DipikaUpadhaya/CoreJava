package com.dipika.encapsulation.area;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        DataIO dataIO= new DataIO();
        boolean status= true;
        System.out.println("################");
        while(status){
            System.out.println("1.Triangle");
            System.out.println("2.Square");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");

            int choice=scanner.nextInt();
            switch(choice){
                case 1:
                    boolean triangleStatus=true;
                    Triangle triangle;
                    System.out.println("###################");
                    while(triangleStatus){
                        System.out.println("1.Area of Triangle:");
                        System.out.println("2.Perimeter of Triangle:");
                        System.out.println("3.Exit:");
                        System.out.println("Enter your choice.");
                        choice=scanner.nextInt();

                        switch (choice){
                            case 1:
                                triangle=dataIO.readTriangleData();
                                Double area= triangle.calculateArea();
                                System.out.println("The area of triangle is: "+area);
                                break;
                            case 2:
                                triangle= dataIO.readTriangleData();
                                Float perimeter= triangle.calculatePerimeter();
                                System.out.println("The perimeter of triangle is: "+perimeter);
                                break;
                            case 3:
                                triangleStatus=false;
                                break;
                            default:
                                System.out.println("Invalid input!");
                        }
                    }
                    break;
                case 2:
                    boolean squareStatus=true;
                    Square square;
                    System.out.println("###############");
                    while(squareStatus){
                        System.out.println("1.Area of Square.");
                        System.out.println("2.Perimeter of Square.");
                        System.out.println("3.Exit.");
                        System.out.println("4.Enter your choice.");
                        choice=scanner.nextInt();
                        switch(choice){
                            case 1:
                                square= dataIO.readSquareData();
                                Float area= square.calculateArea();
                                dataIO.display("The area of square is: ", area);
                                break;
                            case 2:
                                square= dataIO.readSquareData();
                                Float perimeter= square.calculatePerimeter();
                                dataIO.display("The perimeter of square is: ",perimeter);
                                break;
                            case 3:
                                squareStatus=false;
                                break;
                            default:
                                System.out.println("Invalid input!");
                        }

                    }
                case 3:
                    status=false;
                    System.out.println("Thanks");
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }

    }
}
