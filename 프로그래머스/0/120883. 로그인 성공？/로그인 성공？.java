import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        HashMap<String, String> map = new HashMap<String, String>();
        
        for(int i = 0; i < db.length; i++) {
            String k = db[i][0];
            String v = db[i][1];
            
            map.put(k, v); // 해시맵에 저장
        }
        
        String id = id_pw[0]; // 아이디
        String pw = id_pw[1]; // 비밀번호
        
        if(map.containsKey(id)) {
            if(map.get(id).equals(pw)) {
                answer = "login"; // 아이디 비번 모두 일치
            } else {
                answer = "wrong pw"; // 비번 불일치
            }
        } else {
            answer = "fail"; // 아이디 불일치
        }
        
        return answer;
    }
}