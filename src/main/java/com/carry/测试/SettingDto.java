package com.carry.测试;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class SettingDto implements Serializable {

  private static final long serialVersionUID = 614108557057048500L;

  private String ownershipVerificationType;

  private String ownershipVerificationField;

  private Set<String> codeNameIds;
  
  private String key;
}