/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 11/02/2022
 */

class Tv {
    public void switchOn() {
        System.out.println("Tv is SwitchOn");
    }

    public void changeChannel() {
        System.out.println("Tv Channel is Changed");
    }
}

class SmartTv extends Tv {
    @Override
    public void switchOn() {
        System.out.println("Smart tv is switched On");
    }

    @Override
    public void changeChannel() {
        System.out.println("Smart Tv Channel is Changed");
    }

    public void browse() {
        System.out.println("smart tv browsing");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.changeChannel();
        t.switchOn();

        SmartTv st = new SmartTv();
        st.changeChannel();
        st.switchOn();
        st.browse();


        Tv tv = new SmartTv();
        tv.switchOn();
        tv.changeChannel();


    }


}