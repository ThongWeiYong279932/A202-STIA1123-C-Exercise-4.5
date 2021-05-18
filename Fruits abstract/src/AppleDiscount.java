
class AppleDiscount implements determineDiscountRate{		//Implements interface of determineDicountRate
	public double determineDiscountRate(){					//Implements abstract method from determineDiscountRate
		return 0.9;
	}
}

class BananaDiscount implements determineDiscountRate{		//Implements interface of determineDicountRate
	public double determineDiscountRate(){					//Implements abstract method from determineDiscountRate
		return 0.85;
	}
}

class GrapeDiscount implements determineDiscountRate{	//Implements interface of determineDicountRate
	public double determineDiscountRate(){				//Implements abstract method from determineDiscountRate
		return 0.80;
	}
}
