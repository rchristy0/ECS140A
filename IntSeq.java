public class IntSeq extends Seq {
	protected int[] ints;
	public IntSeq(int ... numbers){
		ints = numbers;
	}
	public String toString(){
		String rtn = String.format("[%d:", ints.length);
		for(int i:ints){
			rtn += ' ' + String.valueOf(i);
		}
		rtn += "]";
		return rtn;
	}
	public int posMax(){
		int rtn = -1;
		if(ints.length > 0){
			rtn = 0;
		}
		for(int i = 0; i < ints.length; i++){
			if (ints[i] > ints[rtn]){
				rtn = i;
			}
		}
		return rtn;
	}
}
