import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    public String encode(List<String> strs){
        StringBuilder encoded = new StringBuilder();
        for(String str : strs){
            encoded.append(str.length());
            encoded.append("#");
            encoded.append(str);
        }
        return encoded.toString();
    }
    public List<String> decode(String str){
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            char ch = str.charAt(j);
            while(ch != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            String word = str.substring(j + 1, j + length + 1);
            decoded.add(word);
            i = j + 1 + length;
        }
        return decoded;
    }
}
