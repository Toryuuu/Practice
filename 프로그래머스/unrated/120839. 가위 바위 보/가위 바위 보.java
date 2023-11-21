import java.util.HashMap;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        HashMap<String, String> rspMap = new HashMap<>();
        
        rspMap.put("가위", "2");
        rspMap.put("바위", "0");
        rspMap.put("보", "5");
        
        // rsp를 한 자씩 분리해서 문자 배열에 저장
        String[] rspArray = rsp.split(""); 
       
        for(String r : rspArray) {
            if(r.equals("2")) {
                answer += rspMap.get("바위");
            } else if(r.equals("0")) {
                answer += rspMap.get("보");
            } else
                answer += rspMap.get("가위");
        }
     
        return answer;
    }
}