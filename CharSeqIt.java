public class CharSeqIt{
	protected char[] arr;
	private int index;
	public CharSeqIt(CharSeq c){
		arr = c.str;
		index = 0;
	}
	public boolean hasNext(){
		return arr.length > index;
	}
	public char next() throws UsingIteratorPastEndException{
		if(index >= arr.length){
			throw new UsingIteratorPastEndException("CharSeqIt called past end");
		}
		char c = arr[index];
		index++;
		return c;
	}
}