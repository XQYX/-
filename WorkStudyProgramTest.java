package shiyan4;

public class WorkStudyProgramTest {
    public static double LatestNationalWageTaxStandard(double money) { // 依据《中华人民共和国个人所得税法》
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

    public static void SplitLine() {
        for (int i = 1; i < 45; i++) {
            System.out.print("——");
        }
        System.out.println();
    }

    public static void main(String[] args) { // 程序入口
        String _18weekScoringList1[] = { "优", "优", "优", "优", "优" };
        String _18weekScoringList2[] = { "及格", "及格", "及格", "及格", "及格" };


        Laboratory ComputerNetworkLaboratory = new Laboratory(1, "实验室1", _18weekScoringList1);
        Laboratory CompositionPrincipleLaboratory = new Laboratory(2, "实验室2", _18weekScoringList2);


        Laboratory moren1[] = new Laboratory[5];
        Laboratory moren2[] = new Laboratory[5];
        Student ZhangSan = new Student(1, "张三", moren1, 0);
        Student LiSi = new Student(2, "李四", moren2, 0);

        ZhangSan.setlaboratory(0, moren1, ComputerNetworkLaboratory); // 分配实验室
        LiSi.setlaboratory(1, moren1, CompositionPrincipleLaboratory);


        ZhangSan.WorkStudyIncome(ComputerNetworkLaboratory.getCleanlinessScore(), ZhangSan); // 为实验室评分
        LiSi.WorkStudyIncome(CompositionPrincipleLaboratory.getCleanlinessScore(),LiSi);

        SplitLine();
        SplitLine();
        System.out.println("欢迎使用学生实验室勤工俭学模拟系统！");
        SplitLine();
        SplitLine();
        System.out.println("张三同学 负责丨" + ZhangSan.getlaboratory()[0].getLaboratoryName()  + "丨");
        SplitLine();
        System.out.println("丨" + ZhangSan.getlaboratory()[0].getLaboratoryName() + "丨5周成绩如下:");
        SplitLine();
        for (int t = 0; t < 5; t++) {
            System.out.print(ZhangSan.getlaboratory()[0].getCleanlinessScore()[t] + " ");
        }
        System.out.println();
        SplitLine();
        System.out.println("其纳税前收入为" + ZhangSan.getmoneyEarned() + "元。"); // 税收前收入
        SplitLine();
        ZhangSan.setmoney(LatestNationalWageTaxStandard(ZhangSan.getmoneyEarned())); // 计算个人所得税
        System.out.println("其税收后收入为" + ZhangSan.getmoneyEarned() + "元。"); // 税收后收入
        SplitLine();
        SplitLine();
        System.out.println("李四同学 负责丨" + LiSi.getlaboratory()[1].getLaboratoryName() +"丨");
        SplitLine();
        System.out.println("丨" + LiSi.getlaboratory()[1].getLaboratoryName() + "丨5周成绩如下:");
        SplitLine();
        for (int t = 0; t < 5; t++) {
            System.out.print(LiSi.getlaboratory()[1].getCleanlinessScore()[t] + " ");
        }
        System.out.println();
        SplitLine();
       
        System.out.println("其纳税前收入为" + LiSi.getmoneyEarned() + "元。");
        SplitLine();
        LiSi.setmoney(LatestNationalWageTaxStandard(LiSi.getmoneyEarned()));
        System.out.println("其税收后收入为" + LiSi.getmoneyEarned() + "元。");
        SplitLine();
        SplitLine();
    }
}
