class Solution {
    public int calPoints(String[] operations) {
    List<Integer> list = new ArrayList<>();
    int result = 0;


    for (String operation : operations) {
        if ("+".equals(operation)) {
            Integer sum = list.get(list.size() - 1) + list.get(list.size() - 2);
            list.add(sum);
            result += sum;
        } else if ("C".equals(operation)) {
            int value =  list.get(list.size() - 1);
            result -= value;
            list.remove(list.size()-1);
        } else if ("D".equals(operation)) {
            int value =  list.get(list.size() - 1) * 2;
            result += value;
            list.add(value);
        } else {
            int value = Integer.parseInt(operation);
            list.add(value);
            result += value;
        }
    }

    return result;
}
}