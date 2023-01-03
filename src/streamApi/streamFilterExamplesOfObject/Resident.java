package streamApi.streamFilterExamplesOfObject;

public class Resident {
        private String name;
        private String originCountry;
        private String visaStatus;

    public Resident() {
    }

    public Resident(String name, String originCountry, String visaStatus) {
        this.name = name;
        this.originCountry = originCountry;
        this.visaStatus = visaStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getVisaStatus() {
        return visaStatus;
    }

    public void setVisaStatus(String visaStatus) {
        this.visaStatus = visaStatus;
    }

    @Override
    public String toString() {
        return "Resident{" +
                "name='" + name + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", visaStatus='" + visaStatus + '\'' +
                '}';
    }
}
