
package com.dnb.gcms.common.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "yearlyRevenue"
})
public class Financial {

    @JsonProperty("yearlyRevenue")
    private List<YearlyRevenue> yearlyRevenue = new ArrayList<YearlyRevenue>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("yearlyRevenue")
    public List<YearlyRevenue> getYearlyRevenue() {
        return yearlyRevenue;
    }

    @JsonProperty("yearlyRevenue")
    public void setYearlyRevenue(List<YearlyRevenue> yearlyRevenue) {
        this.yearlyRevenue = yearlyRevenue;
    }

    public Financial withYearlyRevenue(List<YearlyRevenue> yearlyRevenue) {
        this.yearlyRevenue = yearlyRevenue;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Financial withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(yearlyRevenue).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Financial) == false) {
            return false;
        }
        Financial rhs = ((Financial) other);
        return new EqualsBuilder().append(yearlyRevenue, rhs.yearlyRevenue).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
