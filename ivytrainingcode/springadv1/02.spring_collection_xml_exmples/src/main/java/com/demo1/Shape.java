package com.demo1;

import java.util.*;

public class Shape {
	private Set<Point> points;

	public void setPoints(Set<Point> points) {
		this.points = points;
		//System.out.println(points.getClass()); spring is using LinkedHashSet internally
	}

	public void printShape() {
		for (Point point : points)
			System.out.println(point);

	}
}
