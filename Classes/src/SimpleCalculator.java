
public class SimpleCalculator {
		private double firstNumber;
		private double secondNumber;
		public double getFirstNumber() {
			return firstNumber;
		}
		public void setFirstNumber(double firstNumber) {
			this.firstNumber = firstNumber;
		}
		public double getSecondNumber() {
			return secondNumber;
		}
		public void setSecondNumber(double secondNumber) {
			this.secondNumber = secondNumber;
		}
		
		public double getAdditionResult() {
			double sum = this.firstNumber + this.secondNumber;
			return sum;
		}
		
		public double getSubtractionResult() {
			double result = this.firstNumber - this.secondNumber;
			return result;
		}
		
		
		public double getMultiplactionResult() {
			double result = this.firstNumber * this.secondNumber;
			return result;
		}
		public double getDivisionResult() {
			double result;;
			if(this.secondNumber !=0 )
			{
			result = this.firstNumber / this.secondNumber;
			}
			
			else
			{
				result = 0;
			}
			return result;
		}
}
