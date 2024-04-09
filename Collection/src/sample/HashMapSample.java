package sample;

import java.nio.channels.MembershipKey;
import java.util.HashMap;
import java.util.Map;

import javax.print.DocFlavor.STRING;

public class HashMapSample {

    public static void main(String[] args) {
        // TOSTRING成されたメソッド・スタブ
        Map<String, String> members = new HashMap<>();
        
        
        members.put("GK", "前川");
        members.put("DF", "菅原");
        members.put("MF", "守田");
        members.put("FW", "上田");
        
        
        String fw = members.get("FW");
        System.out.println("FWは：" + fw);
        
        
        members.put("FW", "細谷");
        System.out.println("１番目の要素（置換後）：" + members.get("FW"));
        
        
        System.out.println("GKの要素（削除前）：" + members.get("GK"));
        members.remove("GK");
        System.out.println("GKの要素（削除後）：" + members.get("GK"));
        
        
        
        for(Map.Entry<String, String> entry : members.entrySet()) {
            System.out.println("entrySet　キー：" + entry.getKey() + ",値：" + entry.getValue());
        }
        
        for(String key : members.keySet()) {
            System.out.println("Keyset キー：" + key + ", 値：" + members.get(key));
        }
        
        for(String value : members.values()) {
            System.out.println("Values 値：" + value);
            
        }
        
        int size = members.size();
        System.out.println("Mapのサイズ（クリア前）：" + size);
        members.clear();
        System.out.println("Mapのサイズ（クリア後）：" + members.size());
        
             
        
        
        
    }

}
