public class F2{
	public static IntSeq ApplyToAll2 (Main.AA2 fun, IntSeq v1, IntSeq v2){
		int[] ints1 = {}, ints2 = {};
		int size = 0;
		
		IntSeqIt iter1 = new IntSeqIt(v1);
		IntSeqIt iter2 = new IntSeqIt(v2);
		while (iter1.hasNext()){
			size++;
			int[] temp = new int[size];
			System.arraycopy(ints1,0,temp,0,size - 1);
			try{
				temp[size - 1] = iter1.next();
			} catch (UsingIteratorPastEndException e) {
				break;
			}
			ints1 = temp;
		}
		size = 0;
		while (iter2.hasNext()){
			size++;
			int[] temp = new int[size];
			System.arraycopy(ints2,0,temp,0,size - 1);
			try{
				temp[size - 1] = iter2.next();
			} catch (UsingIteratorPastEndException e) {
				break;
			}
			ints2 = temp;
		}
		
		int len = ints1.length;
		if(ints1.length > ints2.length){
			len = ints2.length;
		}
		int[] result = new int[len];
		for(int i = 0; i < len; i++){
			result[i] = fun.go(ints1[i],ints2[i]);
		}
		return new IntSeq(result);
	}
}