
import java.util.ArrayList;
import java.util.List;


public class DataSectors implements DataContainer {
	
	private List<String> sectors = new ArrayList<String>();
	
	public DataSectors() {
		sectors.add("S1");
		sectors.add("S2");
		sectors.add("S3");
		sectors.add("S4");
		
	}
	
	@Override
	public Iterator getIterator() {
		return new SectorIterator();
		
	}
	
	private class SectorIterator implements Iterator {
		
		private int position;
		
		@Override
		public boolean hasNext() {
			if(position < sectors.size())
				return true;
			return false;
			
		}
		
		@Override 
		public Object next() {
			if (this.hasNext())
				return sectors.get(position++);
			return null;
		}
		
	}

}
