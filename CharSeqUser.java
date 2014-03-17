public class CharSeqUser{
	public static int posMax1(CharSeq s){
		CharSeqIt iter = new CharSeqIt(s);
		int rtn = -1;
		int index = 0;
		int maxVal = 0;
		int tmp;
		try{
			while (iter.hasNext()){
				tmp = iter.next();
				if (tmp > maxVal){
					rtn = index;
					maxVal = tmp;
				}
				index++;
			}
			return rtn;
		} catch (UsingIteratorPastEndException e){
			return rtn;
		}
	}
	public static int posMax2(CharSeq s){
		CharSeqIt iter = new CharSeqIt(s);
		int rtn = -1;
		int index = 0;
		int maxVal = 0;
		int tmp;
		while(true){
			try{
				tmp = iter.next();
				if (tmp > maxVal){
					rtn = index;
					maxVal = tmp;
				}
				index++;
			} catch (UsingIteratorPastEndException e){
				return rtn;
			}
		}
	}
}