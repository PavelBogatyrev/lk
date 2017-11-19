package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * AssetDynamicsItem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-19T14:46:18.566Z")

public class AssetDynamicsItem   {
  @JsonProperty("date")
  private Integer date = null;

  @JsonProperty("value")
  private BigDecimal value = null;

  @JsonProperty("growth")
  private BigDecimal growth = null;

  public AssetDynamicsItem date(Integer date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public Integer getDate() {
    return date;
  }

  public void setDate(Integer date) {
    this.date = date;
  }

  public AssetDynamicsItem value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public AssetDynamicsItem growth(BigDecimal growth) {
    this.growth = growth;
    return this;
  }

   /**
   * Get growth
   * @return growth
  **/
  @ApiModelProperty(value = "")
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
    AssetDynamicsItem assetDynamicsItem = (AssetDynamicsItem) o;
    return Objects.equals(this.date, assetDynamicsItem.date) &&
        Objects.equals(this.value, assetDynamicsItem.value) &&
        Objects.equals(this.growth, assetDynamicsItem.growth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, value, growth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetDynamicsItem {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

