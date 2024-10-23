package conversor;

public class Main {

	    public static void main(String[] args) {
	        
	    	// tambem testa as converçoes
	        // temperatura em celsius 
	        double celsius = 29.0; 
	        double fahrenheit = unidades.celsiusParaFahrenheit(celsius);
	        System.out.println(celsius + " °C é igual a " + fahrenheit + " °F");

	        // distancia em quilometros
	        double quilometros = 150.0; 
	        double milhas = unidades.quilometrosParaMilhas(quilometros);
	        System.out.println(quilometros + " km é igual a " + milhas + " milhas");

	        // massa em gramas
	        double gramas = 700.0; 
	        double libras = unidades.gramasParaLibras(gramas);
	        System.out.println(gramas + " g é igual a " + libras + " libras");
	    }
	}



