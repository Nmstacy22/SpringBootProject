package car.example.bean;

public class MyBean {
    private String message;

    public void setmessage(String message) {
        this.message = message;
    }
    public void showmessage(){

        System.out.println("message: " + message);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
