package xuankeSystem;

//定义老师类
public class Teacher extends fulei {
    //老师属性
    Main[] tea_cour = new Main[5];
    int i;

    //构造函数
    Teacher(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    //导入老师各自的课程
    void daoru(Main tea_c) {
        tea_cour[i] = tea_c;
        i++;
    }

    //老师课表
    void tea_show() {
        System.out.println(this.name + "老师的课表");
        for (int i = 0; i < tea_cour.length; i++) {
            if (tea_cour[i] == null) {
                continue;
            } else {
                System.out.print("课程号：" + tea_cour[i].id);
                System.out.print(" 课程名：" + tea_cour[i].name);
                System.out.print(" 授课老师：" + tea_cour[i].teacher);
                System.out.print(" 上课地点：" + tea_cour[i].place);
                System.out.print(" 上课时间：周" + tea_cour[i].week + " " + tea_cour[i].time);
                System.out.println(" 课程人数：" + tea_cour[i].stu_num);
            }
        }
    }
}
