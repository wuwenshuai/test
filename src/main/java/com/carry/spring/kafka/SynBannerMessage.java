package com.carry.spring.kafka;

import lombok.Data;
import java.io.Serializable;

@Data
public class SynBannerMessage implements Serializable {

  private String msg;
}
