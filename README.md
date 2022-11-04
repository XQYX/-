#  实验三 继承关系

#### 一.实验目的

1. 掌握权限访问控制修饰符的选用
2. 掌握继承的使用

#### 二.业务要求

1. 保持实验二的代码和readme版本不变
2. 新建代码仓库，在实验二代码的基础上完成本次实验 3.业务过程同实验二，但在类的设计上，采用父类-子类的继承关系定义
3. 测试实体类分别存放于不同的package中，验证权限访问控制，继承后属性及方法的可见性

#### 三.解题思路

1. 以实验二的初始代码为基础，依旧设计模拟学生选课系统，先定义了四个类：Simulate（模拟选课系统），Main（课程course），Teacher，Student
2. 在类的设计上，本次采用父类-子类继承关系。定义一个新的类命名为Fulei（父类），在Fulei中设定ID，姓名和性别三项。利用继承，在Teacher类和Student类使用“public class A extends B”，如此使父类的ID姓名性别可以在Teacher和Student上使用，完成父类-子类继承。
3. 最终进行错误排除，修复问题，完成含有继承关系的改进的学生模拟选课系统。

#### 四.流程图

![6821p383c11cd522fc86e3239677d9d](https://gitee.com/ZhangYhan/Zyh1245/raw/master/6821p383c11cd522fc86e3239677d9d.png))

#### 五.关键代码

1. 通过extends关键字继承Fulei，使Teacher和Student类可以继承父类的ID，姓名，性别 

   public class Student extends Fulei {

   public class Teacher extends Fulei {

2. 定义一个数组Main[]，用数组存储学生的课程 

   String major；

   Main [] stu_cour = new Main[5] ;

3. 对选课函数进行细微修改

   ```
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
   ```

#### 六.系统运行截图

3-1 教师登录操作

![43da0c3700fc3279e858024653cf246](https://gitee.com/ZhangYhan/Zyh1245/raw/master/43da0c3700fc3279e858024653cf246.png)

3-2 学生登陆操作

![df27eca529790ff443101eaa80584ea](https://gitee.com/ZhangYhan/Zyh1245/raw/master/df27eca529790ff443101eaa80584ea.png)

3-3 学生选课与退课

![ff6963ca36bf66eb7dd28d180cda48f](https://gitee.com/ZhangYhan/Zyh1245/raw/master/ff6963ca36bf66eb7dd28d180cda48f.png)

3-4 学生课表输出

![44d88131ee6b7b7ebf4ab2f1a0a9de4](https://gitee.com/ZhangYhan/Zyh1245/raw/master/44d88131ee6b7b7ebf4ab2f1a0a9de4.png)



#### 七.感想与体会

这次的实验是对我在上周的学生模拟系统的补丁加强，除了加入父类-子类继承以外，我还需要尝试能不能做得更好。首先我创建了一个父类，并且成功让Teacher类和Student类继承了父类的信息，在以后的实验中，我可以利用继承来更快地写出代码，多了一个思路，多了一份智慧。实验结束，我能更细心地检查代码的错误，学会了更加的细心，而且最大的收获就是：把之前不理解的知识找回来了。
