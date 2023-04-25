package dailyClasses.day18_garbageCollection.practice;

public class Offer {

    String location, companyName, jobTytle;
    int salary;
    boolean hasBenefits, hasPTO,asWFH,isFullTime;

    public void setInfo(String location, String companyName, String jobTytle, int salary, boolean hasBenefits, boolean hasPTO, boolean asWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTytle = jobTytle;
        this.salary = salary;
        this.hasBenefits = hasBenefits;
        this.hasPTO = hasPTO;
        this.asWFH = asWFH;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTytle='" + jobTytle + '\'' +
                ", salary=" + salary +
                ", hasBenefits=" + hasBenefits +
                ", hasPTO=" + hasPTO +
                ", asWFH=" + asWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
