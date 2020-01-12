class BaseballGame628 {
    public int calPoints(String[] ops) {
        ListIterator<String> iterator = Arrays.asList(ops).listIterator();
		List<Integer> scores = new ArrayList<Integer>();
		while(iterator.hasNext()) {

			String currentValue = iterator.next();
			if(isNumeric(currentValue)) {
				scores.add(Integer.parseInt(currentValue));
			}
			if(currentValue.equals("C")) {
				scores.remove(scores.size() - 1);
			}
			if(currentValue.equals("D")) {
				scores.add(scores.get(scores.size() - 1) * 2);
			}
			if(currentValue.equals("+")) {
				scores.add(scores.get(scores.size() - 1) + scores.get(scores.size() - 2));
			}
		}
        return scores.stream().collect(Collectors.summingInt(Integer::intValue));
    }
    public boolean isNumeric(String str) { 
        try {  
            Integer.parseInt(str);  
            return true;
        } catch(NumberFormatException e){  
            return false;  
        }  
    }
}