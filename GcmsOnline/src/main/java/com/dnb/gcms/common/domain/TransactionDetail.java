
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
    "serviceVersion",
    "inLanguage",
    "transactionID",
    "transactionTimestamp"
})
public class TransactionDetail {

    @JsonProperty("serviceVersion")
    private String serviceVersion;
    @JsonProperty("inLanguage")
    private String inLanguage;
    @JsonProperty("transactionID")
    private String transactionID;
    @JsonProperty("transactionTimestamp")
    private String transactionTimestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("serviceVersion")
    public String getServiceVersion() {
        return serviceVersion;
    }

    @JsonProperty("serviceVersion")
    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public TransactionDetail withServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    @JsonProperty("inLanguage")
    public String getInLanguage() {
        return inLanguage;
    }

    @JsonProperty("inLanguage")
    public void setInLanguage(String inLanguage) {
        this.inLanguage = inLanguage;
    }

    public TransactionDetail withInLanguage(String inLanguage) {
        this.inLanguage = inLanguage;
        return this;
    }

    @JsonProperty("transactionID")
    public String getTransactionID() {
        return transactionID;
    }

    @JsonProperty("transactionID")
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public TransactionDetail withTransactionID(String transactionID) {
        this.transactionID = transactionID;
        return this;
    }

    @JsonProperty("transactionTimestamp")
    public String getTransactionTimestamp() {
        return transactionTimestamp;
    }

    @JsonProperty("transactionTimestamp")
    public void setTransactionTimestamp(String transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }

    public TransactionDetail withTransactionTimestamp(String transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
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

    public TransactionDetail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serviceVersion).append(inLanguage).append(transactionID).append(transactionTimestamp).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransactionDetail) == false) {
            return false;
        }
        TransactionDetail rhs = ((TransactionDetail) other);
        return new EqualsBuilder().append(serviceVersion, rhs.serviceVersion).append(inLanguage, rhs.inLanguage).append(transactionID, rhs.transactionID).append(transactionTimestamp, rhs.transactionTimestamp).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
