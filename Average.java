class Average {
	
	public static float average(int[] values) {
		float total = 0;

		for(int i = 0;i < values.length;i++){
			total = total + values[i];}



		return total / values.length;
	}
}
