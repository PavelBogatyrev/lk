package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * PortfolioAsset
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-19T14:46:18.566Z")

public class PortfolioAsset   {
  @JsonProperty("percentage")
  private BigDecimal percentage = null;

  @JsonProperty("currentValue")
  private BigDecimal currentValue = null;

  @JsonProperty("growth")
  private BigDecimal growth = null;

  public PortfolioAsset percentage(BigDecimal percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @ApiModelProperty(example = "10.0", value = "")
  public BigDecimal getPercentage() {
    return percentage;
  }

  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }

  public PortfolioAsset currentValue(BigDecimal currentValue) {
    this.currentValue = currentValue;
    return this;
  }

   /**
   * Get currentValue
   * @return currentValue
  **/
  @ApiModelProperty(example = "100.99", value = "")
  public BigDecimal getCurrentValue() {
    return currentValue;
  }

  public void setCurrentValue(BigDecimal currentValue) {
    this.currentValue = currentValue;
  }

  public PortfolioAsset growth(BigDecimal growth) {
    this.growth = growth;
    return this;
  }

   /**
   * Get growth
   * @return growth
  **/
  @ApiModelProperty(example = "10.0", value = "")
  public BigDecimal getGrowth() {
    return growth;
  }

  public void setGrowth(BigDecimal growth) {
    this.growth = growth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioAsset portfolioAsset = (PortfolioAsset) o;
    return Objects.equals(this.percentage, portfolioAsset.percentage) &&
        Objects.equals(this.currentValue, portfolioAsset.currentValue) &&
        Objects.equals(this.growth, portfolioAsset.growth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, currentValue, growth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioAsset {\n");
    
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    growth: ").append(toIndentedString(growth)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

