package xuankeSystem;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

//定义Main（course）类
public class Main {
    //课程的属性
    int id;
    String name;
    String teacher;  //授课教师
    String place;  //上课地点
    String time;  //上课时间
    int week;  //上课周几
    int stu_num;  //学生数量

    //构造函数
    Main(int id, String name, String teacher, String place, int week, String time, int stu_num){
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.place = place;
        this.week = week;
        this.time = time;
        this.stu_num = stu_num;

    }
}
