package com.healthMonitor.fall2020.dto;



import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ruixi Li
 */
@Data
public class CommResponse implements Serializable {
    public int code=1;
    public String msg="";
    public Map data=new HashMap();


}
