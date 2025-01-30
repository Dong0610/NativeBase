package com.dong.nativelibrary.svg;

public class CSS extends CSSBase {
    private CSS(String css)
    {
        super(css);
    }

    public static CSS getFromString(String css)
    {
        return new CSS(css);
    }
}
