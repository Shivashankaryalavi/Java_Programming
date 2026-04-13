package NumberProgramming;

   static  int prime(int num){
    int count =0;

    for(int i =2;i<=num/2;i++){
        if(num%i==0){
            count++;
        }
    }
    if(count==2){
        return num;
    }
}
class int rev(prime(num)){
    int rev=0
    while(num>0){
        int ld = num%10;
        rev = rev*10+ld;
        num/=10;
    }
    return rev;
    
}

public class Emirp {
    public static void main(String[] args) {
        int num = 13;
        prime(num);
    }
    
}
