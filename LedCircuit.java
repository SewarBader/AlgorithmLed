
package application;

public class LedCircuit {

    @Override
	public String toString() {
		return "LedCircuit [numbeOfLED=" + numbeOfLED + ", permutationOfNumbers=" + permutationOfNumbers + "]";
	}

	public int numbeOfLED;//number of LED
    public int permutationOfNumbers;// permutation of numbers
    
    public LedCircuit(int numbeOfLED,int permutationOfNumbers) {
    	this.numbeOfLED=numbeOfLED;
    	this.permutationOfNumbers=permutationOfNumbers;
    	
    }

	public int getNumbeOfLED() {
		return numbeOfLED;
	}

	public void setNumbeOfLED(int numbeOfLED) {
		this.numbeOfLED = numbeOfLED;
	}

	public int getPermutationOfNumbers() {
		return permutationOfNumbers;
	}

	public void setPermutationOfNumbers(int permutationOfNumbers) {
		this.permutationOfNumbers = permutationOfNumbers;
	}

}
