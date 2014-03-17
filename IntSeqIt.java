public class IntSeqIt{
	protected int[] arr;
	private int index;
	public IntSeqIt(IntSeq i){
		arr = i.ints;
		index = 0;
	}
	public boolean hasNext(){
		return arr.length > index;
	}
	public int next() throws UsingIteratorPastEndException{
		if(index >= arr.length){
			throw new UsingIteratorPastEndException("IntSeqIt called past end");
		}
		int i = arr[index];
		index++;
		return i;
	}
}