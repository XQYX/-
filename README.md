# 实验四 学生实验室勤工俭学模拟

#### 实验目的

- 掌握Java中类的定义；
- 掌握staticfinal等修饰符的用法；
- 了解异常的使用方法，并在程序中根据输入情况做异常处理。


#### 实验内容

- 某学校为了给学生提供勤工俭学机会，选派了部分学生参与实验室的卫生清洁工作。每个学生被分配若干间实验室，视实验室的清洁打分情况给予劳务补贴。
- 例如：学生“张三”负责了“计算机网络实验室”、“组成原理实验室”的清洁情况，每周被检查。在某次检查中，“计算机网络实验室”卫生得“优”，“组成原理实验室”卫生得“及格”，一次“优”按x元记录补助，一次“及格”按y元记录补助。（卫生标准分级、相应的等级补助标准，自行规定）
- 按国家的税务制度，劳务费应按国家规定纳税，请统计一学期学生的实际收入。（国家最新工资纳税标准，请自行检索）。

1. 设计系统中的类（如学生、实验室等等）；
2. 一学期按18周计；
3. 每个学生负责的实验室数量不一定相同；
4. 对学期勤工俭学收入和纳税进行统计，求得实际收入；
5. 国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用staticfinal修饰定义。
6. 根据处理情况，要在程序中考虑做异常处理。



#### 解决思路

1. 定义学生、实验室和测试类，并创建属性和赋值； 

2. 以字符串数组的形式创建实验室类实例对象以及学生类实例对象并赋值；

3. 构造纳税的方法在测试类中，并在程序入口处调用方法，得出结果。

#### 流程图

https://github.com/XQYX/-/blob/main/%E6%97%A0%E6%A0%87%E9%A2%98.png

#### 关键代码

1.  18周评分税收

```
    public void WorkStudyIncome(String[] List1, Student studnt) {
        try {
            for (int t = 0; t < 18; t++) {
                if (List1[t] == "优") {
                    studnt.setmoneyEarned(200);
                }
                if (List1[t] == "及格") {
                    studnt.setmoneyEarned(120);
                }
                if (List1[t] == "不及格") {
                    studnt.setmoneyEarned(0);
                }
                if (List1[t] == "优" || List1[t] == "及格" || List1[t] == "不及格") {
                    continue;
                }
                System.out.println("数据异常！");
                break;
            }
        } catch (Exception e) {
            System.out.println("数据异常！");
        }
    }
```

2.  纳税


```
public class WorkStudyProgramTest {
    static double LatestNationalWageTaxStandard(double money) {
        double TaxReceivable = 0;
        try {
            if (0 <= money && money <= 5000) {
                TaxReceivable = 0;
            }
            if (5000 < money && money <= 8000) {
                TaxReceivable = money * 0.03;
            }
            if (8000 < money && money <= 17000) {
                TaxReceivable = money * 0.10;
            }
            if (17000 < money && money <= 30000) {
                TaxReceivable = money * 0.20;
            }
            if (30000 < money && money <= 40000) {
                TaxReceivable = money * 0.25;
            }
            if (TaxReceivable < 0) {
                System.out.println("收入金额有误！");
            }
        } catch (Exception e) {
            System.out.println("收入金额有误！");
        }
        final double TaxReceivable1 = TaxReceivable;
        return TaxReceivable1;
    }
#### 感想与体会

通过本次实验，让我对类这个知识点有了更深刻的理解和学习，同时，掌握staticfinal等修饰符的用法，和了解异常的使用方法，并在程序中根据输入情况做异常处理。根据多次的代码编写，也减少了代码冗余情况，使其更加明了简洁。最后这次试验对我之后的学习提供较大的帮助。
