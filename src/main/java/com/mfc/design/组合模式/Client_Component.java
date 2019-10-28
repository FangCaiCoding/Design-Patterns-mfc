package com.mfc.design.组合模式;

/**
 * @author MouFangCai
 * @date 2019/10/19 17:17
 */
public class Client_Component {

    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("mfc总公司");
        root.add(new HR_Department("总公司-HR部"));
        root.add(new Finance_Department("总公司-财务部"));
        // 一级分公司
        ConcreteCompany subComp01 = new ConcreteCompany("01分公司");
        subComp01.add(new HR_Department("01分公司-HR部"));
        subComp01.add(new Finance_Department("01分公司-财务部"));
        root.add(subComp01);
        // 二级办事处
        ConcreteCompany subComp02 = new ConcreteCompany("01办事处");
        subComp02.add(new HR_Department("01办事处-HR部"));
        subComp02.add(new Finance_Department("01办事处-财务部"));
        subComp01.add(subComp02);

        System.out.println("\n公司架构图：");
        root.display(1);

        System.out.println("\n部门职责详情：");
        root.lineOfDuty();

    }
}
