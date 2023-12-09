class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        // 영단어를 숫자로 대체
        numbers = numbers.replace("zero", "0");
        numbers = numbers.replace("one", "1");
        numbers = numbers.replace("two", "2");
        numbers = numbers.replace("three", "3");
        numbers = numbers.replace("four", "4");
        numbers = numbers.replace("five", "5");
        numbers = numbers.replace("six", "6");
        numbers = numbers.replace("seven", "7");
        numbers = numbers.replace("eight", "8");
        numbers = numbers.replace("nine", "9");
        
        // 문자열 numbers를 long으로 변환 후 리턴
        answer = Long.parseLong(numbers); 
        return answer;
    }
}