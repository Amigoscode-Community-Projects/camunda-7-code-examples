/*
 * Camunda Platform REST API
 * OpenApi Spec for Camunda Platform REST API.
 *
 * The version of the OpenAPI document: 7.16.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.camunda.consulting.openapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.camunda.consulting.openapi.client.model.ProcessInstanceModificationInstructionDto;
import com.camunda.consulting.openapi.client.model.VariableValueDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * StartProcessInstanceDto
 */
@JsonPropertyOrder({
  StartProcessInstanceDto.JSON_PROPERTY_BUSINESS_KEY,
  StartProcessInstanceDto.JSON_PROPERTY_VARIABLES,
  StartProcessInstanceDto.JSON_PROPERTY_CASE_INSTANCE_ID,
  StartProcessInstanceDto.JSON_PROPERTY_START_INSTRUCTIONS,
  StartProcessInstanceDto.JSON_PROPERTY_SKIP_CUSTOM_LISTENERS,
  StartProcessInstanceDto.JSON_PROPERTY_SKIP_IO_MAPPINGS,
  StartProcessInstanceDto.JSON_PROPERTY_WITH_VARIABLES_IN_RETURN
})
@JsonTypeName("StartProcessInstanceDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-19T11:53:20.948992+01:00[Europe/Berlin]")
public class StartProcessInstanceDto {
  public static final String JSON_PROPERTY_BUSINESS_KEY = "businessKey";
  private String businessKey;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private Map<String, VariableValueDto> variables = null;

  public static final String JSON_PROPERTY_CASE_INSTANCE_ID = "caseInstanceId";
  private String caseInstanceId;

  public static final String JSON_PROPERTY_START_INSTRUCTIONS = "startInstructions";
  private List<ProcessInstanceModificationInstructionDto> startInstructions = null;

  public static final String JSON_PROPERTY_SKIP_CUSTOM_LISTENERS = "skipCustomListeners";
  private Boolean skipCustomListeners;

  public static final String JSON_PROPERTY_SKIP_IO_MAPPINGS = "skipIoMappings";
  private Boolean skipIoMappings;

  public static final String JSON_PROPERTY_WITH_VARIABLES_IN_RETURN = "withVariablesInReturn";
  private Boolean withVariablesInReturn;


  public StartProcessInstanceDto businessKey(String businessKey) {
    
    this.businessKey = businessKey;
    return this;
  }

