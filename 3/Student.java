package xuankeSystem;

//定义学生类
public class Student extends fulei{
    //学生属性
    String major;
    Main[] stu_cour = new Main[5];//储存学生选的课程

    //构造函数
    Student(int id, String name, String sex, String major) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.major = major;
    }

    int i = 1;

    //选课函数
    void xuanke(int course_id, Main[] stu_c) {
        //输入的课程号与课组里某门课的课号相等，则将该门课添加到学生的个人课程数组里
        for (int a = 0; a < stu_c.length; a++) {
            if (course_id == stu_c[a].id) {
                for (int b = 0; b < stu_cour.length; b++) {
                    if (stu_cour[0] == null) {
                        stu_cour[i] = stu_c[a];
                        i++;
                        System.out.println("您已成功选上该课程！");
                        break;
                    }
                    if (stu_cour[0] != null) {
                        if (course_id == stu_cour[b].id) {
                            System.out.println("重复选择，请重新操作！");
                            break;
                        } else {
                            stu_cour[i] = stu_c[a];
                            i++;
                            System.out.println("您已成功选上该课程！");
                            break;
                        }
                    }
                }
                break;
            }
        }
    }

    //退课函数
    void tuike(int id) {
        //数组a用来储存学生退课后的课程
        Main[] a = new Main[5];
        //输入的课号与学生个人课组里某门课的课号相等，则将除该门课以外的其他课添加到数组a里，再把数组a又给stu_cour
        for (int i = 0, j = 0; i < stu_cour.length; i++) {
            //如果学生选的课不足5门，则跳过数组中的空值
            if (stu_cour[i] == null) {
                continue;
            } else {
                if (id == stu_cour[i].id) {
                    continue;
                } else {
                    a[j] = stu_cour[i];
                    j++;
                }
            }
        }
        stu_cour = a;
        System.out.println("您已成功退出该课程!");
    }

    //显示学生课表函数
    void stu_show() {
        System.out.println("学生课表");
        //循环学生个人课程数组，依次输出每门课程信息
        for (int i = 0; i <= this.i; i++) {
            if (stu_cour[i] == null) {
                continue;
            } else {
                System.out.print("课程号：" + stu_cour[i].id);
                System.out.print(" 课程名：" + stu_cour[i].name);
                System.out.print(" 授课教师：" + stu_cour[i].teacher);
                System.out.print(" 上课地点：" + stu_cour[i].place);
                System.out.print(" 上课时间：周" + stu_cour[i].week + " " + stu_cour[i].time);
                System.out.println(" 课程人数：" + stu_cour[i].stu_num);
            }
        }
    }

}
