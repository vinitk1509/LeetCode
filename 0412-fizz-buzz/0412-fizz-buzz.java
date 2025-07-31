class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answerList = new ArrayList<>();
        for(int i =1 ; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                answerList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answerList.add("Fizz");
            } else if (i % 5 == 0) {
                answerList.add("Buzz");
            } else {
                answerList.add(Integer.toString(i));
            }
        }
        return answerList;
    }
}