package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PortfolioAsset;
import java.math.BigDecimal;

/**
 * Portfolio
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-19T14:46:18.566Z")

public class Portfolio   {
  @JsonProperty("income")
  private BigDecimal income = null;

  @JsonProperty("outcome")
  private BigDecimal outcome = null;

  @JsonProperty("value")
  private BigDecimal value = null;

  @JsonProperty("shares")
  private PortfolioAsset shares = null;

  @JsonProperty("bonds")
  private PortfolioAsset bonds = null;

  @JsonProperty("pai")
  private PortfolioAsset pai = null;

  public Portfolio income(BigDecimal income) {
    this.income = income;
    return this;
  }

   /**
   * Get income
   * @return income
  **/
  @ApiModelProperty(example = "100.99", value = "")
  public BigDecimal getIncome() {
    return income;
  }

  public void setIncome(BigDecimal income) {
    this.income = income;
  }

  public Portfolio outcome(BigDecimal outcome) {
    this.outcome = outcome;
    return this;
  }

   /**
   * Get outcome
   * @return outcome
  **/
  @ApiModelProperty(example = "100.99", value = "")
  public BigDecimal getOutcome() {
    return outcome;
  }

  public void setOutcome(BigDecimal outcome) {
    this.outcome = outcome;
  }

  public Portfolio value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "100.99", required = true, value = "")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public Portfolio shares(PortfolioAsset shares) {
    this.shares = shares;
    return this;
  }

   /**
   * Get shares
   * @return shares
  **/
  @ApiModelProperty(value = "")
  public PortfolioAsset getShares() {
    return shares;
  }

  public void setShares(PortfolioAsset shares) {
    this.shares = shares;
  }

  public Portfolio bonds(PortfolioAsset bonds) {
    this.bonds = bonds;
    return this;
  }

   /**
   * Get bonds
   * @return bonds
  **/
  @ApiModelProperty(value = "")
  public PortfolioAsset getBonds() {
    return bonds;
  }

  public void setBonds(PortfolioAsset bonds) {
    this.bonds = bonds;
  }

  public Portfolio pai(PortfolioAsset pai) {
    this.pai = pai;
    return this;
  }

   /**
   * Get pai
   * @return pai
  **/
  @ApiModelProperty(value = "")
  public PortfolioAsset getPai() {
    return pai;
  }

  public void setPai(PortfolioAsset pai) {
    this.pai = pai;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Portfolio portfolio = (Portfolio) o;
    return Objects.equals(this.income, portfolio.income) &&
        Objects.equals(this.outcome, portfolio.outcome) &&
        Objects.equals(this.value, portfolio.value) &&
        Objects.equals(this.shares, portfolio.shares) &&
        Objects.equals(this.bonds, portfolio.bonds) &&
        Objects.equals(this.pai, portfolio.pai);
  }

  @Override
  public int hashCode() {
    return Objects.hash(income, outcome, value, shares, bonds, pai);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Portfolio {\n");
    
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    bonds: ").append(toIndentedString(bonds)).append("\n");
    sb.append("    pai: ").append(toIndentedString(pai)).append("\n");
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

