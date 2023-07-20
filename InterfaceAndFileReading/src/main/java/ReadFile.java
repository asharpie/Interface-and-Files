import java.io.IOException;

public interface ReadFile {

	public abstract int[] populateArray(String fileName) throws IOException;
	
	public abstract void calcValues(int[] nums);
}
