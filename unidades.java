package conversor;

public class unidades {
	

	    //faz a converçao de celsius para fahrenheit
	    public static double celsiusParaFahrenheit(double celsius) {
	        return (celsius * 9 / 5) + 32; // formula
	    }

	    //faz a converçao de  quilômetros para milhas
	    public static double quilometrosParaMilhas(double quilometros) {
	        return quilometros * 0.621371; // 1 km = 0.621371 milhas
	    }

	    //faz a converçao de gramas para libras
	    public static double gramasParaLibras(double gramas) {
	        return gramas * 0.00220462; // 1 grama = 0.00220462 libras
	    }
	}



