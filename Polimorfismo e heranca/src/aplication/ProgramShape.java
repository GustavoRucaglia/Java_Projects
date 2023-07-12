package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Shape;
import entities.enums.Color;
import entities.Rentangle;
import entities.Circle;
public class ProgramShape {

	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		
		List<Shape> figures = new ArrayList<>();
		System.out.println("Enter the number of shapes");
		int n = tcd.nextInt();
		
		for( int i = 0; i <= n; i++) {
			
			System.out.println("Shape #"+ i + "Data:");
			System.out.println("Retangle or circle (r/c)?");
			char ch = tcd.next().charAt(0);
			System.out.println("Color (Black/Blue/Red");
			Color color = Color.valueOf(tcd.next());
			if( ch == 'r') {
				System.out.println("width:");
				Double width = tcd.nextDouble();
				System.out.println("heigth:");
				Double height = tcd.nextDouble();
				figures.add(new Rentangle(color, width, height));
			}else {
				System.out.println("Radius:");
				Double radius = tcd.nextDouble();
				figures.add(new Circle(color, radius));
			}
		}
		System.out.println("Shapes areas:");
		for( Shape shape : figures) {
			System.out.println(shape.area());
		}
		tcd.close();
	}	
}
