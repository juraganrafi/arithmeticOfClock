
package aoc;

public class FilterNumber {
    
    public String FilterNumber(String clock){
        
        String resource;
        int bunker=0;
        int i=0;
        boolean isDigit;
        char[] data = clock.toCharArray();
        
        while(i<data.length){
            isDigit = Character.isDigit(data[i]);
            if(isDigit==true){
                data[bunker]=data[i];
                bunker++;
            }
            i++;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(data, 0, bunker);
        return resource = stringBuffer.toString();
    }
}
