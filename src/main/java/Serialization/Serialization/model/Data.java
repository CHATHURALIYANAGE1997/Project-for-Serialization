package Serialization.Serialization.model;

import java.io.Serializable;

public class Data implements Serializable {

    //Use for deserialize
    private  static final long serialVersionUID=1L;
    public int a;
    public String b;

    public Data(int a, String b)
    {
        this.a = a;
        this.b = b;
    }
}
