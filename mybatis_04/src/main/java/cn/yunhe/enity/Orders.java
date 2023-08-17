package cn.yunhe.enity;

public class Orders {
    private  Integer id;
    private  Integer uid;
    private  String  ordertime;
    private  double money;
    private  User user;
    private  string name;

    public Orders() {
    }

    public Orders(Integer id, Integer uid, String ordertime, double money, User user) {
        this.id = id;
        this.uid = uid;
        this.ordertime = ordertime;
        this.money = money;
        this.user = user;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取
     * @return ordertime
     */
    public String getOrdertime() {
        return ordertime;
    }

    /**
     * 设置
     * @param ordertime
     */
    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime;
    }

    /**
     * 获取
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * 获取
     * @return user
     */
    public User getUser() {
        return user;
    }

    /**
     * 设置
     * @param user
     */
    public void setUser(User user) {
        this.user = user;
    }

    public String toString() {
        return "Orders{id = " + id + ", uid = " + uid + ", ordertime = " + ordertime + ", money = " + money + ", user = " + user + "}";
    }
}
