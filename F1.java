public class F1{
	public static CharSeq ApplyToAll1 (Main.AA1 fun, CharSeq s){
		char[] chars = {};
		int size = 0;
		
		CharSeqIt iter = new CharSeqIt(s);
		while (iter.hasNext()){
			size++;
			char[] temp = new char[size];
			System.arraycopy(chars,0,temp,0,size - 1);
			try{
				temp[size - 1] = iter.next();
			} catch (UsingIteratorPastEndException e) {
				break;
			}
			chars = temp;
		}
		
		char[] result = new char[chars.length];
		
		for(int i = 0; i < chars.length; i++){
			result[i] = fun.go(chars[i]);
		}
		return new CharSeq(String.valueOf(result));
	}
}