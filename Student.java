package shiyan4;

public class Student {
    private int Studnetnumber;
    private String Studnetname;
    private Laboratory[] laboratory1;
    private double moneyEarned;

    public Student(int Studnetnumber, String Studnetname, Laboratory[] laboratory1, double moneyEarned) {
        this.Studnetnumber = Studnetnumber;
        this.Studnetname = Studnetname;
        this.laboratory1 = laboratory1;
        this.moneyEarned = moneyEarned;
    }



    public Laboratory[] getlaboratory() {
        return laboratory1;
    }

    public double getmoneyEarned() {
        return moneyEarned;
    }



    public Laboratory[] setlaboratory(int N, Laboratory[] laboratory1, Laboratory laboratory2) {
        this.laboratory1[N] = laboratory2;
        return laboratory1;
    }

    public double setmoneyEarned(double moneyEarned) {
        this.moneyEarned += moneyEarned;
        return moneyEarned;
    }

    public double setmoney(double money) {
        moneyEarned -= money;
        return moneyEarned;
    }

    public void WorkStudyIncome(String[] List1, Student studnt) {
        try {
            for (int t = 0; t < 5; t++) {
                if (List1[t] == "优") {
                    studnt.setmoneyEarned(200);
                }
                if (List1[t] == "及格") {
                    studnt.setmoneyEarned(120);
                }
                if (List1[t] == "不及格") {
                    studnt.setmoneyEarned(1);
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
}
