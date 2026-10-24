public class ChapterCounting {
    public int count(int n, int a, int b){
        int count = 0;
        if(a < b){
            count = b - a + 1;
        }
        else if(b < a){
            count = (n - 1 - b + a + 1);
        }
        else{
            return 0;
        }
        return count;
    }
}
