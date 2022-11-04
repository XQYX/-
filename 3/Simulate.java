package xuankeSystem;

import java.util.Objects;
import java.util.Scanner;

//定义类
public class Simulate {
    //主函数
    public static void main(String[] args) {
        //设置课程数组并添加课程2
        Main[] cour = new Main[5];
        //实例化多个课程对象
        Main c1 = new Main(202101, "C#", "教师2", "教106", 1, "8：00-9：40", 76);
        //课程对象添加到课程数组
        cour[0] = c1;
        Main c2 = new Main(202102, "线代", "教师7", "教303", 2, "15:30-17:10", 70);
        cour[1] = c2;
        Main c3 = new Main(202103, "离散", "教师13", "教300", 3, "19:00-21:25", 68);
        cour[2] = c3;
        Main c4 = new Main(202104, "Java", "教授2", "综1702", 4, "8：00-11：40", 481);
        cour[3] = c4;
        Main c5 = new Main(202105, "C++", "教师6", "综0618", 5, "13:30-3:30", 40);
        cour[4] = c5;
        //获取控制台的输入
        Scanner in = new Scanner(System.in);
        //界面
        System.out.println("\n********************学生选课系统********************\n" +
                "                        请选择您的身份:\n" +
                "                     教师请按1  学生请按2");
        int a = in.nextInt();
        //教师查看课表的操作2
        if (a == 1) {
            System.out.println("请输入ID：");
            int id = in.nextInt();
            System.out.println("请输入姓名：");
            String name = in.next();
            System.out.println("请输入性别：");
            String sex = in.next();
            //实例化教师对象
            Teacher tea = new Teacher(id, name, sex);
            //循环课程数组，将某教师的课程添加到教师个人课表数组里
            for (int i = 0; i < cour.length; i++) {
                if (cour[i] == null) {
                    break;
                } else {
                    //字符串比较用Objects.equals()，如果老师的名字和课程里老师的名字对应，就导入到这个老师的课表里
                    if (Objects.equals(tea.name, cour[i].teacher)) {
                        tea.daoru(cour[i]);
                    } else {
                        continue;
                    }
                }
            }
            //输出老师课表
            tea.tea_show();
        }

        //学生操作界面
        if (a == 2) {
            System.out.println("请输入学号：");
            int id = in.nextInt();
            System.out.println("请输入姓名：");
            String name = in.next();
            System.out.println("请输入性别：");
            String sex = in.next();
            System.out.println("请输入专业：");
            String major = in.next();
            Student stu = new Student(id, name, sex, major);
            System.out.print("你的专业可以选择以下选课程：\n");
            // 显示所有课程信息
            for (int i = 0; i < cour.length; i++) {
                if (cour[i] == null) {
                    break;
                } else {
                    System.out.print("课程号：" + cour[i].id);
                    System.out.print(" 课程名：" + cour[i].name);
                    System.out.print(" 授课教师：" + cour[i].teacher);
                    System.out.print(" 上课地点：" + cour[i].place);
                    System.out.print(" 上课时间：周" + cour[i].week + " " + cour[i].time);
                    System.out.println(" 课程人数：" + cour[i].stu_num);
                }
            }
            System.out.println("请输入课程号进行选课：");
            int class_id = in.nextInt();

            stu.xuanke(class_id, cour);

            for (int i = 0; ; i++) {
                System.out.println("继续选课输入“1”，退课输入“2”，查看课表输入“3”，退出“4”");
                int b = in.nextInt();
                if (b == 1) {
                    System.out.println("请输入课程号选课：");
                    int class_idd = in.nextInt();
                    stu.xuanke(class_idd, cour);
                }
                if (b == 2) {
                    System.out.println("请输入课程号退课：");
                    int class_idd = in.nextInt();
                    stu.tuike(class_idd);
                }
                if (b == 3) {
                    stu.stu_show();
                }
                if (b == 4) {
                    break;
                }
            }
        }
    }
}

