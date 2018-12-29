public enum Month {
    JAN(1,"JAN"),
    FEB(2,"FEB"),
    MAR(3,"MAR"),
    APR(4,"APR"),
    MAY(5,"MAY"),
    JUN(6,"JUN"),
    JUL(7,"JUL"),
    AUG(8,"AUG"),
    SEP(9,"SEP"),
    OCT(10,"OCT"),
    NOV(11,"NOV"),
    DEC(12,"DEC");

    private Integer month;

    private String desc;

    Month(Integer month, String desc){
        this.month = month;
        this.desc = desc;
    }

    public static Month getMonthByDesc(String desc){
        for (Month month : Month.values()) {
            if (month.getDesc().contentEquals(desc.toUpperCase())){
                return month;
            }
        }
        throw new RuntimeException("找不到月份！");
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
