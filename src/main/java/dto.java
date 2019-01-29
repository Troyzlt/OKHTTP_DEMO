import java.util.List;

public class dto {
    private String userCode;

    private String companyCode;

    private List<String> ebsCodeList;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public List<String> getEbsCodeList() {
        return ebsCodeList;
    }

    public void setEbsCodeList(List<String> ebsCodeList) {
        this.ebsCodeList = ebsCodeList;
    }

    public dto(String userCode, String companyCode) {
        this.userCode = userCode;
        this.companyCode = companyCode;
    }
}
