package com.carry.测试;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Data
@ToString
@EqualsAndHashCode
public class OwnershipVerificationSettingDto extends SettingDto implements Serializable {

    private static final long serialVersionUID = -4738012329901685271L;

    private String ownershipVerificationType;

    private String ownershipVerificationField;

    private Set<String> codeNameIds;

    private String key;
}
