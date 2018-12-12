package tournaments;

public class Tournament1 {

	public int equidistantTriples(int[] coordinates) 
	{
		int trip = 0;

		for(int i =0; i < coordinates.length-2; i++)
			for(int j = i+1; j<coordinates.length -1; j++)
				for( int k =j+1; k<coordinates.length; k++)
				{
					int x = coordinates[i];
					int y = coordinates[j];
					int z = coordinates[k];

					float val = (((float)x+(float)z)/2);
					if (val == (float)y)
						trip++;
				}

		return trip;
	}


	public static void main(String[] args) 
	{
		Tournament1 t = new Tournament1();
		int[] coordinates = new int[]{1,2,4,6,7, 8};
		
		t.equidistantTriples(coordinates);
		
	}

}
