
package com.dnb.gcms.common.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "searchCandidates",
    "inquiryDetail",
    "candidatesMatchedQuantity",
    "transactionDetail",
    "candidatesReturnedQuantity"
})
public class Input {

    @JsonProperty("searchCandidates")
    private List<SearchCandidates> searchCandidates = new ArrayList<SearchCandidates>();
    @JsonProperty("inquiryDetail")
    private InquiryDetail inquiryDetail;
    @JsonProperty("candidatesMatchedQuantity")
    private Integer candidatesMatchedQuantity;
    @JsonProperty("transactionDetail")
    private TransactionDetail transactionDetail;
    @JsonProperty("candidatesReturnedQuantity")
    private Integer candidatesReturnedQuantity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("searchCandidates")
    public List<SearchCandidates> getSearchCandidates() {
        return searchCandidates;
    }

    @JsonProperty("searchCandidates")
    public void setSearchCandidates(List<SearchCandidates> searchCandidates) {
        this.searchCandidates = searchCandidates;
    }

    public Input withSearchCandidates(List<SearchCandidates> searchCandidates) {
        this.searchCandidates = searchCandidates;
        return this;
    }

    @JsonProperty("inquiryDetail")
    public InquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    @JsonProperty("inquiryDetail")
    public void setInquiryDetail(InquiryDetail inquiryDetail) {
        this.inquiryDetail = inquiryDetail;
    }

    public Input withInquiryDetail(InquiryDetail inquiryDetail) {
        this.inquiryDetail = inquiryDetail;
        return this;
    }

    @JsonProperty("candidatesMatchedQuantity")
    public Integer getCandidatesMatchedQuantity() {
        return candidatesMatchedQuantity;
    }

    @JsonProperty("candidatesMatchedQuantity")
    public void setCandidatesMatchedQuantity(Integer candidatesMatchedQuantity) {
        this.candidatesMatchedQuantity = candidatesMatchedQuantity;
    }

    public Input withCandidatesMatchedQuantity(Integer candidatesMatchedQuantity) {
        this.candidatesMatchedQuantity = candidatesMatchedQuantity;
        return this;
    }

    @JsonProperty("transactionDetail")
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }

    @JsonProperty("transactionDetail")
    public void setTransactionDetail(TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }

    public Input withTransactionDetail(TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
        return this;
    }

    @JsonProperty("candidatesReturnedQuantity")
    public Integer getCandidatesReturnedQuantity() {
        return candidatesReturnedQuantity;
    }

    @JsonProperty("candidatesReturnedQuantity")
    public void setCandidatesReturnedQuantity(Integer candidatesReturnedQuantity) {
        this.candidatesReturnedQuantity = candidatesReturnedQuantity;
    }

    public Input withCandidatesReturnedQuantity(Integer candidatesReturnedQuantity) {
        this.candidatesReturnedQuantity = candidatesReturnedQuantity;
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

    public Input withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(searchCandidates).append(inquiryDetail).append(candidatesMatchedQuantity).append(transactionDetail).append(candidatesReturnedQuantity).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Input) == false) {
            return false;
        }
        Input rhs = ((Input) other);
        return new EqualsBuilder().append(searchCandidates, rhs.searchCandidates).append(inquiryDetail, rhs.inquiryDetail).append(candidatesMatchedQuantity, rhs.candidatesMatchedQuantity).append(transactionDetail, rhs.transactionDetail).append(candidatesReturnedQuantity, rhs.candidatesReturnedQuantity).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