   /**
   * The business key of the process instance.
   * @return businessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The business key of the process instance.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessKey() {
    return businessKey;
  }


  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }


  public StartProcessInstanceDto variables(Map<String, VariableValueDto> variables) {
    
    this.variables = variables;
    return this;
  }

  public StartProcessInstanceDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }


  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }


  public StartProcessInstanceDto caseInstanceId(String caseInstanceId) {
    
    this.caseInstanceId = caseInstanceId;
    return this;
  }

   /**
   * The case instance id the process instance is to be initialized with.
   * @return caseInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The case instance id the process instance is to be initialized with.")
  @JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCaseInstanceId() {
    return caseInstanceId;
  }


  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }


  public StartProcessInstanceDto startInstructions(List<ProcessInstanceModificationInstructionDto> startInstructions) {
    
    this.startInstructions = startInstructions;
    return this;
  }

  public StartProcessInstanceDto addStartInstructionsItem(ProcessInstanceModificationInstructionDto startInstructionsItem) {
    if (this.startInstructions == null) {
      this.startInstructions = new ArrayList<>();
    }
    this.startInstructions.add(startInstructionsItem);
    return this;
  }

   /**
   * **Optional**. A JSON array of instructions that specify which activities to start the process instance at. If this property is omitted, the process instance starts at its default blank start event.
   * @return startInstructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Optional**. A JSON array of instructions that specify which activities to start the process instance at. If this property is omitted, the process instance starts at its default blank start event.")
  @JsonProperty(JSON_PROPERTY_START_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProcessInstanceModificationInstructionDto> getStartInstructions() {
    return startInstructions;
  }


  public void setStartInstructions(List<ProcessInstanceModificationInstructionDto> startInstructions) {
    this.startInstructions = startInstructions;
  }


  public StartProcessInstanceDto skipCustomListeners(Boolean skipCustomListeners) {
    
    this.skipCustomListeners = skipCustomListeners;
    return this;
  }

   /**
   * Skip execution listener invocation for activities that are started or ended as part of this request. **Note**: This option is currently only respected when start instructions are submitted via the &#x60;startInstructions&#x60; property.
   * @return skipCustomListeners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip execution listener invocation for activities that are started or ended as part of this request. **Note**: This option is currently only respected when start instructions are submitted via the `startInstructions` property.")
  @JsonProperty(JSON_PROPERTY_SKIP_CUSTOM_LISTENERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipCustomListeners() {
    return skipCustomListeners;
  }


  public void setSkipCustomListeners(Boolean skipCustomListeners) {
    this.skipCustomListeners = skipCustomListeners;
  }


  public StartProcessInstanceDto skipIoMappings(Boolean skipIoMappings) {
    
    this.skipIoMappings = skipIoMappings;
    return this;
  }

   /**
   * Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.16/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started or ended as part of this request. **Note**: This option is currently only respected when start instructions are submitted via the &#x60;startInstructions&#x60; property.
   * @return skipIoMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.16/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started or ended as part of this request. **Note**: This option is currently only respected when start instructions are submitted via the `startInstructions` property.")
  @JsonProperty(JSON_PROPERTY_SKIP_IO_MAPPINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipIoMappings() {
    return skipIoMappings;
  }


  public void setSkipIoMappings(Boolean skipIoMappings) {
    this.skipIoMappings = skipIoMappings;
  }


  public StartProcessInstanceDto withVariablesInReturn(Boolean withVariablesInReturn) {
    
    this.withVariablesInReturn = withVariablesInReturn;
    return this;
  }

   /**
   * Indicates if the variables, which was used by the process instance during execution, should be returned. Default value: &#x60;false&#x60;
   * @return withVariablesInReturn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the variables, which was used by the process instance during execution, should be returned. Default value: `false`")
  @JsonProperty(JSON_PROPERTY_WITH_VARIABLES_IN_RETURN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWithVariablesInReturn() {
    return withVariablesInReturn;
  }


  public void setWithVariablesInReturn(Boolean withVariablesInReturn) {
    this.withVariablesInReturn = withVariablesInReturn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartProcessInstanceDto startProcessInstanceDto = (StartProcessInstanceDto) o;
    return Objects.equals(this.businessKey, startProcessInstanceDto.businessKey) &&
        Objects.equals(this.variables, startProcessInstanceDto.variables) &&
        Objects.equals(this.caseInstanceId, startProcessInstanceDto.caseInstanceId) &&
        Objects.equals(this.startInstructions, startProcessInstanceDto.startInstructions) &&
        Objects.equals(this.skipCustomListeners, startProcessInstanceDto.skipCustomListeners) &&
        Objects.equals(this.skipIoMappings, startProcessInstanceDto.skipIoMappings) &&
        Objects.equals(this.withVariablesInReturn, startProcessInstanceDto.withVariablesInReturn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessKey, variables, caseInstanceId, startInstructions, skipCustomListeners, skipIoMappings, withVariablesInReturn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartProcessInstanceDto {\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    startInstructions: ").append(toIndentedString(startInstructions)).append("\n");
    sb.append("    skipCustomListeners: ").append(toIndentedString(skipCustomListeners)).append("\n");
    sb.append("    skipIoMappings: ").append(toIndentedString(skipIoMappings)).append("\n");
    sb.append("    withVariablesInReturn: ").append(toIndentedString(withVariablesInReturn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
