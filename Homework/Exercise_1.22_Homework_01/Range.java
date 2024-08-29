public class Range{
    //is used for RandomStringGenerator
    //have to make sure a < n for range
    private char begin;
    private char end;

    public Range(char begin, char b){
        this.begin = begin;
        this.end = end;
    }

    public char getChar(){
        return (char)
        ((int)(Math.random()*(this.end-this.begin+1)+this.begin));
    }
}