package entity.classic;

import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.NotBlank;

//@Data
@Getter
@Setter
@ToString

public class Student {
    private String name;
    private String job;
    private Integer age;
    private Double money;

    @NotBlank(message = "兴趣爱好不能为空")
    private String hobby;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getJob() {
//        return job;
//    }
//
//    public void setJob(String job) {
//        this.job = job;
//    }
//
//    public String getHobby() {
//        return hobby;
//    }
//
//    public void setHobby(String hobby) {
//        this.hobby = hobby;
//    }
}