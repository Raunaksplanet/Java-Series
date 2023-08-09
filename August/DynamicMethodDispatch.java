class uppercls{
    public void firstmsg(){
        System.out.println("1 msg from 1 class");
    }
    public void secondmsg(){
        System.out.println("2 msg from 1 class");
    }
}

class lowercls extends uppercls{
    @Override
    public void secondmsg(){
        System.out.println("2 msg from 2 class");
    }
    public void thirdmsg(){
        System.out.println("3 msg from 2 class");
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {
        uppercls obj = new lowercls();
        obj.firstmsg();
        obj.secondmsg();
//      obj.thirdmsg(); // by making obj of upper class we can call

    }
}