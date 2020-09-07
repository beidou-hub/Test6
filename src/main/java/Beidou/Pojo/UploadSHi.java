package Beidou.Pojo;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "shigu")
public class UploadSHi {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;
    private String acc_division_id;
    private String accident_id;
    private String Weather;
    private String weather_desc;
    private String location_type;
    private String location_type_desc;
    private String Regions;
    private String regions_desc;
    private String our_reason;
    private String our_reason_desc;
    private String direct_reason;
    private String indirect_reason;
    private String accident_type;
    private String accident_form;
    private String accident_form_desc;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAcc_division_id() {
        return acc_division_id;
    }

    public void setAcc_division_id(String acc_division_id) {
        this.acc_division_id = acc_division_id;
    }

    public String getAccident_id() {
        return accident_id;
    }

    public void setAccident_id(String accident_id) {
        this.accident_id = accident_id;
    }

    public String getWeather() {
        return Weather;
    }

    public void setWeather(String weather) {
        Weather = weather;
    }

    public String getWeather_desc() {
        return weather_desc;
    }

    public void setWeather_desc(String weather_desc) {
        this.weather_desc = weather_desc;
    }

    public String getLocation_type() {
        return location_type;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    public String getLocation_type_desc() {
        return location_type_desc;
    }

    public void setLocation_type_desc(String location_type_desc) {
        this.location_type_desc = location_type_desc;
    }

    public String getRegions() {
        return Regions;
    }

    public void setRegions(String regions) {
        Regions = regions;
    }

    public String getRegions_desc() {
        return regions_desc;
    }

    public void setRegions_desc(String regions_desc) {
        this.regions_desc = regions_desc;
    }

    public String getOur_reason() {
        return our_reason;
    }

    public void setOur_reason(String our_reason) {
        this.our_reason = our_reason;
    }

    public String getOur_reason_desc() {
        return our_reason_desc;
    }

    public void setOur_reason_desc(String our_reason_desc) {
        this.our_reason_desc = our_reason_desc;
    }

    public String getDirect_reason() {
        return direct_reason;
    }

    public void setDirect_reason(String direct_reason) {
        this.direct_reason = direct_reason;
    }

    public String getIndirect_reason() {
        return indirect_reason;
    }

    public void setIndirect_reason(String indirect_reason) {
        this.indirect_reason = indirect_reason;
    }

    public String getAccident_type() {
        return accident_type;
    }

    public void setAccident_type(String accident_type) {
        this.accident_type = accident_type;
    }

    public String getAccident_form() {
        return accident_form;
    }

    public void setAccident_form(String accident_form) {
        this.accident_form = accident_form;
    }

    public String getAccident_form_desc() {
        return accident_form_desc;
    }

    public void setAccident_form_desc(String accident_form_desc) {
        this.accident_form_desc = accident_form_desc;
    }

    @Override
    public String toString() {
        return "UploadSHi{" +
                "Id='" + Id + '\'' +
                ", acc_division_id='" + acc_division_id + '\'' +
                ", accident_id='" + accident_id + '\'' +
                ", Weather='" + Weather + '\'' +
                ", weather_desc='" + weather_desc + '\'' +
                ", location_type='" + location_type + '\'' +
                ", location_type_desc='" + location_type_desc + '\'' +
                ", Regions='" + Regions + '\'' +
                ", regions_desc='" + regions_desc + '\'' +
                ", our_reason='" + our_reason + '\'' +
                ", our_reason_desc='" + our_reason_desc + '\'' +
                ", direct_reason='" + direct_reason + '\'' +
                ", indirect_reason='" + indirect_reason + '\'' +
                ", accident_type='" + accident_type + '\'' +
                ", accident_form='" + accident_form + '\'' +
                ", accident_form_desc='" + accident_form_desc + '\'' +
                '}';
    }
}
