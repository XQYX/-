# -一 实验目的 
1.分析学生选课系统
2.完成学生选课过程业务逻辑编程
二业务要求
1系统角色分析及类设计 
学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择课程。 
定义每种角色人员的属性，及其操作方法。 
属性：人员（编号、姓名、性别） 
教师（编号、姓名、性别、所授课程） 
学生（编号、姓名、性别、所选课程） 
课程（编号、课程名称、上课地点、时间、授课教师
2.基本要求 
设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。 
基于事件模型对业务逻辑编程，实现在界面上支持上述操作。 
针对操作过程中可能会出现的各种异常，做异常处理。 
基于输入/输出编程，支持学生、课程、教师等数据的读写操作。 
三.解题思路
首先定义出人员和课程id，姓名其次根据要求说明，挖掘其中的逻辑关系；容易发现，通过打印学生信息，可以实现对课程与老师信息的输出，故可以得到他们之间的包含关系：学生信息→课程信息→教师信息，考虑到一个学生只能选一门课，一门课只能由一个老师教授，可知这条单链包含关系就可以使其相关联。 
实验图 
https://github.com/XQYX/无标题.png
四实验感受
本次实验中主要是对Java学习有了很大的帮助，自己的代码从无数的bug中慢慢的把一个个红清除，它不但极大地加深了我对一些理论知识的理解，不仅使我在理论上对java有了全新的认识，在实践能力上也得到了提高.在我学习的语言中，我自己认为Java是一门比较强大的面向对象的编程语言，不仅仅是因为它的跨平台型还有它的较强的实用性，强悍的嵌入性。
开始我曾想过将数据库带入其中是否会更好编码，但数次尝试后最终选择了这个最简单的方法，不同版本间的jar替换也只能说是一知半解，但是本次实验仍给了我很大帮助
