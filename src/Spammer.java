public class Spammer {
    private String letters = "qwertyuiopasdfghjklzxcvbnm";
    private int seed;
    public Spammer(int seed){
        this.seed=seed;
    }

    public void activate(){
        System.out.println("Activating spammer");
    }

    public int next(){
        if(seed%2==0){
            seed = (seed*17)%19;
        }else if(seed%7==1){
            seed = (seed*73)%25;
        }else{
            seed = (seed*75)%26;
        }

        return seed;
    }

    public void spam(){
        int x=0;
        while(true){
            x = next();
            System.out.print(letters.charAt(x));
        }
    }
}
