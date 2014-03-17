public class Minus{
	public static IntSeq minus (IntSeq i1, IntSeq i2){
		int[] ints1 = {}, ints2 = {};
		int index = 0;
		int size = 0;
		
		IntSeqIt iter1 = new IntSeqIt(i1);
		IntSeqIt iter2 = new IntSeqIt(i2);
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
		
		boolean notIn;
		size = ints1.length;
		int[] result = new int[size];
		
		for(int i: ints1){
			notIn = true;
			for(int k: ints2){
				if(i == k){
					notIn = false;
					size--;
					int[] temp = new int[size];
					System.arraycopy(result,0,temp,0,size);
					result = temp;
					index--;
					break;
				}
			}
			if(notIn){
				result[index] = i;
			}
			index++;
		}
		return new IntSeq(result);
	}
	public static CharSeq minus (CharSeq c1, CharSeq c2){
		char[] chars1 = {}, chars2 = {};
		int index = 0;
		int size = 0;

		CharSeqIt iter1 = new CharSeqIt(c1);
		CharSeqIt iter2 = new CharSeqIt(c2);
		while (iter1.hasNext()){
			size++;
			char[] temp = new char[size];
			System.arraycopy(chars1,0,temp,0,size - 1);
			try{
				temp[size - 1] = iter1.next();
			} catch (UsingIteratorPastEndException e) {
				break;
			}
			chars1 = temp;
		}
		size = 0;
		while (iter2.hasNext()){
			size++;
			char[] temp = new char[size];
			System.arraycopy(chars2,0,temp,0,size - 1);
			try{
				temp[size - 1] = iter2.next();
			} catch (UsingIteratorPastEndException e) {
				break;
			}
			chars2 = temp;
		}
		
		boolean notIn;
		size = chars1.length;
		char[] result = new char[size];
		
		for(char i: chars1){
			notIn = true;
			for(char k: chars2){
				if(i == k){
					notIn = false;
					size--;
					char[] temp = new char[size];
					System.arraycopy(result,0,temp,0,size);
					result = temp;
					index--;
					break;
				}
			}
			if(notIn){
				result[index] = i;
			}
			index++;
		}
		return new CharSeq (String.valueOf(result));
	}
	public static CharSeq minus (IntSeq i, CharSeq c){
		char[] chars = {};
		int[] ints = {};
		int index = 0;
		int size = 0;
		
		CharSeqIt iter1 = new CharSeqIt(c);
		IntSeqIt iter2 = new IntSeqIt(i);
		while (iter1.hasNext()){
			size++;
			char[] temp = new char[size];
			System.arraycopy(chars,0,temp,0,size - 1);
			try{
				temp[size - 1] = iter1.next();
			} catch (UsingIteratorPastEndException e) {
				break;
			}
			chars = temp;
		}
		size = 0;
		while (iter2.hasNext()){
			size++;
			int[] temp = new int[size];
			System.arraycopy(ints,0,temp,0,size - 1);
			try{
				temp[size - 1] = iter2.next();
			} catch (UsingIteratorPastEndException e) {
				break;
			}
			ints = temp;
		}
		
		boolean notIn;
		size = chars.length;
		char[] result = new char[size];
		
		for(int j = 0; j < chars.length; j++){
			notIn = true;
			for(int k: ints){
				if(j == k){
					notIn = false;
					size--;
					char[] temp = new char[size];
					System.arraycopy(result,0,temp,0,size);
					result = temp;
					index--;
					break;
				}
			}
			if(notIn){
				result[index] = chars[j];
			}
			index++;
		}
		return new CharSeq (String.valueOf(result));
	}
	public static CharSeq minus (CharSeq c, IntSeq i){
		return minus(i,c);
	}
}