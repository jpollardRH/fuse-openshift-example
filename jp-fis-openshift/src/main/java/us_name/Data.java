
package us_name;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name_us",
    "day",
    "month"
})
public class Data {

    @JsonProperty("name_us")
    private String nameUs;
    @JsonProperty("day")
    private int day;
    @JsonProperty("month")
    private int month;

    /**
     * 
     * @return
     *     The nameUs
     */
    @JsonProperty("name_us")
    public String getNameUs() {
        return nameUs;
    }

    /**
     * 
     * @param nameUs
     *     The name_us
     */
    @JsonProperty("name_us")
    public void setNameUs(String nameUs) {
        this.nameUs = nameUs;
    }

    /**
     * 
     * @return
     *     The day
     */
    @JsonProperty("day")
    public int getDay() {
        return day;
    }

    /**
     * 
     * @param day
     *     The day
     */
    @JsonProperty("day")
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * 
     * @return
     *     The month
     */
    @JsonProperty("month")
    public int getMonth() {
        return month;
    }

    /**
     * 
     * @param month
     *     The month
     */
    @JsonProperty("month")
    public void setMonth(int month) {
        this.month = month;
    }

}
