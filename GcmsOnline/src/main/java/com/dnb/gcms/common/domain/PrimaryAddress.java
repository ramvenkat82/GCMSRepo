
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
    "addressCountry",
    "streetAddress",
    "postalCode",
    "addressLocality",
    "addressRegion"
})
public class PrimaryAddress {

    @JsonProperty("addressCountry")
    private AddressCountry addressCountry;
    @JsonProperty("streetAddress")
    private StreetAddress streetAddress;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("addressLocality")
    private AddressLocality addressLocality;
    @JsonProperty("addressRegion")
    private AddressRegion addressRegion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("addressCountry")
    public AddressCountry getAddressCountry() {
        return addressCountry;
    }

    @JsonProperty("addressCountry")
    public void setAddressCountry(AddressCountry addressCountry) {
        this.addressCountry = addressCountry;
    }

    public PrimaryAddress withAddressCountry(AddressCountry addressCountry) {
        this.addressCountry = addressCountry;
        return this;
    }

    @JsonProperty("streetAddress")
    public StreetAddress getStreetAddress() {
        return streetAddress;
    }

    @JsonProperty("streetAddress")
    public void setStreetAddress(StreetAddress streetAddress) {
        this.streetAddress = streetAddress;
    }

    public PrimaryAddress withStreetAddress(StreetAddress streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public PrimaryAddress withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    @JsonProperty("addressLocality")
    public AddressLocality getAddressLocality() {
        return addressLocality;
    }

    @JsonProperty("addressLocality")
    public void setAddressLocality(AddressLocality addressLocality) {
        this.addressLocality = addressLocality;
    }

    public PrimaryAddress withAddressLocality(AddressLocality addressLocality) {
        this.addressLocality = addressLocality;
        return this;
    }

    @JsonProperty("addressRegion")
    public AddressRegion getAddressRegion() {
        return addressRegion;
    }

    @JsonProperty("addressRegion")
    public void setAddressRegion(AddressRegion addressRegion) {
        this.addressRegion = addressRegion;
    }

    public PrimaryAddress withAddressRegion(AddressRegion addressRegion) {
        this.addressRegion = addressRegion;
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

    public PrimaryAddress withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(addressCountry).append(streetAddress).append(postalCode).append(addressLocality).append(addressRegion).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrimaryAddress) == false) {
            return false;
        }
        PrimaryAddress rhs = ((PrimaryAddress) other);
        return new EqualsBuilder().append(addressCountry, rhs.addressCountry).append(streetAddress, rhs.streetAddress).append(postalCode, rhs.postalCode).append(addressLocality, rhs.addressLocality).append(addressRegion, rhs.addressRegion).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
