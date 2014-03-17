public class CharSeq extends Seq{
	protected char [] str;
	public CharSeq(String v){
		str = v.toCharArray();
	}
	public String toString(){
		String rtn = String.format("{%d: \"", str.length);
		for(char c:str){
			rtn += c;
		}
		rtn += "\"}";
		return rtn;
	}
	public int posMax(){
		int rtn = -1;
		if(str.length > 0){
			rtn = 0;
		}
		for(int i = 0; i < str.length; i++){
			if (str[i] > str[rtn]){
				rtn = i;
			}
		}
		return rtn;
	}
}
