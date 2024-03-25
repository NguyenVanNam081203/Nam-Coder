package BT_TrenLop;

public class User {
    private  int id;
    private String name;
    private String password;
    private  float money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public User(int id, String name, String password, float money) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.money = money;
    }
}
