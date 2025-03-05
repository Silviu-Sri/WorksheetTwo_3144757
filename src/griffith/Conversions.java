package griffith;

public class Conversions {
    
	public double euroToDollar(double euro) {
	    return euro * 1.08;
	}

	public double dollarToEuro(double dollar) {
        return dollar * 0.93;
    }

	public int stringToInteger(String val) {
        return Integer.parseInt(val);
    }
	public String integerToString(int val) {
        return String.valueOf(val);
    }

    public String switchCase(String input) {
        return "";
    }
}