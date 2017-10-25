
package com.dnb.gcms.common.domain;

import java.util.HashMap;
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
    "isOutOfBusiness",
    "isMailUndeliverable",
    "isMarketable",
    "isTelephoneDisconnected"
})
public class DunsControlStatus {

    @JsonProperty("isOutOfBusiness")
    private Boolean isOutOfBusiness;
    @JsonProperty("isMailUndeliverable")
    private Boolean isMailUndeliverable;
    @JsonProperty("isMarketable")
    private Boolean isMarketable;
    @JsonProperty("isTelephoneDisconnected")
    private Boolean isTelephoneDisconnected;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isOutOfBusiness")
    public Boolean getIsOutOfBusiness() {
        return isOutOfBusiness;
    }

    @JsonProperty("isOutOfBusiness")
    public void setIsOutOfBusiness(Boolean isOutOfBusiness) {
        this.isOutOfBusiness = isOutOfBusiness;
    }

    public DunsControlStatus withIsOutOfBusiness(Boolean isOutOfBusiness) {
        this.isOutOfBusiness = isOutOfBusiness;
        return this;
    }

    @JsonProperty("isMailUndeliverable")
    public Boolean getIsMailUndeliverable() {
        return isMailUndeliverable;
    }

    @JsonProperty("isMailUndeliverable")
    public void setIsMailUndeliverable(Boolean isMailUndeliverable) {
        this.isMailUndeliverable = isMailUndeliverable;
    }

    public DunsControlStatus withIsMailUndeliverable(Boolean isMailUndeliverable) {
        this.isMailUndeliverable = isMailUndeliverable;
        return this;
    }

    @JsonProperty("isMarketable")
    public Boolean getIsMarketable() {
        return isMarketable;
    }

    @JsonProperty("isMarketable")
    public void setIsMarketable(Boolean isMarketable) {
        this.isMarketable = isMarketable;
    }

    public DunsControlStatus withIsMarketable(Boolean isMarketable) {
        this.isMarketable = isMarketable;
        return this;
    }

    @JsonProperty("isTelephoneDisconnected")
    public Boolean getIsTelephoneDisconnected() {
        return isTelephoneDisconnected;
    }

    @JsonProperty("isTelephoneDisconnected")
    public void setIsTelephoneDisconnected(Boolean isTelephoneDisconnected) {
        this.isTelephoneDisconnected = isTelephoneDisconnected;
    }

    public DunsControlStatus withIsTelephoneDisconnected(Boolean isTelephoneDisconnected) {
        this.isTelephoneDisconnected = isTelephoneDisconnected;
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

    public DunsControlStatus withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isOutOfBusiness).append(isMailUndeliverable).append(isMarketable).append(isTelephoneDisconnected).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DunsControlStatus) == false) {
            return false;
        }
        DunsControlStatus rhs = ((DunsControlStatus) other);
        return new EqualsBuilder().append(isOutOfBusiness, rhs.isOutOfBusiness).append(isMailUndeliverable, rhs.isMailUndeliverable).append(isMarketable, rhs.isMarketable).append(isTelephoneDisconnected, rhs.isTelephoneDisconnected).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
