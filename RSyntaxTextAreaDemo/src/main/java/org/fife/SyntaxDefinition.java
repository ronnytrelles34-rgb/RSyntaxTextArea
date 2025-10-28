package org.fife.ui.rsyntaxtextarea.demo;
import java.util.*;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rsyntaxtextarea.demo.SyntaxDefinition;
import java.io.BufferedReader;
import java.io.IOException;         
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
public class SyntaxDefinition {

    private String name;
    private String resource;
    private String style;

    public SyntaxDefinition(String name, String resource, String style) {
        this.name = name;
        this.resource = resource;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public String getResource() {
        return resource;
    }

    public String getStyle() {
        return style;
    }
}
