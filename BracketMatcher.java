public class BracketMatcher{
	char openBracks[] = {'(','[','{','<'};
	char closeBracks[]= {')',']','}','>'};
	int index;

	boolean isOpeningBracket(char c){
		for (int i = 0; i < openBracks.length; i++){
			if (c == openBracks[i])
				return true;
		}
		return false;
		
	}

	boolean isClosingBracket(char c){
		for (int i = 0; i < closeBracks.length; i++){
			if (c == closeBracks[i])
				return true;
		}
		return false;
	
	}

	boolean corresponds(char open, char close){
		if (!isOpeningBracket(open))
			return false;
		if (!isClosingBracket(close))
			return false;
		int m = 0;
		int n = 0;
		for (int i = 0; i < openBracks.length; i++){
			if (open == openBracks[i]) {
				m = i;
				break;
			}
		}
		for (int j = 0; j < closeBracks.length; j++){
			if (close == closeBracks[j]) {
				n = j;
				break;
			}
		}
		if (m == n)
			return true;
		else
			return false;
	}

	int checkBrackets(String s){
		Stack bracks = new Stack(1000);
		for (int i = 0; i < s.length(); i++){
			index = i;
			if (isOpeningBracket(s.charAt(i)))
				bracks.push(s.charAt(i));
			if (isClosingBracket(s.charAt(i)))
				if (bracks.isEmpty())
					return index;
				else if (!corresponds(bracks.pop(), s.charAt(i)))
					return index;

		}
		if (bracks.isEmpty())
			return -1;
		else
			return index;
	}
}