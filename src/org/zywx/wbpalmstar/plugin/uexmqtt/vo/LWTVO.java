package org.zywx.wbpalmstar.plugin.uexmqtt.vo;

import java.io.Serializable;

/**
 * Created by ylt on 16/7/15.
 */

public class LWTVO implements Serializable {

    private static final long serialVersionUID = 3358146147654288900L;
    public boolean enable;

    public String topic;

    public int qos;

    public String data;

    public boolean retainFlag;

}
