package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Instrument;
import java.util.ArrayList;
import java.util.List;

/**
 * PortfolioInstruments
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-19T14:46:18.566Z")

public class PortfolioInstruments   {
  @JsonProperty("shares")
  private List<Instrument> shares = new ArrayList<Instrument>();

  @JsonProperty("bonds")
  private List<Instrument> bonds = new ArrayList<Instrument>();

  @JsonProperty("pai")
  private List<Instrument> pai = new ArrayList<Instrument>();

  @JsonProperty("cash")
  private List<Instrument> cash = new ArrayList<Instrument>();

  public PortfolioInstruments shares(List<Instrument> shares) {
    this.shares = shares;
    return this;
  }

  public PortfolioInstruments addSharesItem(Instrument sharesItem) {
    this.shares.add(sharesItem);
    return this;
  }

   /**
   * Get shares
   * @return shares
  **/
  @ApiModelProperty(value = "")
  public List<Instrument> getShares() {
    return shares;
  }

  public void setShares(List<Instrument> shares) {
    this.shares = shares;
  }

  public PortfolioInstruments bonds(List<Instrument> bonds) {
    this.bonds = bonds;
    return this;
  }

  public PortfolioInstruments addBondsItem(Instrument bondsItem) {
    this.bonds.add(bondsItem);
    return this;
  }

   /**
   * Get bonds
   * @return bonds
  **/
  @ApiModelProperty(value = "")
  public List<Instrument> getBonds() {
    return bonds;
  }

  public void setBonds(List<Instrument> bonds) {
    this.bonds = bonds;
  }

  public PortfolioInstruments pai(List<Instrument> pai) {
    this.pai = pai;
    return this;
  }

  public PortfolioInstruments addPaiItem(Instrument paiItem) {
    this.pai.add(paiItem);
    return this;
  }

   /**
   * Get pai
   * @return pai
  **/
  @ApiModelProperty(value = "")
  public List<Instrument> getPai() {
    return pai;
  }

  public void setPai(List<Instrument> pai) {
    this.pai = pai;
  }

  public PortfolioInstruments cash(List<Instrument> cash) {
    this.cash = cash;
    return this;
  }

  public PortfolioInstruments addCashItem(Instrument cashItem) {
    this.cash.add(cashItem);
    return this;
  }

   /**
   * Get cash
   * @return cash
  **/
  @ApiModelProperty(value = "")
  public List<Instrument> getCash() {
    return cash;
  }

  public void setCash(List<Instrument> cash) {
    this.cash = cash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioInstruments portfolioInstruments = (PortfolioInstruments) o;
    return Objects.equals(this.shares, portfolioInstruments.shares) &&
        Objects.equals(this.bonds, portfolioInstruments.bonds) &&
        Objects.equals(this.pai, portfolioInstruments.pai) &&
        Objects.equals(this.cash, portfolioInstruments.cash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shares, bonds, pai, cash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioInstruments {\n");
    
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    bonds: ").append(toIndentedString(bonds)).append("\n");
    sb.append("    pai: ").append(toIndentedString(pai)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
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

