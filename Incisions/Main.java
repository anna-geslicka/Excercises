public class Main {

public static void main(String[] args) {
int[] samples = {6,4,3,4,2,1,4,2,8,1,0};
int possibleIncisions = 2;

boolean wasIncision = false;
int distance = 0;
int count = 0;

for(int i = 1; i < samples.length -1; i++) {
if(wasIncision) distance++;

// epicentre
if(samples[i-1] < samples[i] && samples[i] > samples[i+1]) {
count++;

i+= distance;
distance = 0;
wasIncision = true;
}
}

if(possibleIncisions < count)
System.out.println(possibleIncisions);
else
System.out.println(count);


}

}