package com.carry.spring.kafka;

import java.io.Serializable;
import lombok.Data;

@Data
@SuppressWarnings("serial")
public class MessageWrapper<T extends Serializable> implements Serializable {
  private T data;
  private String uuid;
}