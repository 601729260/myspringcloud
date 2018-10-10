package com.wgn.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Company        :   mamahao.com
 * author         :   wangguannan
 * Date           :   2018/8/25
 * Time           :   下午3:39
 * Description    :
 */
@Entity   //注解的包 都是引用的 javax.persistence 下的
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @Min(value = 18, message = "禁止添加未成年人员！")
    private String age;

    @NotNull(message = "金额必传")
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", money=" + money +
                '}';
    }
}