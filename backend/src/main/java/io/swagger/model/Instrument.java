package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * Instrument
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-19T14:46:18.566Z")

public class Instrument   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("logo")
  private String logo = null;

  @JsonProperty("anmount")
  private Integer anmount = null;

  @JsonProperty("vaue")
  private BigDecimal vaue = null;

  @JsonProperty("income")
  private BigDecimal income = null;

  @JsonProperty("percentgage")
  private BigDecimal percentgage = null;

  public Instrument name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Имя инструмента
   * @return name
  **/
  @ApiModelProperty(value = "Имя инструмента")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Instrument logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * URL на логотип эмитента
   * @return logo
  **/
  @ApiModelProperty(value = "URL на логотип эмитента")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public Instrument anmount(Integer anmount) {
    this.anmount = anmount;
    return this;
  }

   /**
   * Количество инструментов
   * @return anmount
  **/
  @ApiModelProperty(value = "Количество инструментов")
  public Integer getAnmount() {
    return anmount;
  }

  public void setAnmount(Integer anmount) {
    this.anmount = anmount;
  }

  public Instrument vaue(BigDecimal vaue) {
    this.vaue = vaue;
    return this;
  }

   /**
   * Оценка
   * @return vaue
  **/
  @ApiModelProperty(value = "Оценка")
  public BigDecimal getVaue() {
    return vaue;
  }

  public void setVaue(BigDecimal vaue) {
    this.vaue = vaue;
  }

  public Instrument income(BigDecimal income) {
    this.income = income;
    return this;
  }

   /**
   * Доход
   * @return income
  **/
  @ApiModelProperty(value = "Доход")
  public BigDecimal getIncome() {
    return income;
  }

  public void setIncome(BigDecimal income) {
    this.income = income;
  }

  public Instrument percentgage(BigDecimal percentgage) {
    this.percentgage = percentgage;
    return this;
  }

   /**
   * Доля
   * @return percentgage
  **/
  @ApiModelProperty(value = "Доля")
  public BigDecimal getPercentgage() {
    return percentgage;
  }

  public void setPercentgage(BigDecimal percentgage) {
    this.percentgage = percentgage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instrument instrument = (Instrument) o;
    return Objects.equals(this.name, instrument.name) &&
        Objects.equals(this.logo, instrument.logo) &&
        Objects.equals(this.anmount, instrument.anmount) &&
        Objects.equals(this.vaue, instrument.vaue) &&
        Objects.equals(this.income, instrument.income) &&
        Objects.equals(this.percentgage, instrument.percentgage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, logo, anmount, vaue, income, percentgage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instrument {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    anmount: ").append(toIndentedString(anmount)).append("\n");
    sb.append("    vaue: ").append(toIndentedString(vaue)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    percentgage: ").append(toIndentedString(percentgage)).append("\n");
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

