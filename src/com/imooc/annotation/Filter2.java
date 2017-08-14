package com.imooc.annotation;

/**
 * Created by xiongpc on 2017/8/14.
 */
@Table("department")
public class Filter2 {

    @Column("id")
    private int id;

    @Column("name")
    private String userName;

    @Column("leader")
    private String leader;

    @Column("amount")
    private int amount;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
