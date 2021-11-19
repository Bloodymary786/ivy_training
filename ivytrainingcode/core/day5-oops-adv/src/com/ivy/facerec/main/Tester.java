package com.ivy.facerec.main;

import com.ivy.facerec.dao.Face;

public class Tester {

	public static void main(String[] args) {
		Face face=new Face();
		face.saveFacePixelToDb();
		com.ivy.facerec.ui.Face face2=new com.ivy.facerec.ui.Face();
		face2.printFacePixel();
	}
}
