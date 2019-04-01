package com.vehicleexteriorupgrade;

public abstract class Paint {
	PaintFactory paintFactory = new PaintFactory();

	abstract String getPaintDetails();
	abstract double getPaintPrice(String paintColor);
	String getSelectedPaintDetails(Paint p,String color) {
		//Paint paint = paintFactory.getPaint(model);
		return "Color :"+color+" \t"
				+ "  Cost : "+p.getPaintPrice(color);
		
		
	}
	
}
